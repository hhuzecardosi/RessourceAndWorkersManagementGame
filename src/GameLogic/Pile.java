package GameLogic;

import Buildings.Action;
import Buildings.BuildingFactory;
import Buildings.IBuilding;
import java.util.ArrayList;
import java.util.Objects;

public class Pile {

    /**
     * The current pile of buildings
     */
    private ArrayList<IBuilding> buildingsPile;

    /**
     * The number of I-Block in the pile at the begining of the game
     */
    private final int NBFACTORY = 25;

    /**
     * The number of O-Block in the pile at the begining of the game
     */
    private final int OBLOCK = 10;

    /**
     * The number of T-Block in the pile at the begining of the game
     */
    private final int TBLOCK = 30;

    /**
     * The number of L-Block in the pile at the begining of the game
     */
    private final int LBLOCK = 20;

    /**
     * The number of J-Block in the pile at the begining of the game
     */
    private final int JBLOCK = 10;

    /**
     * The number of S-Block in the pile at the begining of the game
     */
    private final int SBLOCK = 30;

    /**
     * The number of Z-Block in the pile at the begining of the game
     */
    private final int ZBLOCK = 10;

    /**
     * Constructor of a pile
     */
    public Pile() {
        buildingsPile = new ArrayList<>();
        for (int i = 0; i < NBFACTORY; i++) {
            buildingsPile.add(BuildingFactory.build(Action.FACTORY));
        }
        for (int i = 0; i < OBLOCK; i++) {
            buildingsPile.add(BuildingFactory.build(Action.PARK));
        }
        for (int i = 0; i < TBLOCK; i++) {
            buildingsPile.add(BuildingFactory.build(Action.SOLAR_PANEL));
        }
        for (int i = 0; i < LBLOCK; i++) {
            buildingsPile.add(BuildingFactory.build(Action.APARTMENT));
        }
        for (int i = 0; i < JBLOCK; i++) {
            buildingsPile.add(BuildingFactory.build(Action.LABORATORY));
        }
        for (int i = 0; i < SBLOCK; i++) {
            buildingsPile.add(BuildingFactory.build(Action.MINE));
        }
        for (int i = 0; i < ZBLOCK; i++) {
            buildingsPile.add(BuildingFactory.build(Action.JUNKYARD));
        }
    }
    
    /**
     * Take a random building in the pile and eraise it
     * @return a building
     */
    public IBuilding takeBuilding(){
        int random = (int) (Math.random() * buildingsPile.size());
        IBuilding b = buildingsPile.get(random);
        buildingsPile.remove(b);
        return b;
    }

    /**
     * Test if two Pile are equals
     * @param obj a pile 
     * @return true if the pile are equals
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pile other = (Pile) obj;
        if (!Objects.equals(this.buildingsPile, other.buildingsPile)) {
            return false;
        }
        return true;
    }

}
