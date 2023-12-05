package com.cyl.chapter5;

public class Homework {
    public static void main(String[] args) {

//        double money = 100000;
//        int count = 0;
//        while (money >= 1000) {
//            if (money > 50000) {
//                money = money - money * 0.05;
//            } else {
//                money -= 1000;
//            }
//            count++;
//        }
//        System.out.println(count);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入一个整数：");
//        int x = scanner.nextInt();
//        if (x > 0) {
//            System.out.println("该整数大于零");
//        } else if (x < 0) {
//            System.out.println("该整数小于零");
//        } else {
//            System.out.println("该整数等于零");
//        }

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入一个三位整数：");
//        int x = scanner.nextInt();
//        if (Math.pow(x / 100, 3) + Math.pow((x % 100) / 10, 3) + Math.pow(x % 10, 3) == x) {
//            System.out.println("是水仙花数");
//        } else {
//            System.out.println("不是");
//        }

//        int count = 0;
//        for (int i = 1; i <= 100; i++) {
//            if (i % 5 != 0) {
//                System.out.print(i + "\t");
//                if (count % 5 == 4) {
//                    System.out.println("");
//                }
//                count++;
//
//            }
//        }

        for (char i = 'a'; i <= 'z'; i++) {
            System.out.println(i);
        }
        for (char i = 'Z'; i >= 'A'; i--) {
            System.out.println(i);
        }

//        double sum = 0;
//        int x = 100;
//        for (double i = 1; i <= x; i++) {
//            double key = Math.pow(-1, i + 1);
//            sum += 1 / i * key;
//        }
//        System.out.println(sum);


        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            int sum_temp = 0;
            for (int j = 1; j <= i; j++) {
                sum_temp += j;
            }
            sum += sum_temp;
        }
        System.out.println(sum);
    }
}
