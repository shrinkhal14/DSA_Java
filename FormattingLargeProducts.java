import java.util.Scanner;

/**
 * FormattingLargeProducts
 */
public class FormattingLargeProducts {

     public static String product(int A, int B){
      long product = 1;
        for (int i = A; i <= B; i++) {
            product *= i;
        }

        int trailingZeros = 0;
        while (product % 10 == 0) {
            product /= 10;
            trailingZeros++;
        }

        return product + " * 10^" + trailingZeros;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        System.out.println(product(A, B));
        scanner.close();
    }
}
