package proxy_pattern.dynamic_proxy.general_dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

//动态代理类
public class DynamicProxy<T> {
    public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler handler) {
        return (T)Proxy.newProxyInstance(loader, interfaces, handler);
    }
}
