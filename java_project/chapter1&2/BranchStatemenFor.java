/*
 * @Description: for(int i=0;i<10;i++){...}
 * @Author: Peng LIU
 * @LastEditors: Peng LIU
 * @Date: 2019-03-26 14:06:12
 * @LastEditTime: 2019-03-26 14:17:23
 */
public class BranchStatemenFor {
    public static void main(String[] args) {
        // print first 10 of Fibonacci numbers
        int num1 = 1;
        int num2 = 1;
        System.out.println(num1 + "\n" + num2);
        for (int i = 3; i < 11; i++) {
            int next = num1 + num2;
            System.out.println(next);
            num1 = num2;
            num2 = next;
        }
    }
}
