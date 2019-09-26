package Paul.demo;

/**
 * @program: JavaStudy
 * @description: 创建一个类
 * @author: Peng LIU
 * @create: 2019-09-26 12:06
 **/
public class TestCreateObject {
    public void showPerson(){
        //实例化Person类
        Person person = new Person();
        person.name = "Cassie";
        person.age = 18;

        person.showName(); // 方法调用
        int age = person.getAge();
        System.out.println(age);
    }
    
    public void showAnimal(){
        Animal animal = new Animal();
        animal.eat("meat");
        animal.move("fly");
    }
    
    public static void main(String[] args) {
        TestCreateObject testObj = new TestCreateObject();
        testObj.showPerson();
        
        testObj.showAnimal();
        
    }
}
