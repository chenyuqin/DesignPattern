package prototype_pattern.example;

import java.util.Random;

public class Client {
    private static int MAX_COUNT = 6;

    public static void main(String[] args) throws CloneNotSupportedException {
        int i = 0;
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("xx银行版权所有");
        while(i < MAX_COUNT){
            //通过对象复制来产生一个对象
            Mail cloneMail = mail.clone();
            cloneMail.setAppellation(new Random().nextInt(10) + "先生/女士");
            cloneMail.setReceiver(new Random().nextInt(30) + "@");
            System.out.println("邮件发送成功！");
            i++;
        }
    }
}
