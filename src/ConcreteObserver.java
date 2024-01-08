public class ConcreteObserver implements Observer {

    private String name;

    private ConcreteSubject subject;

    public ConcreteObserver(String name, ConcreteSubject subject) {
        this.name = name;
        this.subject = subject;
        subject.addObserver(this);
    }

    @Override
    public void update() {
        System.out.printf("Observer %s has been notified. New state: %s\n", name, subject.getState());
    }
}
