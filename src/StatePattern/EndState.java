package StatePattern;

public class EndState implements GameState{

    @Override
    public void doAction(Player player) {
        System.out.println("Player #" + player.getID() + " " + player.getName() + " is in end state");
        player.setState(this);
    }
    
    @Override
    public void view() {
        System.out.println("End State...");
    }
    
}
