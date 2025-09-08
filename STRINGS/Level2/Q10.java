import java.util.*;

public class Q10 {
    static String grade(double p) {
        if (p >= 80) return "Level 4";
        if (p >= 70) return "Level 3";
        if (p >= 60) return "Level 2";
        if (p >= 50) return "Level 1";
        return "Remedial";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] marks = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) marks[i][j] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int sum = marks[i][0] + marks[i][1] + marks[i][2];
            double per = sum / 3.0;
            System.out.println("Student " + (i+1) + " -> " + per + "% " + grade(per));
        }
    }
}
