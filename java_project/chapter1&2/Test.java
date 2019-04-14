public class Test {
    public static void main(String[] args) {
        // mian shi ti
        // byte short int 运算时会转换成int类型
        long lon = 1234567890;
        short s1 = 10;
        s1 = (short) (s1 + 1);
        System.out.println(s1);

        int x = (int) lon;
        System.out.println(x);

    }
}