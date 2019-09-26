package Paul.demo;

/**
 * @program: JavaStudy
 * @description: 动物类
 * @author: Peng LIU
 * @create: 2019-09-26 11:45
 **/
public class Animal {
    String name;
    int eyes;
    int legs;
    
    /**
    * @Description:  
    * @Param: [food] 
    * @return: void 
    * @Author: Peng LIU
    * @Date: 2019-09-26 
    */ 
    
    public void eat(String food){
        
        System.out.println("need food: " + food);
    }
    /**
    * @Description:  
    * @Param: [moveType] 
    * @return: void 
    * @Author: Peng LIU
    * @Date: 2019-09-26 
    */ 
 
    public void move(String moveType){
        System.out.println("move type: " + moveType);
    }
}
