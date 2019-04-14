
/*
 * @Description: input 1 number and calculate the sum of every digit
 * @Author: Peng LIU
 * @LastEditors: Peng LIU
 * @Date: 2019-03-25 20:09:45
 * @LastEditTime: 2019-03-26 13:29:26
 */

public class SumANumber {
    public static void main(String[] args) {
        // command
        System.out.println("please input a 5 digits number:");
        System.out.println(54321);
        int num = 54321;
        int i = 5;
        int sum = 0;
        while (1 <= i) {
            int digit = num % 10;
            num /= 10;
            sum += digit;
            i--;
        }
        System.out.println(sum);
    }
}