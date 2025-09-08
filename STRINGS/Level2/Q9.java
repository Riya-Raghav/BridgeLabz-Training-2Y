import java.util.*;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String p1 = sc.nextLine();
        String p2 = sc.nextLine();
        if (p1.equals(p2)) System.out.println("Draw");
        else if ((p1.equals("rock") && p2.equals("scissors")) ||
                 (p1.equals("scissors") && p2.equals("paper")) ||
                 (p1.equals("paper") && p2.equals("rock")))
            System.out.println("Player 1 wins");
        else
            System.out.println("Player 2 wins");
    }
}
