package JVM;

import java.util.ArrayList;

/**
 * 测试运行时修改堆大小
 * -Xms 初始堆值
 * -Xmx 最大堆值
 *
 * @author ：chenxin
 * @date ：Created in 2020/3/26 11:55
 * @description：测试运行时修改堆大小
 * @modified By：
 * @version: $
 */
public class TestEditHeapSize {
    public static void main(String[] args) {
        ArrayList<TestEditHeapSize> testEditHeapSizes = new ArrayList<>();
        while (true) {
            testEditHeapSizes.add(new TestEditHeapSize());
            System.out.println(testEditHeapSizes.size());
        }
    }
}