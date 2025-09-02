import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digits[] = new int[10];
        int k = 0;

        while (n > 0) {
            digits[k++] = n % 10;
            n = n / 10;
        }

        int max1 = -1, max2 = -1;
        for (int i = 0; i < k; i++) {
            if (digits[i] > max1) {
                max2 = max1;
                max1 = digits[i];
            } else if (digits[i] > max2 && digits[i] != max1) {
                max2 = digits[i];
            }
        }

        System.out.println("Largest: " + max1);
        System.out.println("Second Largest: " + max2);
    }
}
