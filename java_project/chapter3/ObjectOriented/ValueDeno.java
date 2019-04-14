
/*
 * @Description: examples about Value transfer(值传递)
 * @Author: Peng LIU
 * @LastEditors: Peng LIU
 * @Date: 2019-03-27 17:30:06
 * @LastEditTime: 2019-03-28 22:51:03
 */
public class ValueDeno {
    public static void main(String[] args) {

        int x = 10; // 在栈内存
        method(x);
        System.out.println("x = " + x);
    }

    public static void method(int mx) {
        mx = 20;
    }
}