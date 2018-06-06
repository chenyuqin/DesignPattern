package template_pattern.Example;

public class HummerH1Model extends HummerModel {
    @Override
    protected void start() {
        System.out.println("H1发动");
    }

    @Override
    protected void stop() {
        System.out.println("H1停车");
    }

    @Override
    protected void alarm() {
        System.out.println("H1鸣笛");
    }

    @Override
    protected void engineBoom() {
        System.out.println("H1引擎");
    }
}
