import java.util.Scanner;

public class SimpleCalendar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startDay = sc.nextInt();  // 0 = Sun, 1 = Mon, ..., 6 = Sat
        int totalDays = sc.nextInt();

        for (int i = 0; i < startDay; i++)
            System.out.print("    ");

        for (int i = 1; i <= totalDays; i++) {
            System.out.printf("%3d ", i);
            if ((i + startDay) % 7 == 0)
                System.out.println();
        }
    }
}
