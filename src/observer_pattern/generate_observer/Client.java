package observer_pattern.generate_observer;


import java.util.Observer;

public class Client {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        Observer observer = new ConcreteObserver();
        subject.addObserver(observer);
        subject.doSometing();
    }
}
