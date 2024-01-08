public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        // Singleton pattern
        Singleton.getInstance().loadConfiguration("test load");
        Singleton.getInstance().saveConfiguration("test save");

        // Observer pattern
        ConcreteSubject subject = new ConcreteSubject();
        ConcreteObserver observer1 = new ConcreteObserver("Observer 1", subject);
        ConcreteObserver observer2 = new ConcreteObserver("Observer 2", subject);

        subject.setState(1);
        subject.setState(2);

        // Dependency injection
        MessageFormatter simpleFormatter = new SimpleMessageFormatter();
        MessageService simpleMessageService = new MessageService(simpleFormatter);
        simpleMessageService.sendMessage("Test");

        MessageFormatter fancyFormatter = new FancyMessageFormatter();
        MessageService fancyMessageService = new MessageService(fancyFormatter);
        fancyMessageService.sendMessage("Test");
    }
}
