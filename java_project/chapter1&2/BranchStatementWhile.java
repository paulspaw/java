/*
 * @Description: while statement
 * 
 * @Author: Peng LIU
 * 
 * @LastEditors: Peng LIU
 * 
 * @Date: 2019-03-26 13:20:54
 * 
 * @LastEditTime: 2019-03-26 13:45:35
 */

/*
 * @while(statement){}
 */
public class BranchStatementWhile {
    public static void main(String[] args) {
        // q1.sum 1 to 100 = 5050
        System.out.println("q1.sum 1 to 100 = 5050");
        int i = 1;
        int sum = 0;
        while (100 >= i) {
            sum += i;
            i++;
        }
        System.out.println(sum);

        // q2. calculate 10!
        int fac = 1;
        int j = 10;
        while (0 < j) {
            fac *= j;
            j--;
        }
        System.out.println("10! = " + fac);

        // q3. print odd, even and multiple of 3 from 1 tp 100
        int num = 1;
        while (100 >= num) {
            switch (num % 2) {
            case 0:
                System.out.println("even is " + num);
                break;
            default:
                System.out.println("odd is " + num);
                break;
            }
            num++;
        }

    }
}