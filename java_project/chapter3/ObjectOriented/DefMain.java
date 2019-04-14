
/*
 * @Description: main方法的分析
 * @Author: Peng LIU
 * @LastEditors: Peng LIU
 * @Date: 2019-03-27 21:06:09
 * @LastEditTime: 2019-03-28 22:46:59
 */
public class DefMain {
    public static void main(String[] args) {
        System.out.println(args.length);
        for (String s : args) {
            System.out.println(s);
        }
    }
}