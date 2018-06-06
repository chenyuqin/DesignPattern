package command_pattern;

public class Client {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        Receiver receiver = new ConcreteReceiver();
        Command command = new ConcreteCommand(receiver);
        invoker.setCommand(command);
        invoker.action();
    }
}
