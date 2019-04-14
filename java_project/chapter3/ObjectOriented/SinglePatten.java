

/*
 * @Description: 单例设计模式
 * @Author: Peng LIU
 * @LastEditors: Peng LIU
 * @Date: 2019-03-27 21:43:24
 * @LastEditTime: 2019-03-28 22:50:53
 */

public class SinglePatten {
    public static void main(String[] args) {
        // 不合法的构造函数
        // 编译时错误：构造函数 SingletonHungry() 是不可见的
        // SingleObject object = new SingletonHungry();

        // 饿汉式
        // 获取唯一可用的对象
        SingletonHungry s = SingletonHungry.getInstance();// 获取实例对象
        // 显示消息
        s.print();
        // 懒汉式
        SingletonLazy s2 = SingletonLazy.getInstance();
        s2.print();

    }
}

// 饿汉式:占用内存的时间长，提高效率
class SingletonHungry {
    private SingletonHungry() { // 让构造函数为 private，这样该类就不会被实例化
    }

    private static SingletonHungry s = new SingletonHungry();// 静态的实例对象 只有一份 创建 SingletonHungry 的一个对象

    public static SingletonHungry getInstance() { // 获取唯一可用的对象
        return s;
    }

    public void print() {
        System.out.println("test method for hungry singleton");
    }
}

// 懒汉式：占用内存的时间短，效率低 （建议用） -- 延迟加载（懒加载）
class SingletonLazy {
    private SingletonLazy() {
    }

    private static SingletonLazy s;

    public static SingletonLazy getInstance() {
        if (s == null) {
            s = new SingletonLazy();
        }
        return s;
    }

    public void print() {
        System.out.println("test methord for lazy singleton");
    }
}

// 使用构造方法私有化+静态方法来实现工具类 eg. Math
class Tools {
    private Tools() {
    }

    public static void print1() {
    }

    public static void print2() {
    }
}