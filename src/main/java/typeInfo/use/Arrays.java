package typeInfo.use;

import java.lang.reflect.Array;

/**
 * 数组扩容
 *
 * @author ：chenxin
 * @date ：Created in 2020/3/23 15:45
 * @description：数组扩容
 * @modified By：
 * @version: $
 */
public class Arrays {

    /**
     * 数组扩容（任意类型）
     *
     * @param oldArray  原数组
     * @param newLength 扩容后的数组长度
     * @return java.lang.Object 扩容后得数组
     * @author chenxin
     * @date 2020/3/23 15:59
     * @version 1.0
     **/
    public static Object goodCopy(Object oldArray, int newLength) {
        //获取数组的Class
        Class aClass = oldArray.getClass();
        //获取数组的单个元素的类型
        Class componentType = aClass.getComponentType();
        //旧数组的长度
        int oldLength = Array.getLength(oldArray);
        //生成新数组
        Object newArray = Array.newInstance(componentType, newLength);
        //将旧数组的值复制到新数组
        System.arraycopy(oldArray, 0, newArray, 0, oldLength);
        return newArray;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4};
        int[] b = (int[]) goodCopy(a, 10);
        System.out.println(java.util.Arrays.toString(b));
        System.out.println();
    }
}
