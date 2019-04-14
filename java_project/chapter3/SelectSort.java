/*
 * @Description: selection sort algorithm
 * @Author: Peng LIU
 * @LastEditors: Peng LIU
 * @Date: 2019-03-26 17:06:27
 * @LastEditTime: 2019-03-26 17:24:12
 */
public class SelectSort {
    public static int[] sortBySelection(int[] arr) {
        int index = 0; // record minmal index of number
        for (int i = 0; i < arr.length - 1; i++) {
            index = i;// assume the fist element is minmize number
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[index] > arr[j]) {
                    index = j;
                }
            }
            // judge switched number is itself or not
            if (index != i) {
                arr[index] = arr[index] + arr[i];
                arr[i] = arr[index] - arr[i];
                arr[index] = arr[index] - arr[i];
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] num = { 34, 5, 56, 17, 90, 65 };
        int[] result = sortBySelection(num);
        for (int n : result) {
            System.out.print(n + " ");
        }
    }
}