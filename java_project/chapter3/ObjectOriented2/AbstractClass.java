/*
 * @Description: 抽象类：用abstract关键字声明的类叫做抽象类
 * @Author: Peng LIU
 * @LastEditors: Peng LIU
 * @Date: 2019-03-29 19:07:21
 * @LastEditTime: 2019-03-29 19:15:04
 */

public class AbstractClass {
    public static void main(String[] args) {
        Man man = new Man();
        man.move();
        man.eat();
        Women women = new Women();
        women.move();
        women.eat();

    }
}

abstract class Animal {
    public abstract void move(); // 方法的声明，抽象方法只有声明，没有实现
}

abstract class Person extends Animal {
    public abstract void eat();
}

// ⚠️继承抽象类的具体类必须实现所有抽象方法！
class Man extends Person {
    public void move() {
        System.out.println("I am Man, I like running");
    }

    @Override
    public void eat() {
        System.out.println("I am Man, I love meat");
    }
}

class Women extends Person {
    public void move() {
        System.out.println("Women,shopping");
    }

    @Override
    public void eat() {
        System.out.println("Women,fruit");
    }
}