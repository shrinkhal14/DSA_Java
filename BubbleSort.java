public class BubbleSort {
    public static int[] sort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {3, 7, 0, 4, 9, 3, 6, 7, 1, 0};
        array = sort(array);
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
