package Paul.demo;

/**
 * @program: JavaStudy
 * @description: 人这个类的变量和行为
 * @author: Peng LIU
 * @create: 2019-09-26 11:37
 **/
public class Person {
//    属性：成员变量
    
    String name; // null
    int age;    // 0
    
//    行为：方法，函数
    
    public void showName(){ // 显示名
        System.out.println("Name: " + name);
    }
    
    public int getAge(){ // 获取年龄
        
        return age;
    }
}
