package chaptersix;

public class TwoSearch {
    public static void main(String[] args) {
        int nums[] = {1, 19, 34, 44, 56, 78, 90};
        int high = nums.length - 1;
        int low = 0;
        int mid = (high + low) / 2;
        int x = 4;
        while (low < high) {
            if (nums[mid] < x) {
                low = mid + 1;
                mid = (high + low) / 2;
            } else if (nums[mid] > x) {
                high = mid - 1;
                mid = (high + low) / 2;
            } else {
                System.out.println(mid);
                break;
            }
        }
        if (low == high) {
            System.out.println("no");

        }
    }
}
