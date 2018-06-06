package strategy_pattern;

//策略的调用者
public class Caller {
    public static void main(String[] args) {
        Context context;

        System.out.println("------执行第一个策略------");
        context = new Context(new StrategyOne());
        context.operate();
        System.out.println();

        System.out.println("------执行第二个策略------");
        context = new Context(new StrategyTwo());
        context.operate();
        System.out.println();

        System.out.println("------执行第三个策略------");
        context = new Context(new StrategyThree());
        context.operate();
        System.out.println();
    }
}
