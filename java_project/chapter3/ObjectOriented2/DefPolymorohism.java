/*
 * @Description: 三大特性之一 多态
 * @Author: Peng LIU
 * @LastEditors: Peng LIU
 * @Date: 2019-03-29 20:45:14
 * @LastEditTime: 2019-03-29 21:01:20
 */

public class DefPolymorohism {
    public static void main(String[] args) {
        HomeChicken hc = new HomeChicken("小鸡");
        hc.eat();
        WildChicken wc = new WildChicken("彩鸡");
        wc.eat();
    }
}

// 鸡类 - 抽象类
abstract class Chicken {
    private String name;

    public Chicken() {
    }

    public Chicken(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void eat();
}

// 家鸡
class HomeChicken extends Chicken {
    public HomeChicken() {
    }

    public HomeChicken(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + ", 我爱吃米");
    }
}

// 野鸡
class WildChicken extends Chicken {
    public WildChicken() {
    }

    public WildChicken(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + ", 我爱吃虫");
    }
}