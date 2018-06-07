package observer_pattern.generate_observer;

import java.util.Observable;

//具体被观察者，继承Java为我们提供的被观察者类
public class ConcreteSubject extends Observable {
    public void doSometing() {
        System.out.println("doSomething");
        super.setChanged();
        super.notifyObservers();
    }
}
