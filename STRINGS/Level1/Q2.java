import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int a = sc.nextInt();
        int b = sc.nextInt();
        String sub = s.substring(a, b);
        System.out.println(sub);
        System.out.println(s.substring(a, b));
    }
}
