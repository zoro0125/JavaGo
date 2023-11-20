package chapterthree;

public class UseADD {
    public static void main(String[] args){
        /*
        左右两边是数值时 做加法运算
        左右两边有字符串时 做拼接运算
        运算顺序从左到右
         */
        System.out.println(100 + 98);
        System.out.println("100" + 98);
        System.out.println(100 + 3 + "hello");
        System.out.println("hello" + 100 + 3);
    }
}
