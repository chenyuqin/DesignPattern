package proxy_pattern.dynamic_proxy.example;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) throws Exception {
        IGamePlayer player = new GamePlayer("张三");
        InvocationHandler handler = new GamePlayIH(player);

        //获得类的class loader
        ClassLoader cl = player.getClass().getClassLoader();
        //动态产生一个代理者
        IGamePlayer proxy =
                (IGamePlayer) Proxy.newProxyInstance(cl, new Class[]{IGamePlayer.class}, handler);
        proxy.login("zhangsan", "pass");
        proxy.killBoss();
        proxy.upgrade();

    }
}
