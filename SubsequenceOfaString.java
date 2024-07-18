package Recursion;

public class SubsequenceOfaString {
    public static void main(String[] args) {
        subsequence("abc",0," ");
    }
    public static void subsequence(String s, int idx, String newString){
        if(idx==s.length()){
            System.out.println(newString);
            return;
        }
        char currChar = s.charAt(idx);
        //to be included
        subsequence(s, idx+1, newString+currChar);
        //to not be included
        subsequence(s, idx+1, newString);
    }
}
