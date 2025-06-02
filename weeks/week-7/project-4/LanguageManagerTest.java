/**
 * @author Anna Scribner
 * @version March 3, 2025
 * <p>
 * Tests the methods in Language Manager class
 */

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class LanguageManagerTest {

    /**
     * Test the exceptions in the constructor
     */
    void LanguageManager() throws FileNotFoundException {
        LanguageManager lm = new LanguageManager(new File("datafiles/ZZZTestLanguages.txt"));

        assert (isMonotonic(lm));
        assertThrows(IllegalArgumentException.class, () -> {
            new LanguageManager(null);
        });

        assertDoesNotThrow(() -> {
            new LanguageManager(new File("datafiles/languages.txt"));
        });
    }

    /**
     * Tests that getLanguageCount method returns the correct amount of languages
     * @throws FileNotFoundException
     */
    @Test
    void getLanguageCount() throws FileNotFoundException {
        LanguageManager l = new LanguageManager(new File("datafiles/ZZZTestLanguages.txt"));

        assertEquals(2, l.getLanguageCount());
    }

    /**
     * Tests getLanguage method and exceptions
     * @throws FileNotFoundException
     */
    @Test
    void getLanguage() throws FileNotFoundException {
        LanguageManager lm = new LanguageManager(new File("datafiles/ZZZTestLanguages.txt"));

        Language lan = lm.getLanguage(0);
        assertEquals("ZZZTestLang", lan.getName());

        lan = lm.getLanguage(1);
        assertEquals("ZZZTestLang2", lan.getName());

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            lm.getLanguage(-1);
        });
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            lm.getLanguage(10);
        });
    }

    /**
     * Tests that findShortestKwdLength method returns the correct length of the shortest keyword
     * @throws FileNotFoundException
     */
    @Test
    void findShortestKwdLength() throws FileNotFoundException {
        LanguageManager lm = new LanguageManager(new File("datafiles/ZZZTestLanguages.txt"));

        assertEquals(1, lm.findShortestKwdLength());

        lm = new LanguageManager(new File("datafiles/ZZZTestLanguages-EmptyLanguages.txt"));
        assertEquals(-1, lm.findShortestKwdLength());
    }

    /**
     * Tests if Language Manager finds the length of the longest keywords
     * @throws FileNotFoundException
     */
    @Test
    void findLongestKwdLength() throws FileNotFoundException {
        LanguageManager lm = new LanguageManager(new File("datafiles/ZZZTestLanguages.txt"));

        assertEquals(10, lm.findLongestKwdLength());

        lm = new LanguageManager(new File("datafiles/ZZZTestLanguages-EmptyLanguages.txt"));
        assertEquals(-1, lm.findLongestKwdLength());
    }

    /**
     * Tests if Language Manager finds the Language with fewest number of keywords
     * @throws FileNotFoundException
     */
    @Test
    void findLangWithFewestKwds() throws FileNotFoundException {
        LanguageManager lm = new LanguageManager(new File("datafiles/ZZZTestLanguages.txt"));

        assertEquals(1, lm.findLangWithFewestKwds());

    }

    /**
     * Tests if Language Manager finds the Language with most number of keywords
     * @throws FileNotFoundException
     */
    @Test
    void findLangWithMostKwds() throws FileNotFoundException {
        LanguageManager lm = new LanguageManager(new File("datafiles/ZZZTestLanguages.txt"));
        assertEquals(0, lm.findLangWithMostKwds());

        lm = new LanguageManager(new File("datafiles/ZZZTestLanguages-EmptyFile.txt"));
        assertEquals(-1, lm.findLangWithMostKwds());
    }

    /**
     * Tests if the Language Manager find matching words in Language given a keyword
     * @throws FileNotFoundException
     */
    @Test
    void findLangKwdMatches() throws FileNotFoundException {
        LanguageManager lm = new LanguageManager(new File("datafiles/ZZZTestLanguages.txt"));

        assertEquals("[0]", Arrays.toString(lm.findLangKwdMatches("urb")));

        assertThrows(IllegalArgumentException.class, () -> {
            lm.findLangKwdMatches(null);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            lm.findLangKwdMatches("");
        });

    }

    /**
     * Tests if Language Manager finds languages given the type
     * @throws FileNotFoundException
     */
    @Test
    void findLangsOfType() throws FileNotFoundException {
        LanguageManager lm = new LanguageManager(new File("datafiles/ZZZTestLanguages.txt"));

        assertThrows(IllegalArgumentException.class, () -> {
            lm.findLangKwdMatches(null);
        });

        assertEquals("[0, 1]", Arrays.toString(lm.findLangsOfType(Language.Type.COMPILED)));

        assertEquals("[]", Arrays.toString(lm.findLangsOfType(Language.Type.NUMERICAL_ANALYSIS)));

    }

    /**
     * Method to check if language manager is in alphabetic order
     * @param lm
     * @return
     */
    private static boolean isMonotonic(LanguageManager lm) {
        boolean isItUp = true;

        for (int i = 0; i < lm.getLanguageCount() - 1; i++) {
            if ((lm.getLanguage(i).getName().compareTo(lm.getLanguage(i + 1).getName()) > 0)) {
                isItUp = false;
            }

        }
        return isItUp;
    }
}