

/*
 * @Description:  Construction method
 * @Author: Peng LIU
 * @LastEditors: Peng LIU
 * @Date: 2019-03-27 16:37:33
 * @LastEditTime: 2019-03-28 22:46:37
 */

public class ConstructionMethod {
    public static void main(String[] args) {
        Dog dog = new Dog("piggy", "boy", 3);
        dog.setAge(2);
        System.out.println(dog.getAge());
    }
}

class Dog {

    public Dog() { // 默认构造方法

    }

    public Dog(String name, String sex) {
        this.name = name;
        this.sex = sex;
        System.out.println("two parameter");
    }

    public Dog(String name, String sex, int age) {
        this(name, sex); // 只能放在第一行 因此只能用一次调用自己，相互调用时必要有出口
        this.age = age;
        System.out.println("three parameter");
    }

    private String name;
    private String sex;
    private int age;

    public void setName(String name) { // name 设值
        this.name = name;
    }

    public String getName() { // name 获取
        return name;
    }

    public void setSex(String sex) { // sex 设值
        this.sex = sex;
    }

    public String getSex() { // sex 获取
        return sex;
    }

    public void setAge(int age) { // age 设值
        this.age = age;
    }

    public int getAge() { // age 获取
        return age;
    }
}