package singleton_pattern;

//实现高并发下的线程安全
public class Singleton_safe {
    public static Singleton_safe singleton = null;

    private Singleton_safe(){

    }

    //双重检查锁定
    public Singleton_safe getInstance(){
        if(singleton == null){
            synchronized (Singleton_safe.class){
                if(singleton == null){
                    singleton = new Singleton_safe();
                }
            }
        }
        return singleton;
    }
}
