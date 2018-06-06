package strategy_pattern;

//策略的应用场景，此处利用组合
public class Context {
    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    //执行策略
    public void operate(){
        strategy.operate();
    }
}
