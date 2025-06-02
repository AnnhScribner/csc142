/**
 * @author Anna Scribner
 * @version March 11, 2025
 *
 */

package src;

public class OPhone9Max extends OPhone9{
    private static final String SUFFIX = "Max";
    private static double PRICE_RATIO = 1.2;
    private static final String SCREEN = "6.5\"";

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
    public String getScreen() {
        return SCREEN;
    }
}
