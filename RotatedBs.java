public class RotatedBs
 {
    /*
     * Problem: Search in a rotated sorted array
     * Example: [4,5,6,7,0,1,2], target = 0 → index 4
     *
     * Approach:
     * 1. First, find the pivot (the largest element where rotation happens).
     *    - Pivot is the element after which the array becomes smaller.
     *    - Example: In [4,5,6,7,0,1,2], pivot = 7 (index 3).
     * 2. Once pivot is found:
     *    - If pivot == -1 → array is not rotated, just do normal binary search.
     *    - If arr[pivot] == target → return pivot.
     *    - Else, decide which side to search:
     *        a) If target >= arr[0] → search left half (0 → pivot-1).
     *        b) Else → search right half (pivot+1 → end).
     */

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        int result = search(arr, target);
        System.out.println("Target " + target + " found at index: " + result);

        int p = findPivot(arr);
        System.out.println("Pivot is at index: " + p + " with value: " + arr[p]);
    }

    // Main search function
    static int search(int[] arr, int target) {
        int pivot = findPivot(arr);

        // Case 1: No pivot found → array is not rotated
        if (pivot == -1) {
            return binarySearch(arr, target, 0, arr.length - 1);
        }

        // Case 2: Pivot itself is the target
        if (arr[pivot] == target) {
            return pivot;
        }

        // Case 3: Target lies in left half
        if (target >= arr[0]) {
            return binarySearch(arr, target, 0, pivot - 1);
        }

        // Case 4: Target lies in right half
        return binarySearch(arr, target, pivot + 1, arr.length - 1);
    }

    // Function to find the pivot (index of largest element)
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Case 1: Pivot is mid
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            // Case 2: Pivot is mid-1
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // Case 3: If left side is sorted, pivot must be in right side
            if (arr[start] <= arr[mid]) {
                start = mid + 1;
            }
            // Case 4: Else pivot must be in left side
            else {
                end = mid - 1;
            }
        }
        return -1; // No pivot → array is not rotated
    }

    // Standard binary search
    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid; // target found
            }
        }
        return -1; // target not found
    }
}
