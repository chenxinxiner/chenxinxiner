package genericity.erasure;

/**
 * @author 10745
 * @date 2020/2/27 15:23
 **/
public class FactoryConstraint {
    public static void main(String[] args) {
        new Foo2<Integer>(new IntegerFactory());
        new Foo2<Widget>(new Widget.Factory());
    }
}

interface FactoryI<T> {
    T creat();
}

class Foo2<T> {

    private T x;

    public <F extends FactoryI<T>> Foo2(F factory) {
        x = factory.creat();
    }
}

class Widget {
    public static class Factory implements FactoryI<Widget> {
        public Widget creat() {
            return new Widget();
        }
    }
}

class IntegerFactory implements FactoryI<Integer> {

    public Integer creat() {
        return new Integer(0);
    }
}