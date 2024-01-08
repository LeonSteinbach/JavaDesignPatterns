public class MessageService {

    private final MessageFormatter formatter;

    public MessageService(MessageFormatter formatter) {
        this.formatter = formatter;
    }

    public void sendMessage(String message) {
        String formattedMessage = formatter.format(message);
        System.out.printf("Sending message: %s\n", formattedMessage);
    }

}
