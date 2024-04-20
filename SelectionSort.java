//not in-place algorithm
//n(n-1)/2 comparisons
import java.util.Arrays;

public class SelectionSort {
    public static void selection(int[] arr){
        int n= arr.length;
    for(int i=0;i<=n-1;i++){
        int last = n-i-1;
        int max = getmax(arr,0,last);
        swap(arr,last,max);
    }
    }

    private static void swap(int[]arr,int a, int b) {
        int temp =arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    private static int getmax(int[] arr, int start, int last) {
        int max = start;
        for(int i=start+1;i<=last;i++){
            if(arr[i]>arr[max]){
                max = i;
            }
        }
        return max;
    }
    public static void main(String[] args){
        int[] arr = {3,7,0,9,5,2,1,89,77,65,43,20,19,82};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
}
