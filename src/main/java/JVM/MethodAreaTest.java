package JVM;

import typeInfo.compilerAPI.JavaCompilerTask;

/**
 * 方法区测试
 * jdk1.7及以前 永久区（Perm）,-XX:PermSize  ,-XX:MaxPermSize
 * jdk1.8及以后，元数据区，-XX:MetaspaceSize,-XX:MaxMetaspaceSize
 *
 * @author ：chenxin
 * @date ：Created in 2020/3/26 13:36
 * @description：方法区测试
 * @modified By：
 * @version: $
 */
public class MethodAreaTest {
    public static void main(String[] args) {
        new MethodAreaTest().loadClass();
    }

    void loadClass() {
        String className = "Hello";
        for (int i = 0; i < 10000; i++) {
            String realName = className + i;
            System.out.println(i);
            StringBuilder s = new StringBuilder();
            s.append("public class " + realName + "{\n");
            s.append("public static void main(String[] args){\n");
            s.append("System.out.println(\"Hello World\");\n");
            s.append("}\n");
            s.append("}");
            Class<?> compile = JavaCompilerTask.compile(realName, s.toString());
        }
    }


}
