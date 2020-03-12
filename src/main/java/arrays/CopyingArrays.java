package arrays;

import java.util.Arrays;

public class CopyingArrays {
    public static void main(String[] args) {
        int[] i = new int[7];
        int[] j = new int[10];
        Arrays.fill(i, 9);
        Arrays.fill(j, 17);
        System.arraycopy(i, 0, j, 1, i.length);
        System.out.println(Arrays.toString(i));
        System.out.println(Arrays.toString(j));
    }
}
