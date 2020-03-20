package baseType;

/**
 * 基本类型大小、范围
 *
 * @author ：chenxin
 * @date ：Created in 2020-03-18 14:28
 * @description：基本类型大小、范围
 * @modified By：
 * @version: $
 */
public class BaseTypeSize {
    char c;
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    boolean bo;

    public void baseTypesSzie() {
        System.out.println("byte 的大小" + Byte.SIZE + ";默认值为：" + b + " ;byte的最小值：" + Byte.MIN_VALUE + " ;byte的最大值：" + Byte.MAX_VALUE);
        System.out.println("short 的大小" + Short.SIZE + ";默认值为：" + s + " ;short的最小值：" + Short.MIN_VALUE + " ;short的最大值：" + Short.MAX_VALUE);
        System.out.println("int 的大小" + Integer.SIZE + ";默认值为：" + i + " ;int的最小值：" + Integer.MIN_VALUE + " ;int的最大值：" + Integer.MAX_VALUE);
        System.out.println("float 的大小" + Float.SIZE + ";默认值为：" + f + " ;float的最小值：" + Float.MIN_VALUE + " ;float的最大值：" + Float.MAX_VALUE + ", 单精度浮点数");
        System.out.println("long 的大小" + Long.SIZE + ";默认值为：" + i + " ;long的最小值：" + Long.MIN_VALUE + " ;long的最大值：" + Long.MAX_VALUE);
        System.out.println("double 的大小" + Double.SIZE + ";默认值为：" + d + " ;double的最小值：" + Double.MIN_VALUE + " ;double的最大值：" + Double.MAX_VALUE + ", 双精度浮点数");
        System.out.println("char 的大小" + Character.SIZE + ";默认值为：" + c + " ;char的最小值：" + Character.MIN_VALUE + " ;char的最大值：" + Character.MAX_VALUE);
        System.out.println("boolean 的大小" + Byte.SIZE + ";默认值为：" + bo + " ;boolean的最小值：" + Byte.MIN_VALUE + " ;boolean的最大值：" + Byte.MAX_VALUE);

    }

    public static void main(String[] args) {
        new BaseTypeSize().baseTypesSzie();
    }
}
