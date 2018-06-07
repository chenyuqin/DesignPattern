package composite_pattern.example;

public abstract class Corp {
    private String name = "";
    private String position = "";
    private int salary = 0;

    private Corp parent = null;

    public Corp(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getInfo() {
        return "" + this.name + this.position + this.salary;
    }

    protected void setParent(Corp corp) {
        this.parent = corp;
    }

    public Corp getParent() {
        return this.parent;
    }
}
