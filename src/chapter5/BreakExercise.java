package chapter5;

import java.util.Scanner;

public class BreakExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chance = 3;
        int i;
        for (i  = 0; i < chance; i++) {
            System.out.println("请输入用户名：");
            String name = scanner.next();
            System.out.println("请输入密码：");
            String password = scanner.next();
            if (name.equals("丁真") && password.equals("666")) {
                System.out.println("登陆成功！");
                break;
            } else {
                System.out.println("还有" + (chance - i - 1) + "次机会");
                System.out.println("清重新输入账号密码！");
            }
        }
        if (i == 3) {
            System.out.println("登陆失败");
        }
    }
}
