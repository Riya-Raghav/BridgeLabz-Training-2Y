import java.util.Scanner;

public class CharFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String unique = "";
        
        for (int i = 0; i < str.length(); i++) {
            if (unique.indexOf(str.charAt(i)) == -1)
                unique += str.charAt(i);
        }
        
        for (int i = 0; i < unique.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (unique.charAt(i) == str.charAt(j))
                    count++;
            }
            System.out.println(unique.charAt(i) + ": " + count);
        }
    }
}
