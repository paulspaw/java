package encapsulation;

/**
 * @program: JavaStudy
 * @description: main方法
 * @author: Peng LIU
 * @create: 2019-09-26 23:57
 **/
public class TestMain {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(5);
        int a = p.getAge();
        System.out.println(a);
        p.printAge();
    }
}
