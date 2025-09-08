import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println(Arrays.equals(s1.toCharArray(), s2.toCharArray()));
        System.out.println(s1.equals(s2));
    }
}
