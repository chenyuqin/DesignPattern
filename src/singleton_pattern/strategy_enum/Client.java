package strategy_pattern.strategy_enum;

public class Client {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        String symbol = args[1];
        int b = Integer.parseInt(args[2]);

        System.out.println("运行[+]结果:" + Calculator.ADD.exec(a, b));
    }
}
