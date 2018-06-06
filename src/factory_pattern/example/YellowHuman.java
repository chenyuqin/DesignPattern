package factory_pattern.example;

public class YellowHuman implements Human {

    @Override
    public void getColor() {
        System.out.println("皮肤黄色");
    }

    @Override
    public void talk() {
        System.out.println("黄人说话");
    }
}
