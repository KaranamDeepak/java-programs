import java.util.Arrays;
//O(N);
class ProductExceptSelf {
    public static int[] productExceptSelf1(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        int[] answer = new int[nums.length];

        prefix[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }

        suffix[nums.length - 1] = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * nums[i + 1];
        }

    
        for (int i = 0; i < nums.length; i++) {
            answer[i] = prefix[i] * suffix[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] n = {1, 2, 3, 4};
        System.out.println("PRODUCT EXCEPT ITSELF: " + Arrays.toString(productExceptSelf1(n)));
    }
}
