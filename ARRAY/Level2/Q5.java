import java.util.*;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double h[] = new double[n];
        double w[] = new double[n];
        double bmi[] = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter height(m) of person " + (i + 1) + ": ");
            h[i] = sc.nextDouble();
            System.out.print("Enter weight(kg): ");
            w[i] = sc.nextDouble();
            bmi[i] = w[i] / (h[i] * h[i]);
        }

        for (int i = 0; i < n; i++) {
            System.out.print("Person " + (i + 1) + " BMI=" + bmi[i] + " Status=");
            if (bmi[i] < 18.5) System.out.println("Underweight");
            else if (bmi[i] < 25) System.out.println("Normal");
            else if (bmi[i] < 30) System.out.println("Overweight");
            else System.out.println("Obese");
        }
    }
}
