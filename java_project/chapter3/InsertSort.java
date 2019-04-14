/*
 * @Description:  insertion sort algorithm
 * @Author: Peng LIU
 * @LastEditors: Peng LIU
 * @Date: 2019-03-26 17:24:41
 * @LastEditTime: 2019-03-26 20:37:48
 */
public class InsertSort {
    /*
     * @从后往前插
     * 
     * @index = i 挨个往前比
     */
    public static int[] sortInsert(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int j = 0;
            for (j = i - 1; j >= 0; j--) {
                if (arr[j] > temp) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            if (arr[j + 1] != temp) {
                arr[j + 1] = temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 56, 34, 4, 17, 90, 65 };
        int[] result = sortInsert(arr);
        for (int n : result) {
            System.out.print(n + " ");
        }
    }
}