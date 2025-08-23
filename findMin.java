class findMin{
    public static void main(String[] args) {
        int [] arr={4,5,6,74,3,21,-1};
        System.out.println(findMinNumber(arr));
    }
    static int findMinNumber(int[] n){
        
        if(n.length==0){
            return Integer.MAX_VALUE;
        }
            int min=n[0];
        for(int i=1;i<n.length;i++){
            if(min>n[i]){
                min=n[i];
            }
        }
        return min;
    }
}
    

