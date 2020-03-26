package classLoader;

/**
 * 类加载器树
 *
 * @author ：chenxin
 * @date ：Created in 2020/3/25 15:20
 * @description：类加载器树
 * @modified By：
 * @version: $
 */
public class ClassLoaderTree {
    public static void main(String[] args) {
        ClassLoader classLoader = ClassLoaderTree.class.getClassLoader();
        while (classLoader != null) {
            System.out.println(classLoader.getClass().getName());
            classLoader = classLoader.getParent();
        }

        if (classLoader == null) {
            System.out.println("BootstrapLoader is implemented by C");
        }
    }
}
