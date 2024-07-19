package Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubsequenceOfAnArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        List<Integer> subse = new ArrayList<>();
        subsequence(array, 0, subse);
    }

    public static void subsequence(int[] array, int index, List<Integer> subsequence) {
        if (index == array.length) {
            System.out.println(subsequence);
            return;
        }

        // Include the current element in the subsequence
        subsequence.add(array[index]);
        subsequence(array, index + 1, subsequence);

        // Backtrack to remove the current element
        subsequence.remove(subsequence.size() - 1);

        // Do not include the current element in the subsequence
        subsequence(array, index + 1, subsequence);
    }
}
