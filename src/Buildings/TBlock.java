package Buildings;

public class TBlock extends Building{
    
    /**
     * Constructor of a T-Block building
     */
    public TBlock() {
        super("T-block", 2, null, Orientation.NULL);
        boolean BuildingShape[][] = {
            {false, false, false},
            {false, true, false},
            {true, true, true},
        };
        Shape OBlockshape = new Shape(BuildingShape, 3);
        super.setShape(OBlockshape);
    }
}
