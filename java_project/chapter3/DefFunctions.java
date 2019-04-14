/*
 * @Description: defination of function
 * @Author: Peng LIU
 * @LastEditors: Peng LIU
 * @Date: 2019-03-26 15:22:44
 * @LastEditTime: 2019-03-26 15:38:13
 */
/**
 * @访问权限修饰符 public - 共有的
 * @静态修饰符 static - 描述的方法可以直接调用
 * @返回值 void（无返回值）
 * @gerMenu 方法名
 */
public class DefFunctions {
    public static void main(String[] args) {
        getMenu();
        // @实参：在调用方法时传入的参数 - num
        int num = 10;
        printStar(num);

    }

    // getMenu()方法
    public static void getMenu() {
        System.out.println("---Menu---");
    }

    // print star tower
    /**
     * @带参数的方法 printStar()
     * @形参：方法定义时的参数 - line
     */
    public static void printStar(int line) {
        for (int i = 1; i <= line; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}