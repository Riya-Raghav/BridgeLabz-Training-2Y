import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double arr[] = new double[10];
        double sum = 0.0;
        int index = 0;
        while (index < arr.length) {
            System.out.print("Enter a number: ");
            double num = sc.nextDouble();
            if (num <= 0) {
                break;
            }

            arr[index] = num;
            sum += num;
            index++;
        }
        System.out.println("Numbers: ");
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nSum of numbers = " + sum);
    }
}
