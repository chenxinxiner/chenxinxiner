package annotation;

/**
 * @author 10745
 * @date 2020/3/11 20:41
 **/
public class Testable {

    public void execute() {
        System.out.println("Executing..");
    }

    @Test
    void testExecute() {
        execute();
    }
}
