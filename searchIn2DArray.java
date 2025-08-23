
import java.util.Arrays;

public class searchIn2DArray {
    public static void main(String[] args) {
        int [][] a={
            {2,4,45},
            {12,34,56,78},
            {21,87,98}
        };
        int target=3;
      System.out.println(Arrays.toString(search3(a, target)));
        
    }
    static int[] search3(int[][]n,int target){
        int p=-1,q=-1;
        int [] a=new int[2];
        for(int i=0;i<n.length;i++){
            for(int j=0;j<n[i].length;j++){
                if(target==n[i][j]){
                    p=i;
                    q=j;
                }

            }

        }
        a[0]=p;
        a[1]=q;
return a;
      
    }
}
