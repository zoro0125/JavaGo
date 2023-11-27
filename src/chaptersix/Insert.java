package chaptersix;

import java.util.Arrays;

public class Insert {
    public static void main(String[] args) {
        int nums[] = {1, 2, 4, 6, 78, 878};
        int new_nums[] = new int[nums.length + 1];
        int n = 89;
        for (int i = 0; i < new_nums.length; i++) {
            if (n > nums[i]) {
                new_nums[i] = nums[i];
            } else {
                new_nums[i] = n;
                for (int j = i + 1; j < new_nums.length; j++, i++) {
                    new_nums[j] = nums[i];
                }
                break;
            }
        }
        System.out.println(Arrays.toString(new_nums));
    }
}
