import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        int a = 1;
        int b = 5;
        int c;
        System.out.println(a / b);
        System.out.println(a % b);
        c = a++;
        System.out.println("c = " + c);
        c = ++b;
        System.out.println("c = " + c);

        // 赋值运算符
        int d = 5;
        int e = 3;
        d += e; // += -= %= *= /=
        System.out.println(d);

        // 关系运算符
        // > < >= <= == !=
        System.out.println(a < b);

        // 键盘输入
        Scanner input = new Scanner(System.in);
        System.out.println("please input a num:");
        int x1 = input.nextInt();
        System.out.println("please input a string:");
        String s1 = input.next();
        System.out.println(s1);
        input.close();
        System.out.println(x1);
    }
}