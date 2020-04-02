import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author ：chenxin
 * @date ：Created in 2020/3/28 12:20
 * @description：
 * @modified By：
 * @version: $
 */
public class Maintest {


    public static void main(String[] args) throws MalformedURLException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        final URL resource = Maintest.class.getResource("");
        System.out.println(resource);

        int offset = Maintest.class.getResource("/").getPath().length();

        Queue<File> files = new LinkedList<>();
        files.add(new File(resource.getFile()));
        List<Object> beans = new ArrayList<>();

        while (!files.isEmpty()) {
            File tmp = files.poll();
            for (File f : tmp.listFiles()) {
                if (f.isDirectory()) {
                    files.add(f);
                } else {
                    if (f.getName().endsWith(".class")) {

                        String clsName = f.toURI().toURL().getPath().substring(offset).replaceAll("/", ".").replace(".class", "");
                        System.out.println(clsName);
                        final Class<?> aClass = Maintest.class.getClassLoader().loadClass(clsName);
                        if (!aClass.isInterface()) {
                            beans.add(aClass.getConstructor().newInstance());
                        }
                    }
                }
            }
        }

        System.out.println(offset);
        System.out.println();
    }
}
