import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int table[] = new int[10];
        for (int i = 0; i < 10; i++) {
            table[i] = n * (i + 1);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(n + " * " + (i + 1) + " = " + table[i]);
        }
    }
}
