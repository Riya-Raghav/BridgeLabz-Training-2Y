import java.util.Scanner;

public class MonthDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int year = sc.nextInt();

        String[] months = { "January", "February", "March", "April", "May", "June",
                            "July", "August", "September", "October", "November", "December" };

        int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        if (month == 2 && (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)))
            days[1] = 29;

        System.out.println(months[month - 1]);
        System.out.println(days[month - 1]);
    }
}
