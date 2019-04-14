
/*
 * @Description: calculate the volume of cylinder 
 * @Author: Peng LIU
 * @LastEditors: Peng LIU
 * @Date: 2019-03-25 19:57:57
 * @LastEditTime: 2019-03-25 20:08:46
 */
import java.util.Scanner;

public class VolumeCylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please input height:");
        float heigh = input.nextInt();
        System.out.println("please input the semidimater:");
        float semi = input.nextInt();
        input.close();
        float pai = 3.14f;
        float volume = pai * (semi * semi) * heigh;
        System.out.println("the volume of cylinder is:\n" + volume);
    }
}