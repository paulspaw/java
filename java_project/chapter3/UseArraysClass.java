
/*
 * @Description: 
 * @Author: Peng LIU
 * @LastEditors: Peng LIU
 * @Date: 2019-03-26 21:08:03
 * @LastEditTime: 2019-03-26 21:45:56
 */
import java.util.Arrays;

public class UseArraysClass {
    // 二分查找法 Array类
    public static int binary(int[] arr, int key) {
        int[] newArr = sortArray(arr);
        // array to string
        printArray(newArr);
        int index = Arrays.binarySearch(newArr, key);
        return index;
    }

    // 输出数组
    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    // 排序 - 快速排序
    public static int[] sortArray(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    // 数组复制
    // 效率由高到低 System.arraycopy -> Arrays.copyOf -> for
    // Arrays.copyOf
    public static int[] copyArray(int[] arr) {
        int[] newArr = Arrays.copyOf(arr, 10);
        return newArr;
    }

    // System.arraycopy
    public static int[] systemCopy(int[] arr) {
        // System.arraycopy(原数组, 原数组的起始位置, 新数组, 新数组的其实位置, 要求的数组长度);
        int[] newArr = new int[arr.length];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        return newArr;
    }

    public static void main(String[] args) {
        int arr[] = { 45, 43, 212, 65, 23, 47, 3, 44 };
        int index = binary(arr, 45);
        System.err.println(45 + "'s index is " + index);
        int[] cpArr = copyArray(arr);
        System.out.println(Arrays.toString(cpArr));
        int[] cpArr2 = systemCopy(arr);
        System.out.println(Arrays.toString(cpArr2));
    }
}