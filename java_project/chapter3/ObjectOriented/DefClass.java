
/*
 * @Description: example of "what is a class"
 * @Author: Peng LIU
 * @LastEditors: Peng LIU
 * @Date: 2019-03-27 12:49:52
 * @LastEditTime: 2019-03-28 22:46:51
 */

public class DefClass {
    public static void main(String[] args) {
        Horse h = null; // 声明一个类的变量（除了八种基本数据类型以外，都是引用数据类型，包括数组）

        h = new Horse();// 实例化对象
        // 有了对象可以调用对象的属性和方法
        h.name = "Redrebbit";
        h.age = 358;
        h.situation(); // 调用方法
        h.eat();

        // 匿名对象:只能用一次，用完后该对象就会被释放
        new Horse().eat();

        h = null; // 把对象 h 释放
        // 当对象不存在时，调用该对象就会报错

        // ----------------------
        Horse h1 = null;
        Horse h2 = null;
        h1 = new Horse();
        h1.name = "white";
        h1.age = 15;

        h2 = h1;// 对象之间的赋值， 相同类型才可以赋值 这两者h1,h2有相同的地址
        h2.name = "black";
        System.out.println(h1.name);
        h1 = null;
        h2 = null;
    }
}

// 定义一个类（引用类型）
class Horse {
    // 在类中定义属性（特征）
    String name; // 字符串是引用类型变量，不是基本数据类型变量
    int age;

    public void situation() {
        System.out.println("I am " + name + ",and " + age + " years old");
    }

    public void eat() {
        System.out.println("I eat ling-grass");
    }
}