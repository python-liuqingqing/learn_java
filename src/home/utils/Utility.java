package project.home.utils;

import java.util.Scanner;

public class Utility {
    public static char readChar() {
        Scanner sc = new Scanner(System.in);
        char key = sc.next().charAt(0);
        return key;
    }

    public static String readString() {
        Scanner sc = new Scanner(System.in);
        String key = sc.next();
        return key;
    }

    public static int readInt() {
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        return key;
    }

    public static char readSelectChar() {
        System.out.println("请输入你的选择（Y/N）：");
        Scanner sc = new Scanner(System.in);
        String key = sc.next().toUpperCase();
        char c = key.charAt(0);
        for (; ; ) { //死循环
            if (c == 'Y' || c == 'N') {
                break;
            } else {
                System.out.println("输入错误，请重新输入：");
            }
        }
        return c;

    }

}
