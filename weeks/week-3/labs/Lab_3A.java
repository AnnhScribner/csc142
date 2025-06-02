/**
 * @author Anna Scribner
 * @version Jan 21, 2025
 */

public class Lab_3A {
    public static void main(String[] args) {
        //System.out.println(daysInMonth(2));

        int a = 43, b = 42;
        if (minimum(a, b)) {
            System.out.println("a is the smallest!");
        }

    }
    public static boolean minimum(int a, int b){
        return a < b;
    }
    /**
     * A method that receives an integer that represents a month
     * and return the number of days that that specific month has
     *
     * @param month
     * @return numberOfDays
     */
    public static int daysInMonth(int month) {
        int numberOfDays;

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                numberOfDays = 31;
                break;
            case 2:
                numberOfDays = 28;
                break;
            case 4, 6, 9, 11:
                numberOfDays = 30;
                break;

            default:
                numberOfDays = -99;
        }
        return numberOfDays;
    }
}
