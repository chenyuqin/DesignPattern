package composite_pattern.transparent_composite;

import java.util.ArrayList;

//抽象构件，定义一些默认的行为或属性
public abstract class Component {
    //个体和整体都具有的共享
    public void doSomething() {
        //编写业务逻辑
    }

    //增加一个叶子构件或者树枝构件
    public abstract void add(Component component);

    public abstract void remove(Component component);

    public abstract ArrayList<Component> getChildren();
}
