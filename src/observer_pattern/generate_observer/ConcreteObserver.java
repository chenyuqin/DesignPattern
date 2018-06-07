package observer_pattern.generate_observer;

import java.util.Observable;
import java.util.Observer;

//具体观察者，实现Java为我们提供的观察者接口
public class ConcreteObserver implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("接收信息并处理");
    }
}
