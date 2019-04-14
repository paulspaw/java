/*
 * @Description: mutiple array
 * @Author: Peng LIU
 * @LastEditors: Peng LIU
 * @Date: 2019-03-26 16:15:04
 * @LastEditTime: 2019-03-26 16:29:59
 */

public class twoDArray {
    public static void main(String[] args) {
        avgClass();
    }

    public static void avgClass() {
        int[][] socres = { { 88, 98, 76 }, { 45, 130, 43 }, { 77, 79, 90 } };
        int classLen = socres.length;
        for (int i = 0; i < classLen; i++) {
            int sumClass = 0;
            for (int j = 0; j < socres[i].length; j++) {
                sumClass += socres[i][j];
            }
            System.out.println("class " + (i + 1) + "\'s average is " + (sumClass / socres[i].length));
        }
    }
}