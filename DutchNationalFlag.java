
import java.util.Arrays;

public class DutchNationalFlag {
    static void DNFalg(int[] arr){
        int low=0;
        int mid=0;
        int n=arr.length;

        int high=n-1;
        while(mid<=high){
            switch (arr[mid]) {
                case 0 ->                     {
                        int temp=arr[mid];
                        arr[mid]=arr[low];
                        arr[low]=temp;
                        low++;
                        mid++;
                    }
                case 1 -> mid++;
                default ->                     {
                        int temp=arr[mid];
                        arr[mid]=arr[high];
                        arr[high]=temp;
                        high--;
                    }
            }

        }

    }
    public static void main(String[] args) {
        
    
    int[] arr={0,1,0,2,0,2,1,2,1,0};
    DNFalg(arr);
    System.out.println(Arrays.toString(arr));
    }
}
