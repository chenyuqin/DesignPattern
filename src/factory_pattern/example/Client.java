package factory_pattern.example;

public class Client {
    public static void main(String[] args) {
        AbstractHumanFactory factory = new HumanFactory();
        WhiteHuman whiteHuman = factory.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();
    }
}
