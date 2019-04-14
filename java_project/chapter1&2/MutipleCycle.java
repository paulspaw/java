
/*
 * @Description: print a star tower
 * @Author: Peng LIU
 * @LastEditors: Peng LIU
 * @Date: 2019-03-26 14:18:22
 * @LastEditTime: 2019-03-26 14:48:29
 */

public class MutipleCycle {
    public static void main(String[] args) {
        // star tower
        // 外循环控制行数
        for (int i = 1; i <= 5; i++) {
            // 内循环控制列数
            for (int j = 5; j > 0; j--) {
                if (j <= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // 九九乘法表
        for (int k = 1; k <= 9; k++) {
            for (int v = 1; v <= k; v++) {
                System.out.print(k + "x" + v + "=" + (k * v) + "\t");
            }
            System.out.println();
        }
    }
}