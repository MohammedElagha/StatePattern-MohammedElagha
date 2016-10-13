package StatePattern;

public class StartState implements GameState{

    @Override
    public void doAction(Player player) {
        System.out.println("Player #" + player.getID() + " " + player.getName() + " is in start state");
        player.setState(this);
    }

    @Override
    public void view() {
        System.out.println("Start State...");
    }
    
}
