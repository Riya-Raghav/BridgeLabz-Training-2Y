import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.split(" ");
        System.out.println("Count: " + words.length);
        for (String w : words) {
            System.out.println(w + " -> " + w.length());
        }
    }
}
