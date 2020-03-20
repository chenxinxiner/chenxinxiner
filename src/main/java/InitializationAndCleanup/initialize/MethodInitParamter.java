package InitializationAndCleanup.initialize;

/**
 * 参数调用方法初始化
 *
 * @author ：chenxin
 * @date ：Created in 2020-03-19 14:58
 * @description：参数调用方法初始化
 * @modified By：
 * @version: $
 */
public class MethodInitParamter {
    int i = f();

    int f() {
        return 10;
    }
}

class MethodIni2 {
    int i = f();

    int k = g(i);

    int f() {
        return 10;
    }

    int g(int n) {
        return 10 * n;
    }
}


class MethodIni3 {
    // int k = g(i);

    int i = f();

    int f() {
        return 10;
    }

    int g(int n) {
        return 10 * n;
    }
}
