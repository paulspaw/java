/*
 * @Description: isosceles triangle
 * @Author: Peng LIU
 * @LastEditors: Peng LIU
 * @Date: 2019-03-26 15:13:13
 * @LastEditTime: 2019-03-26 15:19:50
 */

public class IsoscelesTriangle {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            // print blanks
            for (int j = i; j < 5; j++) {
                System.out.print(" "); // left blanks of star
            }
            // print "*"
            for (int j = 0; j < (i * 2 - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}