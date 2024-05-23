package HW9;

import java.security.SecureRandom;
import java.util.Random;

public class Lesson9 {

    public static void main(String[] args) {

        Random random = new SecureRandom();
        int [][] arr = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++){
                arr[i][j] = random.nextInt(51) + 1;
            }
        }
        System.out.println("Matrix 4x4: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%4d", arr[i][j]);
            }
            System.out.println();
        }

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i % 2 == 0){
                    evenSum += arr[i][j];
                } else {
                    oddSum += arr[i][j];
                }
            }
        }

        int evenProduct = 1;
        int oddProduct = 1;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j % 2 == 0){
                    evenProduct *= arr[i][j];
                } else {
                    oddProduct *= arr[i][j];
                }
            }
        }
        System.out.println("\nSum of elements in even rows: " + evenSum);
        System.out.println("Sum of elements in odd rows: " + oddSum);
        System.out.println("Product of elements in even columns: " + evenProduct);
        System.out.println("Product of elements in odd columns: " + oddProduct);

        int magicSum = 0;
        for (int j = 0; j < 4; j++) {
            magicSum += arr[0][j];
        }
        boolean magicSquare = true;
        for (int i = 0; i < 4; i++) {
            int rowSum = 0;
            for (int j = 0; j < 4; j++) {
                rowSum += arr[i][j];
            }
            if (rowSum != magicSum){
                magicSquare = false;
                break;
            }
        }
        if (magicSquare){
            for (int j = 0; j < 4; j++) {
                int colSum = 0;
                for (int i = 0; i < 4; i++) {
                    colSum += arr[i][j];
                }
                if (colSum != magicSum){
                    magicSquare = false;
                    break;
                }
            }
        }
        if(magicSquare){
            int diag1Sum = 0;
            int diag2Sum = 0;
            for (int i = 0; i < 4; i++) {
                diag1Sum += arr[i][i];
                diag2Sum += arr[i][3-i];
            }
            if (diag1Sum != magicSum || diag2Sum != magicSum){
                magicSquare = false;
            }
        }
        System.out.println("\nIs the matrix a magic square? " + magicSquare);
    }
}