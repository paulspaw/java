/*
 * @Description: switch
 * @Author: Peng LIU
 * @LastEditors: Peng LIU
 * @Date: 2019-03-25 22:00:33
 * @LastEditTime: 2019-03-25 22:09:07
 */

public class BranchStatementSwitch {
    public static void main(String[] args) {
        /*
         * switch(){ case value1: statement1; break; case value2: statement2; break; ...
         * default: statement n+1; break; }
         */
        int day = 6;
        switch (day) {
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tue");
            break;
        case 3:
            System.out.println("Wed");
            break;
        case 4:
            System.out.println("Thur");
            break;
        case 5:
            System.out.println("Fri");
            break;
        default:
            System.out.println("Weekends");
            break;
        }
    }
}