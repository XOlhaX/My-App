package HW5;

import java.util.Scanner;

public class Taxes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть суму доходів:");

        double userNumber = sc.nextDouble();
        double result = (userNumber / 100) * 2.5;
        double result1 = (userNumber / 100) * 4.3;
        double result2 = (userNumber / 100) * 6.7;

        if (userNumber <= 10000) {
            System.out.printf("Сума податку = %.2f", result);
        } else if (25000 >= userNumber) {
            System.out.printf("Сума податку = %.2f", result1);
        } else {
            System.out.printf("Сума податку = %.2f", result2);
        }
    }
}