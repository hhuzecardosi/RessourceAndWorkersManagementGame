package Buildings;

/**
 *
 * @author hhuzecardosi
 */
public class OBlock extends Building {

    /**
     * Construct a O-Block building
     */
    public OBlock() {
        super("O-block", 8, null, Orientation.NULL);
        boolean BuildingShape[][] = {
            {true, true},
            {true, true}
        };
        Shape OBlockshape = new Shape(BuildingShape, 2);
        super.setShape(OBlockshape);
    }
}
