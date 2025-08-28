public class InfiniteArrayBS {

    public static void main(String[] args) {
        int[] arr = { 1, 22, 33, 45, 67, 76, 78, 98, 991, 992, 993, 994, 995, 996, 997, 998 };

        int target = 99; // works fine
        int index = findingrange(arr, target);

        if (index != -1) {
            System.out.println("Target found at index " + index + " with value " + arr[index]);
        } else {
            System.out.println("Target not found.");
        }
    }

    static int findingrange(int[] arr, int target) {
        int start = 0;
        int end = 1;

        // Expand range exponentially until target <= arr[end]
        while (arr[end] < target) {
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }

        return binarysearch(arr, target, start, end);
    }

    static int binarysearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
