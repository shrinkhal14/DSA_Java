package Recursion;

public class Recursion2 {
    int first = -1;
    int last = -1;

    public static void main(String[] args) {
        Recursion2 obj = new Recursion2();
        towerofhanoi(3, "S", "H", "D");  
        reverse("abcd", 3);
        obj.occurence("abaacdaefaah", 0, 'f');
        int[] arr = {1,2,3,5,4};
        System.out.println(isSorted(arr, arr.length-1));
    }

    // Tower of Hanoi problem using recursion (number of steps = 2^n - 1)
    public static void towerofhanoi(int n, String src, String help, String dest) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + src + " to " + dest);
            return;
        }
        towerofhanoi(n - 1, src, dest, help);
        System.out.println("Move disk " + n + " from " + src + " to " + dest);
        towerofhanoi(n - 1, help, src, dest);
    }

    // Print a string in reverse
    public static void reverse(String str, int idx) {
        if (idx == 0) {
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        reverse(str, idx - 1);
    }

    // First and last occurrence of an element in a string
    public void occurence(String s, int idx, char element) {
        if (idx == s.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char current = s.charAt(idx);
        if (current == element) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }
        occurence(s, idx + 1, element);
    }
    // To check is an array is sorted (Strictly Increasing)
    public static boolean isSorted(int[] arr, int idx){
        if(idx==0){
            return true;
        }
        if(arr[idx]>arr[idx-1]){
            return isSorted(arr, idx-1);
        }
        else{
            return false;
        }
    }
}
