package builder_pattern.example;

public class BenzModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("Benz发动");
    }

    @Override
    protected void stop() {
        System.out.println("Benz停车");
    }

    @Override
    protected void alarm() {
        System.out.println("Benz鸣笛");
    }

    @Override
    protected void engineBoom() {
        System.out.println("Benz引擎");
    }
}
