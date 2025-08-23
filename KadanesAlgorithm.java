class KadanesAlgorithm{
    static int KAlg(int [] n){
        int currentsum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n.length;i++){
            currentsum+=n[i];
            max=Math.max(currentsum,max);
            if(currentsum<0)
            {
                currentsum=0;
            }

        }
        return max;
    }
    public static void main(String[] args) {
        int [] n={3,-4,5,4,-1,7,-8};
        int max=KAlg(n);
        System.out.print("Max"+max);
    }
}
