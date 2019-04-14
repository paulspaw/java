/*
 * @Description: return fucntion
 * @Author: Peng LIU
 * @LastEditors: Peng LIU
 * @Date: 2019-03-26 15:42:31
 * @LastEditTime: 2019-03-26 15:51:07
 */
public class FuncReturn {
    public static void main(String[] args) {
        System.out.println(isLeapYear(2019));
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        }
        return false;
    }

    public static void print() {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                return;
            }
        }
    }

}