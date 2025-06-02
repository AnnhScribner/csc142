/**
 * @author Anna Scribner
 * @version March 2, 2025
 * <p>
 * A class that manages many languages
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LanguageManager implements LanguageManagerInterface {
    private Language[] languages;

    /**
     * Opens the specified file, create the languages array, and fill it in with data
     *
     * @param languageFile
     * @throws FileNotFoundException
     */
    public LanguageManager(File languageFile) throws FileNotFoundException {
        if (languageFile == null) {
            throw new IllegalArgumentException("file cannot be null");
        }

        Scanner scanner;
        scanner = new Scanner(languageFile);

        int count = scanner.nextInt();
        scanner.nextLine();
        scanner.nextLine(); // skip the header

        languages = new Language[count];

        for (int i = 0; i < count; i++) {
            String line[] = scanner.nextLine().split(",");

            String name = line[0];
            String fileName = "datafiles/" + line[1];
            String typeString = line[2];
            LanguageInterface.Type type;

            if (typeString.equals("Compiled")) {
                type = LanguageInterface.Type.COMPILED;
            } else if (typeString.equals("Interpreted")) {
                type = LanguageInterface.Type.INTERPRETED;
            } else if (typeString.equals("Scripting")) {
                type = LanguageInterface.Type.SCRIPTING;
            } else if (typeString.equals("Numerical_Analysis")) {
                type = LanguageInterface.Type.NUMERICAL_ANALYSIS;
            } else {
                throw new IllegalArgumentException("Invalid type. " + typeString);
            }

            languages[i] = new Language(name, fileName, type);
        }
        scanner.close();

        this.sortLangs();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getLanguageCount() {
        return languages.length;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Language getLanguage(int index) {
        return languages[index];
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int findShortestKwdLength() {
        if (getLanguageCount() == 0) {
            return -1;
        }

        int shortKwd = getLanguage(0).findShortestKwdLength();
        // shortKwd will be assigned to positive infinite in case there's
        // no shortest word in the 0 index language.
        if (shortKwd == -1) {
            shortKwd = Integer.MAX_VALUE;
        }

        for (int i = 0; i < getLanguageCount(); i++) {
            int shortestKwdLength = getLanguage(i).findShortestKwdLength();
            // shortestKwdLength will be assigned to positive infinite in case there's
            // no shortest word in the i index language. This will make it impossible to
            // pass the next condition.
            if (shortestKwdLength == -1) {
                shortestKwdLength = Integer.MAX_VALUE;
            }

            if (shortestKwdLength <= shortKwd) {
                shortKwd = shortestKwdLength;
            }
        }

        // shortKwd is still Integer.MAX_VALUE, so that means
        // there was not more keywords to be compared
        if (shortKwd == Integer.MAX_VALUE) {
            return -1;
        }
        return shortKwd;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int findLongestKwdLength() {
        if (getLanguageCount() == 0) {
            return -1;
        }

        int longKwd = getLanguage(0).findLongestKwdLength();

        for (int i = 0; i < getLanguageCount(); i++) {
            if (getLanguage(i).findLongestKwdLength() >= longKwd) {
                longKwd = getLanguage(i).findLongestKwdLength();
            }
        }
        return longKwd;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int findLangWithFewestKwds() {
        if (getLanguageCount() == 0) {
            return -1;
        }

        int few = getLanguage(0).getKwdCount();
        int index = 0;

        for (int i = 0; i < getLanguageCount(); i++) {
            if (getLanguage(i).getKwdCount() <= few) {
                index = i;
                few = getLanguage(i).getKwdCount();
            }
        }
        return index;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int findLangWithMostKwds() {
        if (getLanguageCount() == 0) {
            return -1;
        }

        int most = getLanguage(0).getKwdCount();
        int index = 0;

        for (int i = 0; i < getLanguageCount(); i++) {
            if (getLanguage(i).getKwdCount() >= most) {
                index = i;
                most = getLanguage(i).getKwdCount();
            }
        }
        return index;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int[] findLangKwdMatches(String keyword) {
        if (keyword == null || keyword.isEmpty()) {
            throw new IllegalArgumentException("keyword cannot be empty/null");
        }
        int count = 0;

        for (int i = 0; i < getLanguageCount(); i++) {
            if (getLanguage(i).findKwd(keyword) != -1) {
                count++;
            }
        }

        int[] matches = new int[count];
        int index = 0;

        for (int i = 0; i < getLanguageCount(); i++) {
            if (getLanguage(i).findKwd(keyword) != -1) {
                matches[index] = i;
                index++;
            }
        }
        return matches;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int[] findLangsOfType(Language.Type type) {
        if (type == null) {
            throw new IllegalArgumentException("type cannot be null");
        }

        int count = 0;

        for (int i = 0; i < getLanguageCount(); i++) {
            if (getLanguage(i).getType() == type) {
                count++;
            }
        }

        int[] matches = new int[count];
        int index = 0;

        for (int i = 0; i < getLanguageCount(); i++) {
            if (getLanguage(i).getType() == type) {
                matches[index] = i;
                index++;
            }
        }
        return matches;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void sortLangs() {
        for (int pass = 1; pass < languages.length; pass++) {
            Language temp = languages[pass];

            int checkPos = pass - 1;

            while (checkPos >= 0 && languages[checkPos].getName().compareTo(temp.getName()) > 0) {
                languages[checkPos + 1] = languages[checkPos];
                checkPos--;
            }
            languages[checkPos + 1] = temp;
        }
    }

}

