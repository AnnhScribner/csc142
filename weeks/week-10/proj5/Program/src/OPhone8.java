/**
 * @author Anna Scribner
 * @version March 11, 2025
 *
 */

package src;

public class OPhone8 extends OPhone {
    private static final String SUFFIX = "8";
    private static final double PRICE_RATIO = 0.6;
    private static final String SCREEN = "5.5\"";
    private static final String VID_RES = "720p";

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
     *
     * @return the size of the screen
     */
    public String getScreen() {
        return SCREEN;
    }

    /**
     *
     * @return video solution in pixels
     */
    public String getVidRes() {
        return VID_RES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return super.toString() + String.format(", Screen: %s, Vid Res: %s", getScreen(), getVidRes());
    }
}
