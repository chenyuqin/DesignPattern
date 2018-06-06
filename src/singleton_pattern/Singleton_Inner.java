package singleton_pattern;

//静态内部类实现，既保证了线程安全，又避免了同步带来的性能影响
public class Singleton_Inner {

    private static class LazyHolder{
        private static final Singleton_Inner singleton = new Singleton_Inner();
    }

    private Singleton_Inner(){

    }

    public static final Singleton_Inner getInstance(){
        return LazyHolder.singleton;
    }
}
