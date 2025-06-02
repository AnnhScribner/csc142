/*
A program that has one method that accepts two parameters:
a String and an integer representing a length.
The method should pad the parameter string with
spaces until its length is the given length.

@author Anna Scribner
@version Jan 14, 2025
 */

public class PadString {
    public static void main(String[] args) {
        System.out.println(padString("congratulations", 20));
    }
    /*
     * @param string
     * @param string
     * @return string
     */
    public static String padString(String string, int length) {
        String stringToBeReturned = "";

        int remainLength = length - string.length();

        // add spaces before the string chosen
        for (int i = 0; i < remainLength; i++) {
            stringToBeReturned += " ";
        }

        // add string chosen
        stringToBeReturned += string;

        return stringToBeReturned;
    }
}