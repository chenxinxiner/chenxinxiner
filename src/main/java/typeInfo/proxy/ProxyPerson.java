package typeInfo.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * 代理Person
 *
 * @author ：chenxin
 * @date ：Created in 2020/3/17 20:58
 * @modified By：
 * @version: $
 */
public class ProxyPerson implements InvocationHandler {

    private Runable person;

    public ProxyPerson(Runable person) {
        this.person = person;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("增强");
        method.invoke(person, args);
        return null;
    }

    public static void main(String[] args) {
        Runable wn = new Woman();
        ProxyPerson proxyPerson = new ProxyPerson(wn);
        Runable o = (Runable) Proxy.newProxyInstance(Runable.class.getClassLoader(), new Class[]{Runable.class}, proxyPerson);
        o.run();
    }
}
