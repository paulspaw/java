
/*
 * @Description: introduct what is "this"
 * @Author: Peng LIU
 * @LastEditors: Peng LIU
 * @Date: 2019-03-27 17:09:25
 * @LastEditTime: 2019-03-28 22:50:14
 */
public class DefThis {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("mimi");
        cat.setAge(3);

        cat.eat();
    }
}

class Cat {
    private String name;
    private int age;

    public void eat() { // cat调用了eat方法， this就是代表cat 若调用的类中其他方法（或属性），this可以省略
        System.out.println(this.getName() + " like eat fish"); // this.方法
        System.out.println(Cat.this.getName() + " like eat fish"); // 类名.this
        System.out.println(this.name + " like eat fish"); // this.属性
        System.out.println(getName() + " like eat fish"); // 与this.方法一样
    }

    // setter and getter
    public void setName(String name) { // name == "mimi"
        this.name = name; // this代表的是当前对象（谁调用的方法谁就是当前对象 -> cat,所以this 就是 cat）--调用属性
    }

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