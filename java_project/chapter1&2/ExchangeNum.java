public class ExchangeNum {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("a = " + a + ",b = " + b);
        // method 1:
        int tmp = a;
        a = b;
        b = tmp;
        System.out.println("a = " + a + ",b = " + b);

        // methord 2:
        a = 10;
        b = 20;
        a = a + b - (b = a);
        System.out.println("a = " + a + ",b = " + b);

        // methord 3:
        a = 10;
        b = 20;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a + ",b = " + b);

        // methord 4(fastest):
        a = 10;
        b = 20;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a = " + a + ",b = " + b);
    }
}