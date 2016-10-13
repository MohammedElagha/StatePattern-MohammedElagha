package StatePattern;

public class Test {
    public static void main(String[] args) {
        Player player = new Player(11201, "Ahmed");

        StartState startState = new StartState();
        startState.doAction(player);
        player.getState().view();
        
        WaitState waitState = new WaitState();
        waitState.doAction(player);
        player.getState().view();

        EndState endState = new EndState();
        endState.doAction(player);
        player.getState().view();
    }
}
