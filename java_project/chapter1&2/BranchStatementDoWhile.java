/*
 * @Description: do{} while();
 * @Author: Peng LIU
 * @LastEditors: Peng LIU
 * @Date: 2019-03-26 13:46:20
 * @LastEditTime: 2019-03-26 13:49:11
 */
public class BranchStatementDoWhile {
    public static void main(String[] args) {
        int i = 10;
        // do execute first, then judge
        do {
            System.out.println(i);
            i--;
        } while (i >= 0);
        
    }
}