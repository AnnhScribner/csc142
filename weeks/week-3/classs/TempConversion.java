/**
 * Provides temperature conversion functions between degrees C, F, and K
 *
 * @author      Bill Barry
 * @version     2017-01-17
 */
public class TempConversion {

    /**
     * Converts Fahrenheit to Celsius
     *
     * @param  degF   temperature, in degrees Fahrenheit
     * @return        temperature, in degrees Celcius
     */
    public static double fToC(double degF) {
        return (degF - 32.0) * 5.0 / 9.0;
    }

    /**
     * Converts Fahrenheit to Kelvin
     *
     * @param  degF   temperature, in degrees Fahrenheit
     * @return        temperature, in degrees Kelvin
     */
    public static double fToK(double degF) {
        return (degF + 459.67) * 5.0 / 9.0;
    }

    /**
     * Converts Celsius to Fahrenheit
     *
     * @param  degC   temperature, in degrees Celsius
     * @return        temperature, in degrees Fahrenheit
     */
    public static double cToF(double degC) {
        return degC * 9.0 / 5.0 + 32.0;
    }

    /**
     * Converts Celsius to Kelvin
     *
     * @param  degC   temperature, in degrees Celsius
     * @return        temperature, in degrees Kelvin
     */
    public static double cToK(double degC) {
        return degC + 273.15;
    }

    /**
     * Converts Kelvin to Fahrenheit
     *
     * @param  degK   temperature, in degrees Kelvin. It must be nonnegative
     * @return        temperature, in degrees Fahrenheit
     */
    public static double kToF(double degK) {
        if (degK < 0){
            // crash the program
            throw new IllegalArgumentException("Kelvin degree must be positive");
        }
        return degK * 9.0 / 5.0 - 459.67;
    }

    /**
     * Converts Kelvin to Celsius
     *
     * @param  degK   temperature, in degrees Kelvin. It must be nonnegative
     * @return        temperature, in degrees Celsius
     */
    public static double kToC(double degK) {
        if (degK < 0){
            // crash the program
            throw new IllegalArgumentException("Kelvin degree must be positive");
        }
        return degK - 273.15;
    }
}
