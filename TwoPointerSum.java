public class TwoPointerSum {
    static boolean hasPair(int [] nums,int target){
    int left=0;
    int right=nums.length-1;
    while(left<right){
        int sum=nums[left]+nums[right];
      System.out.println("Checking: " + nums[left] + " + " + nums[right] + " = " + sum);

        if(sum==target){
            return true;
        }
        if(target>sum){
            left++;
        }
        else {
        right--;}
    }
    return false;

    }
    public static void main(String[] args){
        int [] n={1,2,3,4,5,6};
        int target=6;
    System.out.print(hasPair(n, target));

    }
}
