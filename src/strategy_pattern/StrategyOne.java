package strategy_pattern;

public class StrategyOne implements IStrategy {
    @Override
    public void operate() {
        System.out.println("执行第一个策略！");
    }
}
