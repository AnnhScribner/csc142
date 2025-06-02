import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println(averageValueInFile("FloatNums.txt"));
    }

    public static String askFileName() {
        String fileName = "";
        File file;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Type a file name: ");
            fileName = scanner.nextLine(); // reading the file name
            file = new File(fileName);

        } while (!file.exists() || !file.isFile());

        scanner.close();
        return fileName;
    }

    public static double averageValueInFile(String fileName) {
        File file = new File(fileName);
        Scanner scanner;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            return 0.0;
        }

        double totalNums = 0.0;
        int totalNumsRead = 0;
        while (scanner.hasNextDouble()) {
            double nums = scanner.nextDouble();
            totalNums += nums;
            totalNumsRead += 1;
        }
        scanner.close();

        if (totalNumsRead == 0) {
            return 0.0;
        }

        return totalNums / totalNumsRead;
    }
}
