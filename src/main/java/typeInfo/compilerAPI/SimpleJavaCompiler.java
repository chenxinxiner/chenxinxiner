package typeInfo.compilerAPI;

import javax.tools.DocumentationTool;
import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/**
 * java编译器API学习
 *
 * @author ：chenxin
 * @date ：Created in 2020/3/23 17:19
 * @description：java编译器API学习
 * @modified By：
 * @version: $
 */
public class SimpleJavaCompiler {

    public static void main(String[] args) throws UnsupportedEncodingException {
        successCompile();
        fildComplie();
    }

    public static void successCompile() {
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        int result = compiler.run(null, null, null, "E:\\temp\\Hello.java", "E:\\temp\\Hello2.java");
        System.out.println(result == 0 ? "success" : "fail");

    }

    public static void fildComplie() throws UnsupportedEncodingException {
        ByteArrayOutputStream err = new ByteArrayOutputStream();
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        int result = compiler.run(null, null, err, "E:\\temp\\Hello3.java");
        if (result == 0) {
            System.out.println("success");
        } else {
            System.out.println(new String(err.toByteArray(), Charset.defaultCharset().toString()));
        }
    }
}
