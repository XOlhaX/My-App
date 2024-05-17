package HW8;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class Lesson8 {
    public static void main (String[] args){

        Random random = new SecureRandom();
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[15];

        System.out.print("Початковий вигляд масиву: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1, 100);
        }
        for (int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();

        for (int i = 1; i < arr.length; i++) {
            int sort = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > sort) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = sort;
        }
        System.out.print("Відсортований масив: ");
        for (int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Введіть число для пошуку: ");
        int target = sc.nextInt();

        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target){
                result = mid;
                break;
            }
            if (arr[mid] < target){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (result == -1){
            System.out.println("Число " + target + " не знайдено.");
        } else {
            System.out.println("Число " + target + " знайдено за таким індексом: " + result + ".");
        }
    }
}