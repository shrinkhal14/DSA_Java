package Backtracking;

public class FindPermutation {
    public static void recurse(String str, String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
        char currChar = str.charAt(i);
        String newStr = str.substring(0, i)+str.substring(i+1);
        recurse(newStr,ans+currChar);
    }
  } 
  public static void main(String[] args) {
    String str="ABC";
    recurse(str, " ");
  }
}
