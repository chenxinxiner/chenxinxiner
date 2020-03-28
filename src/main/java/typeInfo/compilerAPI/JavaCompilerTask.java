package typeInfo.compilerAPI;

import javax.tools.*;
import java.io.File;
import java.lang.reflect.Method;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.List;

/**
 * @author ：chenxin
 * @date ：Created in 2020/3/23 17:34
 * @description：
 * @modified By：
 * @version: $
 */
public class JavaCompilerTask {

    public static void main(String[] args) {
        compileJavaFromString();
    }

    public static void compileJavaFromString() {
        StringBuilder s = new StringBuilder();
        String className = "Hello";
        s.append("public class Hello{\n");
        s.append("public static void main(String[] args){\n");
        s.append("System.out.println(\"Hello World\");\n");
        s.append("}\n");
        s.append("}");

        final Class<?> compile = compile(className, s.toString());
        try {
            Object o = compile.newInstance();
            Method main = compile.getMethod("main", String[].class);
            main.invoke(o, new Object[]{new String[]{}});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Class<?> compile(String className, String javaCodes) {
        JavaSourceFromString srcObject = new JavaSourceFromString(className, javaCodes);
        System.out.println(srcObject.getCode());
        List<JavaSourceFromString> javaSourceFromStrings = Arrays.asList(srcObject);

        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager standardFileManager = compiler.getStandardFileManager(null, null, null);
        final DiagnosticCollector<JavaFileObject> javaFileObjectDiagnosticCollector = new DiagnosticCollector<>();

        String flag = "-d";
        String outDir = "";

        try {
            File file = new File(Thread.currentThread().getContextClassLoader().getResource("").toURI());
            outDir = file.getAbsolutePath() + File.separator;
            System.out.println(outDir);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        final List<String> strings = Arrays.asList(flag, outDir);
        //JavaCompiler.getTask方法：以future的任务形式(多线程)，来执行编译任务

        // 第一个参数：额外输出流，null表示默认使用system.err
        // 第二个参数：文件管理器，null表示编译器标准文件管理器
        // 第三个参数：诊断监听器，null表示使用编译器默认方法来报告诊断信息
        // 第四个参数：编译器参数，null表示无参数
        // 第五个参数：需要经过annotation处理的类名，null表示没有类需要annotation处理
        // 第六个参数：待编译的类
        JavaCompiler.CompilationTask task = compiler.getTask(null, standardFileManager, javaFileObjectDiagnosticCollector, strings, null, javaSourceFromStrings);

        final Boolean result = task.call();
        if (result) {
            try {
                return Class.forName(className);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } else {
            //print the Diagnostic's information
            for (Diagnostic diagnostic : javaFileObjectDiagnosticCollector
                    .getDiagnostics()) {
                System.out.println("Error on line: "
                        + diagnostic.getLineNumber() + "; URI: "
                        + diagnostic.getSource().toString());
            }
        }


        return null;
    }
}
