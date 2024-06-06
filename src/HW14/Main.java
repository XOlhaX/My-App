package HW14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Printer printer = new MessagePrinter();

        System.out.print("Введіть ім'я користувача: ");
        String sender = scanner.nextLine();

        System.out.print("Введіть текст повідомлення: ");
        String text = scanner.nextLine();

        Printer.Message message = new Printer.Message(text, sender);

        printer.print(message);

        scanner.close();
    }
}