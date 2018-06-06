package strategy_pattern;

public class StrategyThree implements IStrategy {
    @Override
    public void operate() {
        System.out.println("执行第三个策略！");
    }
}
