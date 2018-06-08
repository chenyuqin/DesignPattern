package facade_pattern.example;

//子系统，也就是被委托的对象，可能有多个
public class LetterProcessImpl implements ILetterProcess {
    @Override
    public void writeContext(String context) {
        System.out.println("填写信的内容：" + context);
    }

    @Override
    public void fillEnvelope(String address) {
        System.out.println("填写收件人地址及姓名：" + address);
    }

    @Override
    public void letterInotoEnvelope() {
        System.out.println("把信放信封");
    }

    @Override
    public void sendLetter() {
        System.out.println("邮递信件");
    }
}
