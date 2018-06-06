package proxy_pattern.dynamic_proxy.general_dynamic;

//真实主题
public class RealSubject implements Subject {
    @Override
    public void doSomething(String str) {
        System.out.println("do something!---->" + str);
    }
}
