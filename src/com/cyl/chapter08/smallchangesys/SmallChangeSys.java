package com.cyl.chapter08.smallchangesys;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {
    public static void main(String[] args) {
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        int choice;
        //零钱通明细
        String details = "---------零钱通明细--------";

        //收益入帐
        double money = 0;
        double balance = 0;
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm");

        //消费
        String note = "";

        //退出
        String exit = "";

        //界面
        do {
            System.out.println();
            System.out.println("-----------零钱通菜单------------");
            System.out.println("\t\t1 零钱通明细");
            System.out.println("\t\t2 收益入帐");
            System.out.println("\t\t3 消费");
            System.out.println("\t\t4 退出");
            System.out.print("请选择1-4：");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(details);
                    break;
                case 2:
                    while (true) {
                        System.out.print("收益金额:");
                        money = scanner.nextDouble();
                        if (money > 0) {
                            break;
                        } else {
                            System.out.println("请输入正确的金额:");
                        }
                    }
                    balance += money;
                    date = new Date();
                    details += "\n收益入账\t+" + money + "\t" + sdf.format(date) + "\t余额:" + balance;
                    break;
                case 3:
                    System.out.print("消费说明:");
                    note = scanner.next();
                    while (true) {
                        System.out.print("消费金额:");
                        money = scanner.nextDouble();
                        if (money < balance && money > 0) {
                            break;
                        } else {
                            System.out.println("余额不足");
                        }
                    }

                    balance -= money;
                    date = new Date();
                    details +="\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t余额:" + balance;
                    break;
                case 4:
                    while (true) {
                        System.out.println("请输入y/n:");
                        exit = scanner.next();
                        if ("y".equals(exit) || "n".equals(exit)) {
                            break;
                        }
                    }
                    if (exit.equals("y")) {
                        loop = false;
                    }
//                    do {
//                        System.out.println("你确定退出吗？y/n");
//                        exit = scanner.next();
//                        if (exit.equals("y")) {
//                            loop = false;
//                            break;
//                        } else if (exit.equals("n")) {
//                            break;
//                        } else {
//                            System.out.println("输入有误，请重新输入：y/n");
//                        }
//                    } while (loop);

                    break;
                default:
                    System.out.println("选择有误");
                    break;
            }

        } while(loop);
        System.out.println("退出了零钱通。。。。。。");
    }
}
