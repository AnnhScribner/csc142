
/**
 * Program to print number triangle
 *
 * @author      Anna Scribner
 * @version     Jan 12, 2025
 */
public class NumberTriangle {

    public static void main(String[] args) {
        int totalLine = 7;

        for (int line = 1; line <= totalLine; line++) {
            for (int num = 1; num <= line ; num++) {
                System.out.print(line);
            }
            System.out.println();
        }

    }
}
