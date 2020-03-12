package genericity.erasure;

/**
 * 工厂对象创建实例
 *
 * @author 10745
 * @date 2020/2/27 15:12
 **/
class ClassAsFactory<T> {
    T x;

    public ClassAsFactory(Class<T> kind) {
        try {
            x = kind.newInstance();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}

class Employee {
}

public class InstantiateGenericType {
    public static void main(String[] args) {
        ClassAsFactory<Employee> employeeClassAsFactory = new ClassAsFactory<Employee>(Employee.class);
        System.out.println("ClassAsFactoryType<Emplyee> seucceeded");
        try {
            final ClassAsFactory<Integer> integerClassAsFactory = new ClassAsFactory<Integer>(Integer.class);
        } catch (Exception e) {
            System.out.println("ClassAsFactoryType<Integer> failed");
        }
    }
}

