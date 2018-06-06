package responsibility_pattern;

public class Father extends Handler {
    public Father() {
        super(Handler.FATHER_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("--女儿向父亲请示--");
        System.out.println(women.getRequest());
        System.out.println("父亲答应！");
    }
}
