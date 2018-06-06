package template_pattern.Example;

public class HummerH2Model extends HummerModel {
    @Override
    protected void start() {
        System.out.println("H2发动");
    }

    @Override
    protected void stop() {
        System.out.println("H2停车");
    }

    @Override
    protected void alarm() {
        System.out.println("H2鸣笛");
    }

    @Override
    protected void engineBoom() {
        System.out.println("H2引擎");
    }
}
