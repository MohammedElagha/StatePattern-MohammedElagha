package StatePattern;

public class Player {
    private int ID;
    private String name;
    private GameState state;

    public Player(){
       state = null;
    }

    public Player(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setState(GameState state){
       this.state = state;		
    }

    public GameState getState(){
       return state;
    }
}
