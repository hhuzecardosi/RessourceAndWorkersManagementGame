package Buildings;

/**
 *
 * @author hhuzecardosi
 */
public class JBlock extends Building{
    
    /**
     * Constructor of a J-Block building
     */
    public JBlock() {
        super("J-block", 8, null, Orientation.NULL);
        boolean BuildingShape[][] = {
            {false, true, false},
            {false, true, false},
            {true, true, false},
        };
        Shape OBlockshape = new Shape(BuildingShape, 3);
        super.setShape(OBlockshape);
    }
}
