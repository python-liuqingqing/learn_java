package capter08;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class smallChangeSys {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        StringBuilder detail = new StringBuilder("-------------零钱通明细-------------");
        double balance = 0;
        boolean loop = true;
        Date date = null;
        double money = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("=============零钱通菜单=============");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消   费");
            System.out.println("\t\t\t4 退   出");
            System.out.println("=============end=============");
            System.out.println("请输入选项：");
            String ob = scanner.next();
            switch (ob) {
                case "1":
                    System.out.println(detail + "\n");
                    break;
                case "2":
                    System.out.println("请输入收益入账金额：");
                    money = scanner.nextDouble();
                    balance += money;
                    date = new Date();
                    detail.append("\n收益入账\t+").append(money).append("\t").append(sdf.format(date)).append("\t").append(balance);
                    break;
                case "3":
                    System.out.println("请输入消费金额：");
                    money = scanner.nextDouble();
                    balance -= money;
                    detail.append("\n消  费\t-").append(money).append("\t").append(sdf.format(date)).append("\t").append(balance);
                    break;
                case "4":
                    String choice = "";
                    while (true) {
                        System.out.println("你确定要退出吗? y/n");
                        choice = scanner.next();
                        if (choice.equals("y") || choice.equals("n")) {
                            break;
                        }
                    }
                    if (choice.equals("y")) {
                        loop = false;
                        break;
                    }
                default:
                    System.out.println("输入有误！");
            }

        } while (loop);
    }
}
