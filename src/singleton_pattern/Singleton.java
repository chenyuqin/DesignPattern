package singleton_pattern;

//单例类
public class Singleton {

    public static final Singleton singleton = new Singleton();

    private Singleton() {

    }

    //只能通过该方法获得实例对象
    public static Singleton getInstance(){
        return singleton;
    }

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
    }
}
