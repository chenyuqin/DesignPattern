package decorator_pattern.example;

public class HighScoreDecorator extends Decorator {
    public HighScoreDecorator(SchoolReport sr) {
        super(sr);
    }

    private void reportHighScore(){
        System.out.println("最高成绩");
    }

    public void report(){
        this.reportHighScore();
        super.report();
    }
}
