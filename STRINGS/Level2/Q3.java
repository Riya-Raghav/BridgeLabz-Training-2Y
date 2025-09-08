import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.split(" ");
        int[] arr = new int[words.length];
        for (int i = 0; i < words.length; i++) arr[i] = words[i].length();
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i] + " -> " + arr[i]);
        }
    }
}
