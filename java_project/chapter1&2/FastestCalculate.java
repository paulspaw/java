/**
 * @ 使用位移的方法是最快的
 * 
 * @左移算法： 位移数作为2的次幂与操作数想乘 10<<2 == 10 * 4
 * 
 * @友谊算法： 操作数除以位移数的2次幂
 * 
 * @ 40 >> 2 == 40 / 4 == 10
 */
public class FastestCalculate {
    public static void main(String[] args) {
        // calculate 8 * 4
        System.out.println(8 << 2);
        // calculate 8 * 8
        System.err.println(8 << 3);
    }
}