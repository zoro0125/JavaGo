package chaptersix;

import java.util.Arrays;

public class YangHui {
    public static void main(String[] args) {
        int nums[][] = new int[5][];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = new int[i + 1];
            for (int j = 0; j < nums[i].length; j++) {
                if (j == 0 || j == nums[i].length - 1) {
                    nums[i][j] = 1;
                } else {
                    nums[i][j] = nums[i - 1][j] + nums[i - 1][j - 1];
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(Arrays.toString(nums[i]));
        }
    }
}
