package factory_pattern.example;

public class BlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("皮肤黑色");
    }

    @Override
    public void talk() {
        System.out.println("黑人说话");
    }
}
