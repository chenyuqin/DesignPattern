package abstract_factory_pattern;

public class FemaleFactory implements HumanFactory {
    @Override
    public Human createYellowHuman() {
        return new FemaleYellowHuman();
    }

    @Override
    public Human createBlackHuman() {
        return null;
    }

    @Override
    public Human createWhiteHuman() {
        return null;
    }
}
