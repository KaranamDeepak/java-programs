public class BinarySearch {
    public static void main(String[] args) {
        int[]  arr={12,23,34,45,56,67,78,89,90};
        int target=00;
        System.out.println("Index:"+BSearch(arr,target));

    }
    static int BSearch(int []arr,int target){
       
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;

            }
            else if(target==arr[mid]){
                return mid;
            }
            
        }
        return -1;

    }
}
