package abstract_factory_pattern;

public abstract class AbstractWhiteHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("白色人种");
    }

    @Override
    public void talk() {
        System.out.println("白色人种说话");
    }
}
