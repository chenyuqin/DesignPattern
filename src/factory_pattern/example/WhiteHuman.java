package factory_pattern.example;

public class WhiteHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("皮肤白色");
    }

    @Override
    public void talk() {
        System.out.println("白人说话");
    }
}
