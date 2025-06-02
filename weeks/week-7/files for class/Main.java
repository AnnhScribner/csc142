import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        File file = new File("CustomersWithCount.txt"); // Object for file

        Scanner scanFile;

        // Handle exceptions on the client end (not throw them)
        try {
            scanFile = new Scanner(file); // Object for scan
            // scanner expect a parameter
        } catch (FileNotFoundException e) {
            // deal with exception here if it gets thrown
            System.out.println("Can't open customer file: terminating demo.");
            return; // return to the main to avoid problems when I try to close my scanFile
        }

        // read count - first number
        int count = scanFile.nextInt();
        // create an array
        int[] custNumbers = new int[count];
        double[] custBalances = new double[count];
        String[] custNames = new String[count];
        Customer[] customers = new Customer[count];


        for (int i = 0; i < count; i++) {
            int custNum = scanFile.nextInt();
            double custBalance = scanFile.nextDouble();
            String custName = scanFile.nextLine().strip();

            Customer c = new Customer(custNum, custName, custBalance);
            //System.out.println(c);

            // Those next arrays are parallel arrays
            custNumbers[i] = custNum;
            custBalances[i] = custBalance;
            custNames[i] = custName;

            customers[i] = c;


        }


        // for-each loop
//        for(c cust: c){
//            System.out.println(cust);
//        }


//        System.out.println(Arrays.toString(custNumbers));
//        System.out.println(Arrays.toString(custBalances));
//        System.out.println(Arrays.toString(custNames));


        scanFile.close();

    }
}
