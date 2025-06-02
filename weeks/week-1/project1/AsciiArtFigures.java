
/**
 * A program with four methods, each producing an ASCII-art figure
 * whose size is controlled by a parameter.
 *
 * @author Anna Scribner
 * @version Jan 6, 2025
 */
public class AsciiArtFigures {

    public static final char PRINT_CHAR = '#';

    public static void main(String[] args) {

        printNumberSlide(5);
        printVFormation(3);
        printTree(5);
        printDiamondBox(5);
    }

    /**
     * Displays number slide AsciiArt of the specified number of rows
     *
     * @param numberOfRows
     */
    private static void printNumberSlide(int numberOfRows) {
        for (int line = 0; line < numberOfRows; line++) {
            for (int ch = line; ch <= line + 20; ch++) {
                System.out.print(ch % 10);
            }
            System.out.println();
        }

    }

    /**
     * Displays V formation of the specified height for the V shape
     *
     * @param heightOfVShape
     */
    private static void printVFormation(int heightOfVShape) {
        for (int line = 1; line <= heightOfVShape; line++) {
            int spaces = line - 1;

            // Space before first ch
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            System.out.print("\\");

            // Space between ch
            for (int space = 1; space <= -2 * line + (8 / 3 * heightOfVShape); space++) {
                System.out.print(" ");
            }
            System.out.println("/");
        }
    }

    /**
     * Displays tree of the specified height
     *
     * @param heightOfTree
     */
    private static void printTree(int heightOfTree) {
        for (int line = 1; line <= heightOfTree; line++) {
            int spaces = heightOfTree - line;
            int stars = 2 * line - 1;

            // Top part of the tree
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print(PRINT_CHAR);
            }

            System.out.println();
        }

        // Stump of the tree
        for (int i = 0; i < 2; i++) {
            for (int j = 1; j <= heightOfTree - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("#");
        }

    }

    /**
     * Displays Diamond Box of the specified height
     *
     * @param heightDiamond
     */
    private static void printDiamondBox(int heightDiamond) {
        int width = heightDiamond + 2;

        // Header
        System.out.print("+");
        for (int i = 1; i <= width; i++) {
            System.out.print("-");
        }
        System.out.println("+");

        System.out.print("|");
        for (int i = 1; i <= width; i++) {
            System.out.print(" ");
        }
        System.out.println("|");

        // Top part of the diamond
        int bottom = heightDiamond / 2;
        int top = heightDiamond - bottom;

        for (int line = 1; line <= top; line++) {
            int starsCount = 2 * line - 1;
            int totalSpaces = (width - starsCount) / 2;

            System.out.print("|");
            for (int spaces = 1; spaces <= totalSpaces; spaces++) {
                System.out.print(" ");
            }

            for (int stars = 1; stars <= starsCount; stars++) {
                System.out.print(PRINT_CHAR);
            }

            for (int spaces = 1; spaces <= totalSpaces; spaces++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }

        // Bottom part of the diamond
        for (int line = 1; line <= bottom; line++) {
            int starsCount = -2 * line + heightDiamond;
            int totalSpaces = (width - starsCount) / 2;

            System.out.print("|");
            for (int spaces = 1; spaces <= totalSpaces; spaces++) {
                System.out.print(" ");
            }

            for (int stars = 1; stars <= starsCount; stars++) {
                System.out.print(PRINT_CHAR);
            }

            for (int spaces = 1; spaces <= totalSpaces; spaces++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }

        // Footer
        System.out.print("|");
        for (int i = 1; i <= heightDiamond + 2; i++) {
            System.out.print(" ");
        }
        System.out.println("|");

        System.out.print("+");
        for (int i = 1; i <= heightDiamond + 2; i++) {
            System.out.print("-");
        }
        System.out.println("+");

    }

}
