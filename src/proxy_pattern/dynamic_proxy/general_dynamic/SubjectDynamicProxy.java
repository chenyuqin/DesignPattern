package proxy_pattern.dynamic_proxy.general_dynamic;

import java.lang.reflect.InvocationHandler;

//具体业务的动态代理
public class SubjectDynamicProxy extends DynamicProxy {
    public static <T> T newProxyInstance(Subject subject){
        ClassLoader loader = subject.getClass().getClassLoader();
        Class<?>[] classes = subject.getClass().getInterfaces();
        InvocationHandler handler = new MyInvocationHandler(subject);
        return newProxyInstance(loader, classes, handler);
    }
}
