/**
 * Simple class to demonstrate java documentation.
 *
 * @author Bill Barry
 * @version Jan 15, 2025
 */
public class JavaDocStarter {

    public static void main(String[] args) {
        int dogYears = 16;
        int humanYears = dogToHumanAge(dogYears);
        System.out.print('\u000c');
        System.out.printf("%d dog years is equivalent to %d human years", dogYears, humanYears);

    }

    /**
     * Calculate the equivalent age in human years.
     *
     * @param dogAge the age of the dog
     * @return the equivalent in human years
     */
    public static int dogToHumanAge(int dogAge) {
        return dogAge * 7;
    }
}
