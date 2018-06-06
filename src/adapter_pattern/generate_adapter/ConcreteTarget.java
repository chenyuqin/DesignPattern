package adapter_pattern.generate_adapter;

//目标角色的实现类
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("call me!");
    }
}
