package HW7;

import java.util.Random;

public class Arrays {
    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(201) - 100;
        }

        int sumNegative = 0;
        int countEven = 0;
        int countOdd = 0;
        int min = array[0];
        int minIndex = 0;
        int max = array[0];
        int maxIndex = 0;

        boolean foundFirstNegative = false;
        int sumAfterFirstNegative = 0;
        int countAfterFirstNegative = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                sumNegative += array[i];
            }

            if (array[i] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }

            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }

            if (foundFirstNegative) {
                sumAfterFirstNegative += array[i];
                countAfterFirstNegative++;
            }
            if (!foundFirstNegative && array[i] < 0) {
                foundFirstNegative = true;
            }
        }

        double averageAfterFirstNegative = (countAfterFirstNegative > 0) ? (double) sumAfterFirstNegative / countAfterFirstNegative : 0;

        System.out.print("Елементи масиву: ");
        for (int num : array) {
            System.out.print(num + ", ");
        }
        System.out.println();

        System.out.println("Сума від'ємних чисел: " + sumNegative);
        System.out.println("Кількість парних чисел: " + countEven);
        System.out.println("Кількість непарних чисел: " + countOdd);
        System.out.println("Найменший елемент: " + min + " (з індексом " + minIndex + ")");
        System.out.println("Найбільший елемент: " + max + " (з індексом " + maxIndex + ")");
        System.out.println("Середнє арифметичне чисел після першого від'ємного числа: " + averageAfterFirstNegative);
    }
}