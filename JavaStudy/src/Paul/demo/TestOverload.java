package Paul.demo;


/**
 * @program: JavaStudy
 * @description: 方法的重载
 * @author: Peng LIU
 * @create: 2019-09-26 13:03
 **/
public class TestOverload {
    
    public int add(int x, int y){
        return x + y;
    }
    
    public double add(int x, double y){
        return x + y;
    }
    
    public int add(int x, int y, int z){
        return x + y + z;
    }
    
    public static void main(String[] args) {
        TestOverload testOl = new TestOverload();
        System.out.println(testOl.add(2,3));
        System.out.println(testOl.add(2,3.4));
        System.out.println(testOl.add(2,3,4));
    }
    
    
}
