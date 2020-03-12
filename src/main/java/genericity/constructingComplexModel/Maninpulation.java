package genericity.constructingComplexModel;

/**
 * @author 10745
 * @date 2020/2/23 10:47
 **/
public class Maninpulation {
    public void f() {

    }
}

//需给泛型类一个边界，但是这样泛型却没有带来任何好处

class Maninpulation2<T extends Maninpulation> {
    T obj;

    void g() {
        obj.f();
    }
}



