
/*
 * @Description: 
 * @Author: Peng LIU
 * @LastEditors: Peng LIU
 * @Date: 2019-03-25 20:21:33
 * @LastEditTime: 2019-03-25 20:28:05
 */
import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input a day");
        int day = input.nextInt();
        input.close();
        System.out.println("week is:\t" + (day / 7 + 1));
        System.out.println("rest days of this week are:\t" + (day % 7));
    }
}