import java.util.Arrays;
import java.util.Random;

import java.util.Scanner;

/*
 * @Description: 红球号码区（范围1-33）和蓝球号码区（范围1-16），每期红球取6个，蓝球取1个为中奖号码，顺序不限
 * @Author: Peng LIU
 * @LastEditors: Peng LIU
 * @Date: 2019-03-26 21:48:25
 * @LastEditTime: 2019-03-26 23:03:42
 */

/**
 * @中奖设置：
 * 
 * @一等奖：6红 1蓝
 * @二等奖 6红 0蓝
 * @三等奖 5红 1蓝
 * @四等奖 5红 0蓝 or 4红 1蓝
 * @五等奖 4红 0蓝 or 3红 1蓝
 * @六等奖 2红 1蓝 or 1红 1蓝 or 0红 1蓝
 */

public class CaseLotttery {
    public static int[] randomRedBall() { // random choose 6 numbers from 1-33 without repeat
        int[] allRedball = new int[33];
        for (int i = 0; i < allRedball.length; i++) {
            allRedball[i] = i + 1;
        }
        return allRedball;
    }

    public static void autoSelection(int[] redBall, int[] usrRedBall) { // 随机生成不重复数值
        Random r = new Random();
        int index = -1;
        for (int i = 0; i < usrRedBall.length; i++) {
            index = r.nextInt(redBall.length - i);
            usrRedBall[i] = redBall[index];
            int temp = redBall[index];
            redBall[index] = redBall[redBall.length - 1 - i];
            redBall[redBall.length - 1 - i] = temp;

        }
    }

    public static void main(String[] args) {
        int[] usrRedBall = new int[6]; // user's red ball
        int[] sysRedBall = new int[6]; // system's red ball
        int usrBlueBall = -1; // user's blue ball
        int sysBlueBall = -1; // system's blue ball
        int redCount = 0; // the matched red ball between users' and sys's
        int blueCount = 0; // the matched bule ball between users' and sys's

        // game begin
        Random r = new Random();
        int[] redBalls = randomRedBall();
        System.out.println("game start:");
        System.out.println("choose Auto[1] or manual[2]");
        java.util.Scanner input = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            int isAuto = input.nextInt();
            switch (isAuto) {
            case 1:
                // auto
                autoSelection(redBalls, usrRedBall);
                usrBlueBall = r.nextInt(16) + 1;
                flag = false;
                break;
            case 2:
                // manual
                System.out.println("choose 6 red ball numbers between 1-33:");
                for (int i = 0; i < usrRedBall.length; i++) {
                    usrRedBall[i] = input.nextInt();
                }
                System.out.println("choose 1 blue ball numbers between 1-16:");
                usrBlueBall = input.nextInt();
                flag = false;
                break;
            default:
                System.out.println("wrong input, choose Auto[1] or manual[2]");
                isAuto = input.nextInt();
                break;
            }
        }
        // 系统随机生成号码
        // red ball
        autoSelection(redBalls, sysRedBall);
        // blue ball
        sysBlueBall = r.nextInt(16) + 1;
        // count result
        // red ball
        for (int i = 0; i < usrRedBall.length - redCount; i++) {
            for (int j = 0; j < sysRedBall.length; j++) {
                if (usrRedBall[i] == sysRedBall[j]) {
                    int temp = sysRedBall[j];
                    sysRedBall[j] = sysRedBall[sysRedBall.length - 1 - redCount];
                    sysRedBall[sysRedBall.length - 1 - redCount] = temp;
                    redCount++;
                }
            }
        }
        // blue ball
        if (usrBlueBall == sysBlueBall) {
            blueCount = 1;
        }
        // print red ball
        System.out.println("中奖红球号码：" + Arrays.toString(sysRedBall));
        System.out.println("中奖蓝球号码：" + sysBlueBall);
        // print user balls
        Arrays.sort(usrRedBall);
        System.out.println("您的红球号码：" + Arrays.toString(usrRedBall));
        System.out.println("您的蓝球号码：" + usrBlueBall);
        // 验证是否中奖
        if (blueCount == 0 && redCount <= 3) {
            System.out.println("sorry,baby");
        } else if (blueCount == 1 && redCount < 3) {
            System.out.println("六等奖");
        } else if ((blueCount == 1 && redCount == 3) || (blueCount == 0 && redCount == 4)) {
            System.out.println("五等奖");
        } else if ((blueCount == 1 && redCount == 4) || (blueCount == 0 && redCount == 5)) {
            System.out.println("四等奖");
        } else if (blueCount == 1 && redCount == 5) {
            System.out.println("三等奖");
        } else if (blueCount == 0 && redCount == 6) {
            System.out.println("二等奖");
        } else {
            System.out.println("一等奖");
        }
    }
}