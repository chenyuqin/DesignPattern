package abstract_factory_pattern;

public class MaleFactory implements HumanFactory {
    @Override
    public Human createYellowHuman() {
        return new MaleYellowHuman();
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
