/**
 * @author Anna Scribner
 * @version March 3, 2025
 * <p>
 * Demonstrates the language Manager
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        LanguageManager lm = new LanguageManager(new File("datafiles/languages.txt"));

        System.out.println("Number of languages: " + lm.getLanguageCount());
        System.out.println("Shortest keyword has length of " + lm.findShortestKwdLength());
        System.out.println("Longest keyword has length of " + lm.findLongestKwdLength());
        System.out.println();
        System.out.println("The language with fewer words is in index: " + lm.findLangWithFewestKwds());
        System.out.println("The language with fewer words is -> " + lm.getLanguage(lm.findLangWithFewestKwds()));
        System.out.println();
        System.out.println("The language with most words is in index: " + lm.findLangWithMostKwds());
        System.out.println("The language with most words is -> " + lm.getLanguage(lm.findLangWithMostKwds()));

        System.out.println();
        System.out.println("the keyword 'try' can be found in languages in the following positions -> " +
                Arrays.toString(lm.findLangKwdMatches("try")));

        System.out.println("The type COMPILED can be found in the following positions ->"
                + Arrays.toString(lm.findLangsOfType(Language.Type.COMPILED)));
    }
}
