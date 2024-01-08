public class SimpleMessageFormatter implements MessageFormatter {
    @Override
    public String format(String message) {
        return "[Simple Formatter] " + message;
    }
}
