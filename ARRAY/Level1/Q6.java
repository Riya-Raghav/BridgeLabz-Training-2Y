import java.util.*;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double height[] = new double[11];
        double sum = 0;
        for (int i = 0; i < height.length; i++) {
            System.out.print("Enter height of player " + (i + 1) + ": ");
            height[i] = sc.nextDouble();
            sum += height[i];
        }
        double mean = sum / height.length;
        System.out.println("Mean height of football team = " + mean);
    }
}
