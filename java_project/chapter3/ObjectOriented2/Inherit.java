/*
 * @Description: 继承概念
 * @Author: Peng LIU
 * @LastEditors: Peng LIU
 * @Date: 2019-03-28 22:45:29
 * @LastEditTime: 2019-03-29 14:36:03
 */

public class Inherit {
    public static void main(String[] args) {
        HomeDog homeDog = new HomeDog();
        homeDog.print();
        System.out.println("-------------------");
        HomeDog homeDog2 = new HomeDog("猪猪");
        homeDog2.print();
        homeDog2.eat();
        System.out.println("-------------------");
        HuskyDog huskyDog = new HuskyDog();
        huskyDog.show();
        huskyDog.eat();

    }
}

class Dog {
    protected String name;
    private String sex; // private修饰符的属性和方法不能被继承

    public Dog() { // 父类构造方法也会被执行
        System.out.println("Dog's 无参 method");
    }

    public Dog(String name, String sex) {
        this.name = name;
        this.sex = sex;
        System.out.println("父类有参构造方法");
    }

    public void eat() { // 重写该方法 和 异常声明
        System.out.println("eating");
    }
}

class HomeDog extends Dog {
    public HomeDog() {
        System.out.println("HomeDog's method");
    }

    public HomeDog(String name) {
        super(name, "male"); // "male" 也要写，因为父类中sex属性出现在构造方法中
        System.out.println("子类有参");
    }

    @Override
    public void eat() { // 重写
        super.eat(); // 调用父类方法
        // try {
        System.out.println(name + " like eating bones");
        // } catch (Exception e) {
        // System.out.println("Got a Exception：");
        // throw e;
        // }
    }

    protected void print() {
        System.out.println(super.name + " a home dog");
    }
}

class HuskyDog extends Dog {
    public HuskyDog() {
        super("哈士奇", "male");
        System.out.println(name + " 的 无参数构造方法");
    }

    @Override
    public void eat() {
        System.out.println(name + " likes eating chicken livers");
    }

    public void show() {
        System.out.println(name + " dirty the whole room");
    }
}