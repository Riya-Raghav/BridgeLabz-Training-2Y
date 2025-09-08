import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] weight = new double[10];
        double[] height = new double[10];
        for (int i = 0; i < 10; i++) {
            weight[i] = sc.nextDouble();
            height[i] = sc.nextDouble();
        }

        for (int i = 0; i < 10; i++) {
            double hInMeter = height[i] / 100;
            double bmi = weight[i] / (hInMeter * hInMeter);
            String status = (bmi <= 18.4) ? "Underweight" : (bmi <= 24.9) ? "Normal" : (bmi <= 39.9) ? "Overweight" : "Obese";
            System.out.println(height[i] + "\t" + weight[i] + "\t" + String.format("%.2f", bmi) + "\t" + status);
        }
    }
}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] personData = new double[10][2];
        for (int i = 0; i < 10; i++) {
            personData[i][0] = sc.nextDouble();
            personData[i][1] = sc.nextDouble();
        }

        String[][] result = new String[10][4];
        for (int i = 0; i < 10; i++) {
            double weight = personData[i][0];
            double height = personData[i][1];
            double bmi = calculateBMI(weight, height);
            result[i][0] = String.valueOf(height);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = getStatus(bmi);
        }

        displayData(result);
    }
}
