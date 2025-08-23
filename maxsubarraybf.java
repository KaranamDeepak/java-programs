public class maxsubarraybf {
    static int maxsubarrayBf(int[] n){
      
        int max=0;
        for(int start=0;start<n.length;start++){
            int currentsum=0;
            for(int end=start;end<n.length;end++){
                currentsum+=n[end];
                if(currentsum>max){
                    max=currentsum;
                }
            }
        }

       return max; 
    }
    public static void main(String[] args){
    int[]  n={-2,-3,1,5,-1};
       int k= maxsubarrayBf(n);
System.out.print("MAX:"+k);
    }
}
