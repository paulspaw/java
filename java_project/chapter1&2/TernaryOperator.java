/*
 * @Description: ternary operator -> (x ? y : z)
 * @Author: Peng LIU
 * @LastEditors: Peng LIU
 * @Date: 2019-03-25 21:23:12
 * @LastEditTime: 2019-03-25 21:28:18
 */

public class TernaryOperator {
    public static void main(String[] args) {
        int score = 50;
        // x ? y : z
        // x -> 运算
        // true 返回 y， flase 返回 z
        boolean bool = score >= 60 ? true : false;
        String s = score >= 60 ? "及格" : "挂科";
        System.out.println(bool);
        System.out.println(s);
    }
}