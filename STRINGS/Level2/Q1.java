import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int len = 0;
        for (char c : s.toCharArray()) len++;
        System.out.println(len);
        System.out.println(s.length());
    }
}
