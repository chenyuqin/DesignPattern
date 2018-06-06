package decorator_pattern.example;

public class SortDecorator extends Decorator {
    public SortDecorator(SchoolReport sr) {
        super(sr);
    }

    private void reportSort(){
        System.out.println("排名情况");
    }

    @Override
    public void report() {
        super.report();
        this.reportSort();
    }
}
