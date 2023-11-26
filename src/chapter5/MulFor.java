package chapter5;

public class MulFor {
    public static void main(String[] args) {

        System.out.println("九九乘法表打印如下：");
        for (int i = 1; i <=9; i++) {
            for (int j = 1; j<= i; j++) {
                System.out.print(j + " * " + i + " = " + i * j + "\t");
            }
            System.out.println("\n");
        }
    }
}
