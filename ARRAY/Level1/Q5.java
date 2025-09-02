import java.util.*;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int table[] = new int[4];
        for (int i = 0; i < table.length; i++) {
            table[i] = n * (i + 6);
        }
        for (int i = 0; i < table.length; i++) {
            System.out.println(n + " * " + (i + 6) + " = " + table[i]);
        }
    }
}
