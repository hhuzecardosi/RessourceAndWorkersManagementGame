package Buildings;

/**
 *
 * @author hhuzecardosi
 */
public class LBlock extends Building{
    
    /**
     * Constructor of a L-Block building
     */
    public LBlock() {
        super("L-block", 8, null, Orientation.NULL);
        boolean BuildingShape[][] = {
            {false, true, false},
            {false, true, false},
            {false, true, true},
        };
        Shape OBlockshape = new Shape(BuildingShape, 3);
        super.setShape(OBlockshape);
    }
}
