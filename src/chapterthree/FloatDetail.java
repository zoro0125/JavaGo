package chapterthree;

public class FloatDetail {
    public static void main(String[] args) {
        /*
        浮点数也有固定的范围和字段长度
        默认为double
        两种表示方式 (1)小数(2)科学技术法

        浮点数之间的比较需要注意 不能直接比较


         */
        double num1 = 2.7;
        double num2 = 8.1 / 3;
        System.out.println(num1);
        System.out.println(num2);
        if (num1 == num2) {
            System.out.println("相等");
        }
        // 使用差的绝对值进行比较
        if (Math.abs(num1 - num2) <= 0.0001) {
            System.out.println("相等");
        }
    }
}
