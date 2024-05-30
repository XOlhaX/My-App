package HW10;

import java.util.Scanner;

public class Lesson10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть ціле число для обчислення його квадрата: ");
        int number = scanner.nextInt();
        printSquare(number);

        System.out.print("Введіть радіус циліндра: ");
        double radius = scanner.nextDouble();
        System.out.print("Введіть висоту циліндра: ");
        double height = scanner.nextDouble();
        double volume = calculateCylinderVolume(radius, height);
        System.out.println("Об'єм циліндра: " + volume);

        System.out.print("Введіть розмір масиву: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        System.out.println("Введіть елементи масиву:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        int sum = sumArray(numbers);
        System.out.println("Сума масиву: " + sum);

        scanner.nextLine();
        System.out.print("Введіть рядок для реверсу: ");
        String inputString = scanner.nextLine();
        String reversed = reverseString(inputString);
        System.out.println("Реверс рядка: " + reversed);

        System.out.print("Введіть основу (a) для обчислення a^b: ");
        int base = scanner.nextInt();
        System.out.print("Введіть показник (b) для обчислення a^b: ");
        int exponent = scanner.nextInt();
        int powerResult = power(base, exponent);
        System.out.println("Результат " + base + "^" + exponent + ": " + powerResult);

        System.out.print("Введіть кількість повторень: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введіть текст: ");
        String text = scanner.nextLine();
        repeatText(n, text);

        scanner.close();
    }

    public static void printSquare(int number) {
        int square = power(number, 2);
        System.out.println("Квадрат числа " + number + " = " + square);
    }

    public static double calculateCylinderVolume(double radius, double height) {
        return Math.PI * power(radius, 2) * height;
    }

    public static int sumArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }

    public static int power(double a, int b) {
        return (int) Math.pow(a, b);
    }

    public static void repeatText(int n, String text) {
        for (int i = 0; i < n; i++) {
            System.out.println(text);
        }
    }
}