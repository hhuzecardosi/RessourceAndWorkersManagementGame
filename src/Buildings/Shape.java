package Buildings;

import java.util.Arrays;

/**
 *
 * @author hhuzecardosi
 */
public class Shape {

    /**
     * A shape is a matrice of boolean True means the building is on it
     */
    private boolean[][] shape;

    /**
     * Square shape
     */
    private final int SHAPE_SIZE;

    /**
     * Constuct a shape
     *
     * @param shape the shape of the building
     * @param SHAPE_SIZE the size of the square
     */
    public Shape(boolean[][] shape, int SHAPE_SIZE) {
        this.shape = shape;
        this.SHAPE_SIZE = SHAPE_SIZE;
    }

    /**
     * turn the shape of 180°
     */
    public void reverseShape() {

    }

    /**
     * Turn the shape to the right
     */
    public void turnShape() {
        boolean[][] replaceShape = new boolean[SHAPE_SIZE][SHAPE_SIZE];
        for (int i = 0; i < SHAPE_SIZE; i++) {
            for (int j = 0; j < SHAPE_SIZE; j++) {
                if (i == 0 && j == 0) {
                    replaceShape[i][j] = this.shape[0][SHAPE_SIZE - 1];
                } else if (i == SHAPE_SIZE - 1 && j == 0) {
                    replaceShape[i][j] = this.shape[0][0];
                } else if (i == 0 && j == SHAPE_SIZE - 1) {
                    replaceShape[i][j] = this.shape[SHAPE_SIZE - 1][SHAPE_SIZE - 1];
                } else if (i == SHAPE_SIZE - 1 && j == SHAPE_SIZE - 1) {
                    replaceShape[i][j] = this.shape[SHAPE_SIZE - 1][0];
                } else {
                    replaceShape[j][i] = this.shape[i][j];
                }
            }
        }
        this.shape = replaceShape.clone();
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Shape other = (Shape) obj;
        if (this.SHAPE_SIZE != other.SHAPE_SIZE) {
            return false;
        }
        return Arrays.deepEquals(this.shape, other.shape);
    }

    /**
     * Get the shape
     *
     * @return a copy of the shape of the building
     */
    public boolean[][] getShape() {
        boolean[][] shapeCopy;
        shapeCopy = shape.clone();
        return shapeCopy;
    }
}
