package abstract_factory_pattern;

public class Client {
    public static void main(String[] args) {
        HumanFactory maleFactory = new MaleFactory();
        HumanFactory femaleFactory = new FemaleFactory();
        Human maleYellowHuman = maleFactory.createYellowHuman();
        Human femaleYellowHuman = femaleFactory.createYellowHuman();
        maleYellowHuman.getColor();;
        maleYellowHuman.getSex();
        maleYellowHuman.talk();
        System.out.println();
        femaleYellowHuman.getColor();
        femaleYellowHuman.getSex();
        femaleYellowHuman.talk();
    }
}
