/**
 * @author Anna Scribner
 * @version Jan 24, 2025
 */
public class Exceptions {
    public static void main(String[] args) {
        int dogYears = -12;
        int humanYears = dogToHumanAge(dogYears);
        System.out.print('\u000c');
        System.out.printf("%d dog years is equivalent to %d human years", dogYears, humanYears);
    }

    /**
     *  Calculates the equivalent agr, in human years, of
     *  a specified dog age
     *
     * @param dogAge the age of the dog must be nonnegative
     * @return the equivalent in human years
     */
    public static int dogToHumanAge(int dogAge){
        if (dogAge < 0){ // this is an exception (precondition)
            throw new IllegalArgumentException("Age can't be negative.");
        }
        return dogAge * 7;
    }

}
