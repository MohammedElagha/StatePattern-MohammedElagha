package StatePattern;

public class WaitState implements GameState{

    @Override
    public void doAction(Player player) {
        System.out.println("Player #" + player.getID() + " " + player.getName() + " is in wait state");
        player.setState(this);
    }
    
    @Override
    public void view() {
        System.out.println("Wait State...");
    }
    
}
