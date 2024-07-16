package Recursion;

public class Recursion2 {
    public static void main(String[] args) {
        //towerofhanoi(3, "S", "H", "D");  
        reverse("abcd",3);
    }
//tower of hanoi problem using recursion (number of steps = 2^n - 1)
    public static void towerofhanoi(int n, String src, String help, String dest) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + src + " to " + dest);
            return;
        }
        towerofhanoi(n - 1, src, dest, help);
        System.out.println("Move disk " + n + " from " + src + " to " + dest);
        towerofhanoi(n - 1, help, src, dest);
    }
//print a string in reverse
public static void reverse(String str, int idx){
    if(idx==0){
        System.out.println(str.charAt(idx));
        return;
    }
    System.out.println(str.charAt(idx));
    reverse(str,idx-1);
}
}
