import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salary[] = new double[10];
        int years[] = new int[10];
        double bonus[] = new double[10];
        double total = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter salary of employee " + (i + 1) + ": ");
            salary[i] = sc.nextDouble();
            System.out.print("Enter years of service: ");
            years[i] = sc.nextInt();

            if (years[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = 0;
            }
            total += bonus[i] + salary[i];
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) + " salary: " + salary[i] + " bonus: " + bonus[i]);
        }
        System.out.println("Total payout: " + total);
    }
}
