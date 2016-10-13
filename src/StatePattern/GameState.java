package StatePattern;

public interface GameState {
    void doAction(Player player);
    void view();
}
