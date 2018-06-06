package builder_pattern.example;

public class BMWModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("BMW发动");
    }

    @Override
    protected void stop() {
        System.out.println("BMW停车");
    }

    @Override
    protected void alarm() {
        System.out.println("BMW鸣笛");
    }

    @Override
    protected void engineBoom() {
        System.out.println("BMW引擎");
    }
}
