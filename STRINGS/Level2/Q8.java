import java.util.*;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] marks = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) marks[i][j] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int sum = marks[i][0] + marks[i][1] + marks[i][2];
            double avg = sum / 3.0;
            System.out.println("Student " + (i+1) + " Avg: " + avg);
        }
    }
}
