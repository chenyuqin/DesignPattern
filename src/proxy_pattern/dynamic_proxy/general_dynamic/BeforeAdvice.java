package proxy_pattern.dynamic_proxy.general_dynamic;

import com.sun.org.apache.bcel.internal.generic.IADD;

public class BeforeAdvice implements IAdvice {
    @Override
    public void exec() {
        System.out.println("我是前置通知，我被执行了！");
    }
}
