package abstract_factory_pattern;

public class MaleYellowHuman extends AbstractYellowHuman {
    @Override
    public void getSex() {
        System.out.println("黄人男性");
    }
}
