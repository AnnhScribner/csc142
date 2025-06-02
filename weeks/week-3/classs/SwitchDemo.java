/**
 * @author Anna Scribner
 * @version Jan 22, 2025
 */

public class SwitchDemo {
    public static void main(String[] args) {
        // clear console
        System.out.print('\u000c');
        // Analyzes a character:
        // - tell us if a vower
        // - tell us if a consonant
        // - tell us if one of the first four letters in alphabet

        char aChar = 'U';

        switch (aChar) {
            case 'A':
                System.out.println(aChar + " is one of first four");
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(aChar + " is a vowel.");
                break;
            case 'B':
            case 'C':
            case 'D':
                System.out.println(aChar + " is one of first four");
            default:
                System.out.println(aChar + " is consonant.");
                break;
        }
    }
}
