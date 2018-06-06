package decorator_pattern.example;

public class FouthGradeSchoolReport extends SchoolReport {
    @Override
    public void report() {
        System.out.println("四年级成绩单报道：。。。");
    }

    @Override
    public void sign(String name) {
        System.out.println("家长签名:" + name);
    }
}
