package proxy_pattern.dynamic_proxy.general_dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
    private Object target = null;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //寻找JoinPoint连接点，AOP框架使用元数据定义
        if(true){
            //执行一个前置通知
            (new BeforeAdvice()).exec();
        }
        return method.invoke(this.target, args);
    }
}
