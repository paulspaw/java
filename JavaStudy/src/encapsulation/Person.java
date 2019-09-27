package encapsulation;

/**
 * @program: JavaStudy
 * @description: java的封装和隐藏
 * @author: Peng LIU
 * @create: 2019-09-26 23:48
 **/
public class Person {
    private int age;
    
    public void printAge(){
        if (age > 0 && age <= 150) {
            System.out.println("age = " + age);
        }
    }
    
    
    public void setAge(int a){
        if (a > 0 && a <= 150){
            age = a;
        } else {
            System.out.println("age error, out of range!");
        }
    }

    public int getAge() {
        return age;
    }
}
