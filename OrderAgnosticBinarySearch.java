public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arrAsc = {12, 23, 34, 45, 56, 67, 78, 89, 90};   // Ascending order
        int[] arrDesc = {90, 80, 70, 60, 50, 40, 30, 20, 10}; // Descending order

        int target = 70;

        System.out.println("Index in Ascending array: " + orderAgnosticBS(arrAsc, target));
        System.out.println("Index in Descending array: " + orderAgnosticBS(arrDesc, target));
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
            
        // find whether the array is ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {  // ascending order
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {      // descending order
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1; // target not found
    }
}
