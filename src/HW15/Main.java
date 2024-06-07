package HW15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Advisor advisor = new DayAdvisor();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the serial number of the day of the week: ");
        int dayNumber = scanner.nextInt();

        if (dayNumber < 1 || dayNumber > 7) {
            System.out.println("Invalid day of week number. Please enter a number from 1 to 7.");
        } else {
            Day day = Day.values()[dayNumber - 1];
            System.out.print(day + ": ");
            advisor.advise(day);
        }

        scanner.close();
    }
}