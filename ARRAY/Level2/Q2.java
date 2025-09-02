import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter height of friend " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.println("Smallest height: " + arr[0]);
        System.out.println("Tallest height: " + arr[2]);
    }
}

