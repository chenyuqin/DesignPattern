package observer_pattern.example;

//观察者
public class Lisi implements Observer {
    @Override
    public void update(String context) {
        System.out.println("李斯发现韩非子活动！");
        this.reportToQinShiHuang(context);
        System.out.println("李斯报告完毕！");
    }

    private void reportToQinShiHuang(String reportContext) {
        System.out.println("李斯来报告说韩非子有活动了！");
    }
}
