package HW6;

public class Loops {
    public static void main(String[] args) {

        int any = 0;
        for (int i = 1; i <= 6; i++) {
            any += i;
            System.out.println(i + ") Num is " + i + ", sum is " + any);
        }
        System.out.println("------------------------");
        System.out.println("Sum of numbers is " + any);
    }
}


