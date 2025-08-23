public class searchInRange {
    public static void main(String[] args) {
        int []n={1,4,8,2,5,6,7,9};
        int target=9,start=2,end=4;


        System.out.println(search(n, target, start, end));
    }
    static boolean search(int[] n,int target,int start ,int end){
if(n.length==0) {
    return false;}
    for( int i=start;i<end;i++){
    if(target==n[i]){
        return true;

    }
}
return false;
    }
}
