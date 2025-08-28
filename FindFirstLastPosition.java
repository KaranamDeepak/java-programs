import java.util.Arrays;

class FindFIrstLastPosition {
    public int[] searchRange(int[] nums, int target) {
        int first = binarySearch(nums, target, true);   // find first occurrence
        int last  = binarySearch(nums, target, false);  // find last occurrence
        return new int[] {first, last};
    }

    static  int binarySearch(int[] nums, int target, boolean isFirst) {
        int start = 0, end = nums.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                ans = mid;
                if (isFirst) {
                    end = mid - 1;   // move left
                } else {
                    start = mid + 1; // move right
                }
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    // Main method to test
    public static void main(String[] args) {
        FindFIrstLastPosition sol = new FindFIrstLastPosition();

        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        int[] result = sol.searchRange(nums, target);
        System.out.println("First and Last Position: " + Arrays.toString(result));
    }
}
