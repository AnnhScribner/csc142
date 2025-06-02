/**
 * @author Anna Scribner
 * @version March 11, 2025
 *
 */

package src;

public class OPhone8Mini extends OPhone8 {
    private static final String SUFFIX = "Mini";
    private static final double PRICE_RATIO = 1.1;
    private static final String SCREEN = "4.6\"";

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
