/*
 * @Description: branch staement if, 
 * @Author: Peng LIU
 * @LastEditors: Peng LIU
 * @Date: 2019-03-25 21:45:30
 * @LastEditTime: 2019-03-25 22:00:15
 */
public class BranchStatementIf {
    public static void main(String[] args) {
        /**
         * @if(){...}else if(){...}else{}
         */
        char s = 'S';
        if (s >= 65 && s <= 90) {
            System.out.println("captial letter");
        } else {
            System.out.println("lowercase letter");
        }

        // 闰年
        int year = 2019;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("闰年");
        } else {
            System.out.println("平年");
        }
    }
}