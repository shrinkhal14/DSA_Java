package Backtracking;
    public class OnArray{
      public static void main(String[] args) {
        int[] arr = new int[5];
        recurse(arr, 0, 1);
        printarr(arr);
      }
    
    public static void recurse(int[] arr, int i, int val){
        //base case 
        if(i==arr.length){
            printarr(arr);
            return;
        }
        //recursion step
        arr[i]=val;
        recurse(arr,i+1,val+1);
        //backtracking step
        arr[i]=arr[i]-2;
    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        
        return;
    }
}
