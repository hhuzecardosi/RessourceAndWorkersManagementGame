package Buildings;

public class ZBlock extends Building {

    /**
     * Constructor of a Z-Block building
     */
    public ZBlock() {
        super("Z-block", 10, null, Orientation.NULL);
        boolean BuildingShape[][] = {
            {false, false, false},
            {true, true, false},
            {false, true, true}
        };
        Shape OBlockshape = new Shape(BuildingShape, 3);
        super.setShape(OBlockshape);
    }
}
