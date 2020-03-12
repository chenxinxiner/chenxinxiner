package annotation;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author 10745
 * @date 2020/3/11 22:00
 **/
public class UserCaseTrancker {
    public static void tranckUserCases(List<Integer> userCases, Class<?> c1) {
        for (Method m : c1.getDeclaredMethods()) {
            UserCase uc = m.getAnnotation(UserCase.class);
            if (uc != null) {
                System.out.println("Found Use Case : " + uc.id() + " " + uc.description());
                userCases.remove(new Integer(uc.id()));
            }
        }

        for (int i : userCases) {
            System.out.println("Warning : Missing use case-" + i);
        }
    }

    public static void main(String[] args) {
        List<Integer> useCase = new ArrayList<Integer>();
        Collections.addAll(useCase, 47, 48, 49, 50);
        tranckUserCases(useCase, PasswordUtils.class);
    }
}
