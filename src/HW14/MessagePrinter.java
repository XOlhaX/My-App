package HW14;
public class MessagePrinter implements Printer {

    @Override
    public void print(Message message) {
        if ((message.getSender() == null || message.getSender().isEmpty()) &&
                (message.getText() == null || message.getText().isEmpty())) {
            Printer anonymousPrinter = new Printer() {
                @Override
                public void print(Message msg) {
                    System.out.println("Опрацьовується пусте повідомлення від анонімного користувача...");
                }
            };
            anonymousPrinter.print(message);
        } else if (message.getSender() == null || message.getSender().isEmpty()) {
            System.out.println("Анонімний користувач відправив повідомлення: " + message.getText());
        } else {
            System.out.println("Користувач " + message.getSender() + " відправив повідомлення: " + message.getText());
        }
    }
}