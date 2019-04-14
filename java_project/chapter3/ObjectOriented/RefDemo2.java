
/*
 * @Description: RefDemo of String
 * @Author: Peng LIU
 * @LastEditors: Peng LIU
 * @Date: 2019-03-27 17:47:11
 * @LastEditTime: 2019-03-28 22:50:34
 */

public class RefDemo2 {
    public static void main(String[] args) {
        // 情况1:-----------------------
        String name = "张飞";
        method(name);
        System.out.println("name = " + name);

        // 情况2:-----------------------
        Person p = new Person();
        method2(p);
        System.out.println("person name = " + p.name);

    }

    public static void method(String sname) {
        sname = "刘备"; // 地址换了 导致name指向张飞 而sname指向刘备
    }

    public static void method2(Person per) {
        per.name = "赵云";
    }
}

class Person {
    String name = "关羽";
}