import java.util.*;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if (!Character.isLetter(ch)) System.out.println("Not a letter");
        else if ("aeiouAEIOU".indexOf(ch) != -1) System.out.println("Vowel");
        else System.out.println("Consonant");
    }
}
