package enumStudy;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Set;
import java.util.TreeSet;

enum Explore {HERE, THERE}

public class Refection {
    public static Set<String> analyze(Class<?> enumClass) {
        System.out.println("-------- Analyzing " + enumClass + "--------");
        System.out.println("Interfaces");
        for (Type t : enumClass.getGenericInterfaces()) {
            System.out.println(t);
        }
        System.out.println("Base: " + enumClass.getSuperclass());
        System.out.println("Methods: ");
        Set<String> methods = new TreeSet<String>();
        for (Method method : enumClass.getMethods()) {
            methods.add(method.getName());
        }
        System.out.println(methods);
        return methods;
    }

    public static void main(String[] args) {
        Set<String> exporeMethods = analyze(Explore.class);
        Set<String> enumMethods = analyze(Enum.class);
        System.out.println("Explore.contaionsAll(Enum)? " + exporeMethods.containsAll(enumMethods));
        System.out.println("Explore.contaionsAll(Enum):");
        exporeMethods.removeAll(enumMethods);
        System.out.println(exporeMethods);
    }

}
