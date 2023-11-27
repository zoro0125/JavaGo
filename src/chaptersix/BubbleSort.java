package chaptersix;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int nums[] = {5, 4, 3, 2, 1};
        int temp;
        for (int j = 0; j < nums.length - 1; j++) {
            for (int i = 0; i < nums.length - 1 - j; i++) {
                if (nums[i] > nums[i + 1]) {
                    temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));

    }
}
