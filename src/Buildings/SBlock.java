package Buildings;

public class SBlock extends Building{
    
    /**
     * Constructor of a S-Block building
     */
    public SBlock() {
        super("S-block", 2, null, Orientation.NULL);
        boolean BuildingShape[][] = {
            {false, false, false},
            {false, true, true},
            {true, true, false},
        };
        Shape OBlockshape = new Shape(BuildingShape, 3);
        super.setShape(OBlockshape);
    }
}
