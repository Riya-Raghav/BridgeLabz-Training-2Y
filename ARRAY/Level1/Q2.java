import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        for (int num : arr) {
            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println(" Positive and Even");
                } else {
                    System.out.println(" Positive and Odd");
                }
            } else if (num < 0) {
                System.out.println("Negative");
            } else {
                System.out.println("Zero");
            }
        }
        if (arr[0] == arr[arr.length - 1]) {
            System.out.println("First and last are Equal");
        } else if (arr[0] > arr[arr.length - 1]) {
            System.out.println("First is Greater than last");
        } else {
            System.out.println("First is Less than last");
        }
    }
}
