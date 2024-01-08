public class FancyMessageFormatter implements MessageFormatter {
    @Override
    public String format(String message) {
        return "[Fancy Formatter] *** " + message + " ***";
    }
}
