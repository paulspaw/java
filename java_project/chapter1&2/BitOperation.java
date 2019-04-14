
/*
 * @Description: bit operation
 * @Author: Peng LIU
 * @LastEditors: Peng LIU
 * @Date: 2019-03-25 20:35:51
 * @LastEditTime: 2019-03-27 22:03:59
 */

public class BitOperation {
    public static void main(String[] args) {
        // 按位取反 ～
        System.out.println(~10);
        // 0000 1010 -> 10
        // 1111 0101 -> -11

        // 按位与 &
        // 有 0 则 0

        // 按位或 |
        // 有 1 则 1

        // 按位异或 ^
        // 相同为 0， 不同为 1

        // 位移运算
        // 左移 “a << b”
        // 将二进制的 a 逐位左移 b 位，最低位空出的 b 位补 0

        // 0000 1010 (10) -> 0010 1000 -
        System.out.println(10 << 2);
        String binStr = Integer.toBinaryString(40);
        System.out.println(binStr);

        // 带符号右移 “a >> b”
        // 将二进制的 a 逐位右移 b 位，最高位空出的 b 位补原来的符号位
        System.out.println(-10 >> 2);
        // 无符号右移 “a >>> b”
        // 将二进制的 a 逐位右移 b 位，最高位空出的 b 位补 0
        System.out.println(-10 >>> 2);

    }
}