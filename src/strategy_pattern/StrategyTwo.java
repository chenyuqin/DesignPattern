package strategy_pattern;

public class StrategyTwo implements IStrategy {
    @Override
    public void operate() {
        System.out.println("执行第二个策略！");
    }
}
