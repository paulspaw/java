/*
 * @Description: 接口
 * @Author: Peng LIU
 * @LastEditors: Peng LIU
 * @Date: 2019-03-29 19:28:49
 * @LastEditTime: 2019-03-29 20:25:09
 */

public class DefInterface {
    public static void main(String[] args) {
        Girl girl = new Girl("Mary");
        girl.sleep();
        girl.eat();
        girl.run();
    }
}

interface IEat {
    // public abstract void eat(); // 接口中只能定义抽象方法
    void eat(); // 简写 等于上面 接口值定义的方法没有声明修饰符，默认为public abstract

    // public static final int NUM = 10;
    int NUM = 10; // 在接口中定义一个常量

    public default void print() { // jdk1.8新特性，默认方法，可以被所有实现类继承
        System.out.println("eat");
    }
}

interface IRun {
    void run();
}

interface ISleep extends IEat, IRun { // 接口之间可以多继承
    void sleep();
}

// 具体类实现借口必须实现借口的所有方法
class Girl implements ISleep, IEat { // 再实现就被覆盖掉，所以没关系
    private String name;

    public Girl(String name) {
        this.name = name;
    }

    @Override
    public void sleep() {
        System.out.println("我爱睡觉");
    }

    @Override
    public void eat() {
        System.out.println(name + " like eat 猪蹄");
    }

    public void run() {
        System.out.println("不跑不行，ISleep继承了IRun");
    }

}