/*
 * @Description: array 数组都要有长度
 * @Author: Peng LIU
 * @LastEditors: Peng LIU
 * @Date: 2019-03-26 16:00:02
 * @LastEditTime: 2019-03-26 16:12:38
 */
public class DefArray {
    public static void main(String[] args) {
        // 格式1: 数组元素类型[] 数组名 = new 数组元素类型[数组长度]
        int[] arr = new int[50];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        System.out.println(arr[49]);
        // 格式2: 先声明
        int[] arr2;
        arr2 = new int[5];

        // 格式3:
        int[] arr3 = new int[] { 1, 2, 3, 4, 5 };
        System.out.println(arr3.length);

        // 格式4:
        int[] arr4 = { 1, 2, 3, 4, 5 };
    }
}