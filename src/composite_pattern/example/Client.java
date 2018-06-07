package composite_pattern.example;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {

    }

    public static String getTreeInfo(Branch root){
        ArrayList<Corp> subordinateList = root.getSubordinateList();
        String info = "";
        for (Corp s : subordinateList) {
            if (s instanceof Leaf) { //代表叶子节点
                info = info + s.getInfo() + "\n";
            } else { //代表树枝节点
                info = info + s.getInfo() + "\n" + getTreeInfo((Branch)s);
            }
        }
        return info;
    }
}
