/**
 * @author Anna Scribner
 * @version March 11, 2025
 *
 */

package src;

public class OPhoneXFilm extends OPhoneX {
    private static final String SUFFIX = "Film";
    private static final double PRICE_RATIO = 1.25;
    private static final String VID_RES = "4k";
    private static final String EXTRA = "slow motion";

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
    public String getVidRes() {
        return VID_RES;
    }

    /**
     *
     * @return
     */
    public String getExtra() {
        return EXTRA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return super.toString() + String.format(", Extra: %s", getExtra());
    }
}
