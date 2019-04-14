/*
 * @Description: bubble sort algorithm
 * @Author: Peng LIU
 * @LastEditors: Peng LIU
 * @Date: 2019-03-26 16:45:00
 * @LastEditTime: 2019-03-26 17:05:35
 */

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 3, 54, 56, 17, 90, 65 };
        int[] result = sortByBubble(arr);
        for (int n : result) {
            System.out.print(n + " ");
        }
    }

    public static int[] sortByBubble(int[] arr) {
        // 外循环控制轮数
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < (arr.length - 1 - i); j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j] + arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j + 1];
                }
            }
        }
        return arr;
    }
}
