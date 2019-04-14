
/*
 * @Description: 二分查找法： 必须为有序数组。通过将待查找元素与中间索引值对应的元素比较，
 * 若大于中间元素，去右半部分继续查找，否则为左半部分，直到找到数值，找不到返回-1
 * 
 * @Author: Peng LIU
 * 
 * @LastEditors: Peng LIU
 * 
 * @Date: 2019-03-26 20:40:15
 * 
 * @LastEditTime: 2019-03-26 21:16:37
 */

public class BinarySearch {
    public static int binarySearchMethod(int[] arr, int key) {
        int[] newArr = BubbleSort.sortByBubble(arr);
        for (int n : newArr) {
            System.out.print(n + " ");
        }
        System.out.println();

        int start = 0;
        int end = newArr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            // int mind = (start = end) >>> 1
            if (newArr[mid] > key) {
                end = mid - 1;
            } else if (newArr[mid] < key) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 21, 4, 65, 12, 10, 46, 79, 88, 66 };
        // 排序 arr
        // 折半查找（二分法）
        int result = binarySearchMethod(arr, 88);
        System.out.println("index is " + (result - 1));
    }
}
