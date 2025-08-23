
import java.util.Arrays;
import java.util.Random;

public class SwappingWithTP {
    static void reverseTP(int[] n){
        int left=0;
        int right=n.length-1;

while(left<right){
    int temp=n[left];
    n[left]=n[right];
    n[right]=temp;
    left++;
    right--;
}
    }
    public static void main(String[] args){
        int[] a=new int[10];
        Random rand=new Random();
        for(int i=0;i<a.length;i++){
            a[i]=rand.nextInt(40)+1;
            
        }
        for(int num:a){
            System.out.print(num+"  ");
        }
        reverseTP(a);
        System.out.println(Arrays.toString(a));
    }
}
