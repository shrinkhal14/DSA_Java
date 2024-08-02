package Backtracking;
public class GridWays {
    public static int count(int i,int j, int n, int m){
        if(i==n-1||i==m-1){
            return 1;
        }
        if(i==n||j==m){
            return 0;
        }
        int w1 = count(i+1,j,n,m);
        int w2 = count(i,j+1,n,m);
        return w1+w2;
    }
    public static void main(String[] args) {
        int n=3,m=3;
        System.out.println(count(0,0,n,m));
    }
}
