/**
 * @author Anna Scribner
 * @version March 2, 2025
 * <p>
 * A class to represents Language
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Language implements LanguageInterface {

    private String name;
    private String fileName;
    private Type type;
    private String[] keywords;

    /**
     * Opens the specified file, create the keyword array, and fill it in with data.
     * If it can't open the file or if the file has zero keywords, the class will create
     * an empty array.
     *
     * @param name
     * @param fileName
     * @param type
     */
    public Language(String name, String fileName, Type type) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("name can't be null or empty");
        }
        if (fileName == null || fileName.isEmpty()) {
            throw new IllegalArgumentException("file name can't be null");
        }
        if (type == null) {
            throw new IllegalArgumentException("type can't be null");
        }

        this.name = name;
        this.fileName = fileName;
        this.type = type;

        File file = new File(fileName);
        Scanner scanner;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            keywords = new String[0];
            return;
        }

        int count = scanner.nextInt();
        scanner.nextLine();
        keywords = new String[count];

        for (int i = 0; i < count; i++) {
            keywords[i] = scanner.nextLine();
        }
        scanner.close();
        this.sortKwds();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getFilename() {
        return fileName;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Type getType() {
        return type;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getKwdCount() {
        return keywords.length;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getKwd(int index) {
        return keywords[index];
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int findKwd(String keyword) {
        if (keyword == null || keyword.isEmpty()) {
            throw new IllegalArgumentException("keyword cannot be null/empty.");
        }
        for (int i = 0; i < getKwdCount(); i++) {
            if (getKwd(i).equals(keyword)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int findShortestKwdLength() {
        if (getKwdCount() == 0) {
            return -1;
        }

        int shortWord = getKwd(0).length();

        for (int i = 0; i < getKwdCount(); i++) {
            if (getKwd(i).length() <= shortWord) {
                shortWord = getKwd(i).length();
            }
        }
        return shortWord;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int findLongestKwdLength() {
        if (getKwdCount() == 0) {
            return -1;
        }

        int longWord = getKwd(0).length();

        for (int i = 0; i < getKwdCount(); i++) {
            if (getKwd(i).length() >= longWord) {
                longWord = getKwd(i).length();
            }
        }
        return longWord;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void sortKwds() {
        for (int pass = 1; pass < keywords.length; pass++) {
            String temp = keywords[pass];
            int checkPos = pass - 1;

            while (checkPos >= 0 && temp.compareTo(keywords[checkPos]) < 0) {
                keywords[checkPos + 1] = keywords[checkPos];
                checkPos--;
            }
            keywords[checkPos + 1] = temp;
        }
    }

    /**
     *
     * @return string information about language: name, type, and fileName
     */
    public String toString() {
        return String.format("Name: %s; Keyword count: %d; Type: %s.", name, getKwdCount(), type);
    }
}

