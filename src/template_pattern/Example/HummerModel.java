package template_pattern.Example;

public abstract class HummerModel {
    protected abstract void start();
    protected abstract void stop();
    protected abstract void alarm();
    protected abstract void engineBoom();
    public final void run(){ //抽象模板，不允许被覆写
        this.start();
        this.engineBoom();
        this.alarm();
        this.stop();
    }
}
