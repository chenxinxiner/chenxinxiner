package IO;

import java.io.*;
import java.lang.reflect.Constructor;

public class SerializationNewObject {
    public static void main(String[] args) throws Exception {
        A o = new A(1);
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data.obj"));
        out.writeObject(o);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("data.obj"));
        A o1 = (A) in.readObject();
        o1.printI();

        final Constructor<A> constructor = A.class.getConstructor();
        final A a = constructor.newInstance();

        A o2 = (A) Class.forName("A").newInstance();
        o2.printI();
        System.out.printf("");
    }
}

class A implements Serializable {
    int i = 0;

    A(int i) {
        this.i = i;
    }

    public void printI() {
        System.out.printf("i=" + i);
    }
}