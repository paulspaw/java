
/*
 * @Description: defination of pacakage
 * @Author: Peng LIU
 * @LastEditors: Peng LIU
 * @Date: 2019-03-27 13:41:09
 * @LastEditTime: 2019-03-28 22:47:05
 */

public class DefPackage {
    public static void main(String[] args) {
        Person p1 = new Person();
        // p1.age = 25;
        p1.setName("paul");
        p1.setAge(25);
        System.out.println(p1.getName());
    }
}

// 未封装之前，对外是公开的
// private 访问权限修饰符
// 私有的属性或者方法，只能在本类中访问；共有的属性和方法，可以被类外部的其他类访问
// 想要在类外部访问私有属性，需要提供共有的方法来简介访问
class Person {
    // 属性的封装
    private String name; // 成员变量
    private int age; // 成员变量

    public void run(int len) { // 参数也是局部变量
        int m = len;// m也是局部变量
        System.out.println("run " + m + "metters");
    }

    // 对外提供一个为name属性设值的方法
    public void setName(String name) {
        // this 表示‘当前对象的’
        this.name = name;
    }

    // 提供一个获取name属性的方法
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}