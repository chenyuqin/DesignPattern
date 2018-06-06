package factory_pattern.factory_to_singleton;

import java.lang.reflect.Constructor;

public class SingletonFactory {
    private static Singleton singleton;

    static{
        try {
            Class c = Class.forName(Singleton.class.getName());
            Constructor constructor = c.getDeclaredConstructor();
            //设置无参构造是可访问的
            constructor.setAccessible(true);
            singleton = (Singleton)constructor.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Singleton getSingleton(){
        return singleton;
    }
}

