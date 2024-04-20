import java.util.Arrays;

public class InsertionSort {
    static void insertion(int[] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j =i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                    }
                    else{
                        break;
                    }
                }
            }
        }

    private static void swap(int[] arr, int j, int i) {
        // TODO Auto-generated method stub
        int a = arr[j];
        arr[j]=arr[i];
        arr[i]=a;
        
    }
    public static void main(String[] args) {
        int[] arr = {3,7,0,9,5,2,1,89,77,65,43,20,19,82};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    }

