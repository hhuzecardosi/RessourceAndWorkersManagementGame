package Buildings;

import java.util.Objects;

/**
 *
 * @author hhuzecardosi
 */
public abstract class Building implements IBuilding {
    
    /**
     * The name of the building
     */
    private final String name;
    
    /**
     * The cost of a building to be make on the board
     */
    private int productionCost;
    
    /**
     * The shape of the building
     */
    private Shape shape;
    
    /**
     * The orientation of the building
     */
    private Orientation orientation;
    
    /**
     * The number we can put on one building in maximum
     */
    private final int MAX_WORKERS = 4;

    /**
     * Construct a building
     * @param name the name of the building
     * @param productionCost the cost for make a building
     * @param shape the shape of a building
     * @param orientation the orientation of a building
     */
    public Building(String name, int productionCost, Shape shape, Orientation orientation) {
        this.name = name;
        this.productionCost = productionCost;
        this.shape = shape;
        this.orientation = orientation;
    }
    
    @Override
    public void endTurnAction(){
        
    }

    /**
     * Set the shape of a building
     * @param shape the new shape
     */
    public void setShape(Shape shape) {
        this.shape = shape;
    }

    /**
     * Get the shape of the building
     * @return the current shape
     */
    @Override
    public Shape getShape() {
        return shape;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

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
        final Building other = (Building) obj;
        return Objects.equals(this.name, other.name);
    }
}
