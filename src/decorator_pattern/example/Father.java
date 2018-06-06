package decorator_pattern.example;

public class Father {
    public static void main(String[] args) {
        SchoolReport sr = new SortDecorator(new HighScoreDecorator(new FouthGradeSchoolReport()));
        sr.report();
        sr.sign("老三");
    }
}
