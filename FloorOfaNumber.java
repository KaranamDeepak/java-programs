

public class FloorOfaNumber {
    static int  Floor(int [] arr,int target){
int start=0;
int n=arr.length;
int end=n-1;
int y=0;
while(start<=end){
    int mid=start+(end-start)/2;
    
    if(arr[mid]==target){
        return arr[mid];
    }
    else if(arr[mid]<target){
        start=mid+1;

    }
    else {
        end=mid-1;
    }

   
}
return arr[end];

    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,9,11,28,22,34,66,70};
    int target=65;   
    int x=Floor(arr, target);
      System.out.println(x);
    }
}
