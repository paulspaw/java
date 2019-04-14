/*
 * @Description: final 关键字操作
 * @Author: Peng LIU
 * @LastEditors: Peng LIU
 * @Date: 2019-03-29 18:34:14
 * @LastEditTime: 2019-03-29 19:00:06
 */

public class DefFinal {
    public static void main(String[] args) {
        System.out.println(Constant.PERSON_NUM);
        System.out.println(Constant.WEEKDAYS);
        Constant s = new Constant();
        s.test(8);
    }
}

// 常量类：在实际项目开发中，通常用于定义项目中一些公共的，不变的数据
class Constant { // 单独定义一个类 -- 常量类（工具类）用于储存常量
    public static final int PERSON_NUM = 10; // 因为与对象没有关系，一般都会加static，public private根据情况添加
    public static final int WEEKDAYS = 5; // 工作日天数

    public final void print() { // final 方法
        System.out.println("我是final方法");
    }

    public void test(final int size) { // 参数final
        // size++; //不能改变被final修饰的参数
        System.out.println(size);
    }
}
