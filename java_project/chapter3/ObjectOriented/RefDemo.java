
/*
 * @Description: 
 * @Author: Peng LIU
 * @LastEditors: Peng LIU
 * @Date: 2019-03-27 17:38:35
 * @LastEditTime: 2019-03-28 22:50:24
 */

public class RefDemo {
    public static void main(String[] args) {
        Duck d = new Duck(); // d在栈存了地址 指向堆内存（里面存了value）
        method(d);
        System.out.println("Duck age = " + d.age);
    }

    public static void method(Duck duck) {
        duck.age = 5;
    }
}

class Duck {
    int age = 1;
}