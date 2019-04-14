/**
 * logic calulate sign
 */
public class LogicOperation {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        System.out.println(a & !b); // a and b should == true
        System.out.println(a | b); // a or b == true
        System.out.println(a ^ b); // same is flase, diff is true
        System.out.println(!a);
        System.out.println(a && !b); // diff with &
        System.out.println(a || b); // diif with |
        /*
         * diff with "&" and "&&"
         * 
         * @ 逻辑运算时：“&” 分别计算两边的结果 再做 “&” 运算
         * 
         * @ 位运算时： 表示按位与
         * 
         * @ “&&” 先计算左边的表达式,如果是false 直接返回flase； 计算效率高
         */
        /*
         * diff with "|" and "||"
         * 
         * @ same as "&" and "&&"
         */
    }
}