package decorator_pattern.generate_decorator;

public class ConcreteComponent extends Component {
    @Override
    public void operate() {
        System.out.println("do something");
    }
}
