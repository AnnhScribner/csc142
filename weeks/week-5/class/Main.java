import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int x = 1;
        int y = 2;
        System.out.println("(" + x + ", " + y + ")");


//        File file = new File("Customers.txt"); // Object for file
//
//        Scanner scanFile;
//
//        // Handle exceptions on the client end (not throw them)
//        try {
//            scanFile = new Scanner(file); // Object for scan
//            // scanner expect a parameter
//        } catch (FileNotFoundException e) {
//            // deal with exception here if it gets thrown
//            System.out.println("Can't open customer file: terminating demo.");
//            return; // return to the main to avoid problems when I try to close my scanFile
//        }
//
//
//        while (scanFile.hasNextLine()) {
//
//            int custNum = scanFile.nextInt();
//            double custBalance = scanFile.nextDouble();
//            String custName = scanFile.nextLine().strip();
//
//            Customer c = new Customer(custNum, custName, custBalance);
//            System.out.println(c);
//        }
//
//        scanFile.close();
    }
}
