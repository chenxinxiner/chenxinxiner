package classLoader;

/**
 * 测试使用-Xbootclasspath:/a 参数修改类的加载级别
 *
 * @author ：chenxin
 * @date ：Created in 2020/3/25 15:40
 * @description：测试使用-Xbootclasspath:/a 参数修改类的加载级别
 * @modified By：
 * @version: $
 */
public class Worke {

    public void say() {
        System.out.println("load by AppClassLoader");
        final ClassLoader classLoader = ClassLoaderTree.class.getClassLoader();
        if (classLoader == null) {
            System.out.println("load by BootstrapClassLoader readly");
        } else {
            System.out.println(classLoader.getClass().getName());
        }
    }
}
