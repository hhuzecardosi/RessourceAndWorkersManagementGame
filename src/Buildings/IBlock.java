package Buildings;

/**
 *
 * @author hhuzecardosi
 */
public class IBlock extends Building{
    
    /**
     * Constructoe of a I-Block building
     */
    public IBlock() {
        super("I-block", 4, null, Orientation.NULL);
        boolean BuildingShape[][] = {
            {true, true, true, true},
            {false, false, false, false},
            {false, false, false, false},
            {false, false, false, false},
        };
        Shape OBlockshape = new Shape(BuildingShape, 4);
        super.setShape(OBlockshape);
    }
}
