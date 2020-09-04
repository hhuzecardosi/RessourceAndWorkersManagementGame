/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buildings;

/**
 *
 * @author hhuzecardosi
 */
public class BuildingFactory {

    /**
     * Build a Building
     * @param a the building
     * @return the building we made
     */
    public static IBuilding build(Action a) {
        switch (a) {
            case APARTMENT:
                return new LBlock();
            case JUNKYARD:
                return new ZBlock();
            case FACTORY:
                return new IBlock();
            case LABORATORY:
                return new JBlock();
            case MINE:
                return new SBlock();
            case PARK:
                return new OBlock();
            case SOLAR_PANEL:
                return new TBlock();
            default:
                return null;
        }
    }
}
