public class SearchinStrings {
    public static void main(String[] args) {
        String s="Deepak";
        char target='p';
        System.out.println(search2(s, target));
    }
    static boolean search1(String s,char c){
    if(s.length()==0){
        return false;
    }
   
        
    for(int i=0;i<s.length();i++){
        if(c==s.charAt(i)){
            return true;
        }
    }
    return false;




    }
    //for each loop tho chesindhii
    
    static boolean search2(String s,char target){
        for(char c:s.toCharArray()){
            if(c==target){
                return true;
            }

        }
        return false;
    }
}
