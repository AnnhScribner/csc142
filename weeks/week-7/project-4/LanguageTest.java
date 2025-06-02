/**
 * @author Anna Scribner
 * @version March 3, 2025
 * <p>
 * Tests the methods in Language class
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;


public class LanguageTest {

    /**
     * Test the exceptions in the constructor
     */
    @Test
    void Language() {
        Language l = new Language("ZZZTestLang", "datafiles/ZZZTestLang.txt", LanguageInterface.Type.COMPILED);
        assert (isMonotonic(l));

        assertThrows(IllegalArgumentException.class, () -> {
            new Language(null, "datafiles/invalid.txt", LanguageInterface.Type.COMPILED);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            new Language("", "datafiles/invalid.txt", LanguageInterface.Type.COMPILED);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            new Language("ZZZTestLang", null, LanguageInterface.Type.COMPILED);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            new Language("ZZZTestLang", "", LanguageInterface.Type.COMPILED);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            new Language("ZZZTestLang", "datafiles/invalid.txt", null);
        });

        assertDoesNotThrow(() -> {
            new Language("ZZZTestLang", "datafiles/valid.txt", LanguageInterface.Type.COMPILED);
        });
    }

    /**
     * Test getName method
     */
    @Test
    void getName() {
        Language l = new Language("ZZZTestLang", "datafiles/ZZZTestLang.txt", LanguageInterface.Type.COMPILED);
        assertEquals("ZZZTestLang", l.getName());
    }

    /**
     * Test getFilename method
     */
    @Test
    void getFilename() {
        Language l = new Language("ZZZTestLang", "datafiles/ZZZTestLang.txt", LanguageInterface.Type.COMPILED);
        assertEquals("datafiles/ZZZTestLang.txt", l.getFilename());
    }

    /**
     * Test getType method
     */
    @Test
    void getType() {
        Language l = new Language("ZZZTestLang", "datafiles/ZZZTestLang.txt", LanguageInterface.Type.COMPILED);
        assertEquals(LanguageInterface.Type.COMPILED, l.getType());
    }

    /**
     * Tests getKwdCount method
     */
    @Test
    void getKwdCount() {
        Language l = new Language("ZZZTestLang", "datafiles/ZZZTestLang.txt", LanguageInterface.Type.COMPILED);
        assertEquals(5, l.getKwdCount());
    }

    /**
     * Tests getKwd method and exceptions
     */
    @Test
    void getKwd() {
        Language l = new Language("ZZZTestLang", "datafiles/ZZZTestLang.txt", LanguageInterface.Type.COMPILED);
        assertEquals("blurb", l.getKwd(0));
        assertEquals("flurb", l.getKwd(1));
        assertEquals("herb", l.getKwd(2));
        assertEquals("urb", l.getKwd(3));
        assertEquals("zurbinator", l.getKwd(4));

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            l.getKwd(10);
        });
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            l.getKwd(-1);
        });
    }

    /**
     * Tests findKwd method and exceptions
     */
    @Test
    void findKwd() {
        Language l = new Language("ZZZTestLang", "datafiles/ZZZTestLang.txt", LanguageInterface.Type.COMPILED);
        assertEquals(-1, l.findKwd("Anna"));
        assertEquals(3, l.findKwd("urb"));
        assertEquals(1, l.findKwd("flurb"));

        assertThrows(IllegalArgumentException.class, () -> {
            l.findKwd(null);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            l.findKwd("");
        });
    }

    /**
     * Tests if Language finds the shortest keyword length
     */
    @Test
    void findShortestKwdLength() {
        Language l = new Language("ZZZTestLang", "datafiles/ZZZTestLang.txt", LanguageInterface.Type.COMPILED);
        assertEquals(3, l.findShortestKwdLength());
    }

    /**
     * Tests if Language finds the longest keyword length
     */
    @Test
    void findLongestKwdLength() {
        Language l = new Language("ZZZTestLang", "datafiles/ZZZTestLang.txt", LanguageInterface.Type.COMPILED);
        assertEquals(10, l.findLongestKwdLength());
    }

    /**
     * Method to check if language is in alphabetic order
     * @param l
     * @return
     */
    private static boolean isMonotonic(Language l) {
        boolean isItUp = true;

        for (int i = 0; i < l.getKwdCount() - 1; i++) {
            if ((l.getKwd(i).compareTo(l.getKwd(i + 1)) > 0)) {
                isItUp = false;
            }

        }
        return isItUp;
    }

    /**
     * Test if toString method returns the correct string
     */
    @Test
    void testToString() {
        Language l = new Language("ZZZTestLang", "datafiles/ZZZTestLang.txt", LanguageInterface.Type.COMPILED);
        String expected = "Name: ZZZTestLang; Keyword count: 5; Type: COMPILED.";
        String real = l.toString();
        assertEquals(expected, real);
    }
}