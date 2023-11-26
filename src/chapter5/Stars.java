package chapter5;

public class Stars {
    public static void main(String[] args) {
        int level = 5;
        int i = 1;
        int j = 1;
        while (i <= level) {
            int k = 1;
            while ( k <= j) {
                System.out.print("*");
                k++;
            }
            System.out.println("");
            i++;
            j++;
        }
    }
}
