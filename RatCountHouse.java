public class RatCountHouse {
// Problem Description :
// The function accepts two positive integers ‘r’ and ‘unit’ and a positive integer array ‘arr’ of size ‘n’ as its argument ‘r’ represents the number of rats present in an area, ‘unit’ is the amount of food each rat consumes and each ith element of array ‘arr’ represents the amount of food present in ‘i+1’ house number, where 0 <= i

// Note:

// Return -1 if the array is null
// Return 0 if the total amount of food from all houses is not sufficient for all the rats.
// Computed values lie within the integer range.
public static int houses(int r, int unit, int[] arr, int n){
    if(arr==null){
        return -1;
    }
    int total = r*unit;
    int count=0;
    int sum=0;
    int i=0;
    while(sum<=total){
      sum+=arr[i];
      count++;
      i++;
    }
    return count;

}
public static void main(String[] args) {
    int r = 7;
    int unit = 2;
    int n=8;
    int[] arr = {2,8,3,5,7,4,1,2};
    System.out.println(houses(r,unit,arr,n));
}
}
