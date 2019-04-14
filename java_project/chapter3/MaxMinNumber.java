/*
 * @Description: 
 * @Author: Peng LIU
 * @LastEditors: Peng LIU
 * @Date: 2019-03-26 16:30:53
 * @LastEditTime: 2019-03-26 16:42:30
 */

public class MaxMinNumber {
    public static void main(String[] args) {
        int[] num = { 1, 5, 3, 10, 3, 4, 9, 3, 1 };
        int maxNumber = findMax(num);
        System.out.println(maxNumber);
        int minNumber = findMin(num);
        System.err.println(minNumber);
    }

    public static int findMax(int[] num) {
        int len = num.length;
        int tmp = num[0];
        for (int i = 1; i < len; i++) {
            tmp = tmp > num[i] ? tmp : num[i];
        }
        return tmp;
    }

    public static int findMin(int[] num) {
        int len = num.length;
        int tmp = num[0];
        for (int i = 1; i < len; i++) {
            tmp = tmp < num[i] ? tmp : num[i];
        }
        return tmp;
    }
}