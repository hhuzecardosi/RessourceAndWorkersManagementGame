package Buildings;

public enum Action {
    FACTORY("Produces 2 materials"),
    PARK("Allows the player to freely move any one worker"),
    SOLAR_PANEL("Produces two energy on even turns"),
    APARTMENT("For each two workers on the same building, "
            + "returns them to the player and add one outside the board"),
    LABORATORY("Draws a building from the pile"),
    MINE("Produce 1 material"),
    JUNKYARD("Discard a building chosen from the player's deck then draws another from the pile");
    
    String make;
    
    private Action(String action) {    
        make = action;
    }
    
    public String getMake(){
        return make;
    }
}
