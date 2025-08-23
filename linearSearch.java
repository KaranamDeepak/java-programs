public class linearSearch {
    static int LinSearch(int [] a,int target)
   {int f=-1;
    if(a.length==0){
        return 0;
    }
    //code for linear search;
    for(int i=0;i<a.length;i++){
        if(a[i]==target){
       return i;
        }
        
    }
    return Integer.MAX_VALUE;
    }
    public static void main(String[] args) {
        int []  n={1,4,2,5,6,7};
        System.out.println(LinSearch(n,90));

    }



}

