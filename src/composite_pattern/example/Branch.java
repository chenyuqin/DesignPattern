package composite_pattern.example;

import java.util.ArrayList;

public class Branch extends Corp {

    ArrayList<Corp> subordinateList = new ArrayList<>();

    public Branch(String name, String position, int salary) {
        super(name, position, salary);
    }

    public void addSubordinateList(Corp corp){
        corp.setParent(this);
        this.subordinateList.add(corp);
    }

    public ArrayList<Corp> getSubordinateList(){
        return this.subordinateList;
    }
}
