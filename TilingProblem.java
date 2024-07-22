public class TilingProblem {
    public static int tilingproblem(int n){ //n for 2*n floor
       //base case
       if(n==0||n==1){
         return 1;
       }
       //for vertical choice
       int vertical = tilingproblem(n-1);
       //for horizontal choice
       int horizontal = tilingproblem(n-2);

       int totalWays = vertical+horizontal;
       return totalWays;

    }
    public static void main(String[] args) {
        System.out.println(tilingproblem(5));
    }
}
