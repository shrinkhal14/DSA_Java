package Backtracking;

public class FindSubset {
    public static void recurse(String str, String ans, int i){
        if(i==str.length()){
            if(str.length()==0){
                System.out.println(" ");
            }
            else{
                System.out.println(ans);
            }
            return;
        }
        //including the character
        recurse(str,ans+str.charAt(i),i+1);
        //not including the character
        recurse(str,ans,i+1);
    }
    public static void main(String[] args) {
        String str ="abc";
        recurse(str," ",0);
        return;
    }
}
