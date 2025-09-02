import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[10];
        int size = 0;

        while (n > 0) {
            arr[size++] = n % 10;
            n = n / 10;
        }

        int max1 = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i] > max1) max1 = arr[i];
        }

        int max2 = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i] != max1 && arr[i] > max2) {
                max2 = arr[i];
            }
        }

        System.out.println("Largest: " + max1);
        System.out.println("Second Largest: " + max2);
    }
}
