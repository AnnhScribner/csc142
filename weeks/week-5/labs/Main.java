import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("input.txt");
        Scanner scanFile;

        try {
            scanFile = new Scanner(file);
        } catch (FileNotFoundException e) {
            //
            return;
        }
        collapseSpaces(scanFile);
    }

    // REPLACEALL("[ \T]+") -> REMEMBER IT
    public static void collapseSpaces(Scanner scanFile) {
        String line = "";
        while (scanFile.hasNextLine()) {
            line = scanFile.nextLine().strip();
            line = line.replaceAll("[ \t]+", " ");
            System.out.println(line);
        }
    }
}
