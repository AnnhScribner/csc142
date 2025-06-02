/**
 * @author Anna Scribner
 * @version March 11, 2025
 *
 */

package src;

public class OPhone9 extends OPhone {
    private static final String SUFFIX = "9";
    private static double PRICE_RATIO = 0.8;
    private static final String SCREEN = "5.6\"";
    private static final int ADD_COMM = 1;
    private static final int ADD_CAM = 2;
    private static final String VID_RES = "1080p";

    /**
     * {@inheritDoc}
     */
    @Override
    public String getName() {
        return super.getName() + SUFFIX;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double getPrice() {
        return (double) (Math.round( super.getPrice() *PRICE_RATIO / 10) * 10);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getComm() {
        return super.getComm() + ADD_COMM;
    }

    /**
     *
     * @return
     */
    public String getScreen() {
        return SCREEN;
    }

    /**
     *
     * @return
     */
    public int getCam(){
        return super.getCam() + ADD_CAM ;
    }

    /**
     *
     * @return
     */
    public String getVidRes() {
        return VID_RES ;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return super.toString() + String.format(", Screen: %s, Vid Res: %s", getScreen(), getVidRes());
    }
}
