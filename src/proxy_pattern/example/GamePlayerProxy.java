package proxy_pattern.example;

public class GamePlayerProxy implements IGamePlayer {

    private IGamePlayer iGamePlayer = null;

    public GamePlayerProxy(IGamePlayer iGamePlayer) {
        this.iGamePlayer = iGamePlayer;
    }

    @Override
    public void login(String user, String password) {
        this.iGamePlayer.login(user, password);
    }

    @Override
    public void killBoss() {
        this.iGamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        this.iGamePlayer.upgrade();
    }
}
