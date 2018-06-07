package composite_pattern.transparent_composite;


import java.util.ArrayList;

//树叶节点
public class Leaf extends Component {
    public void doSomething() {

    }

    @Deprecated
    public void add(Component component) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public void remove(Component component) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public ArrayList<Component> getChildren() {
        throw new UnsupportedOperationException();
    }
}
