/**
 * @author Anna Scribner
 * @version March 11, 2025
 */

package src;

public class OPhone {
    private static final String SUFFIX = "OPhone";
    private static final double PRICE_RATIO = 790;
    private static final int COMM = 4;
    private static final int CAM = 8;

    /**
     *
     * @return Returns the name suffix of the phone.
     */
    public String getName() {
        return SUFFIX;
    }

    /**
     * Rounds the price to the nearest $10 and returns its result
     * @return the base price ratio of the phone.
     */
    public double getPrice() {
        return (double) (Math.round(PRICE_RATIO / 10) * 10);
    }

    /**
     *
     * @return the phone's communication capability in G (e.g., 4G).
     */
    public int getComm() {
        return COMM;
    }

    /**
     *
     * @return the phone's camera resolution in MP (megapixels).
     */
    public int getCam() {
        return CAM;
    }

    /**
     *
     * @return a formatted string containing the phone's name, rounded price,
     * communication standard, and camera resolution.
     */
    @Override
    public String toString() {
        return String.format("%s: Price $%,.2f, Comm: %dG, Camera: %dMP", getName(),
                getPrice(), getComm(), getCam());
    }
}
