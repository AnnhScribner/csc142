import java.util.Scanner;

/**
 * Console-based menu program offering temperature conversions to and from C, F, and K
 *
 * @author Bill Barry
 * @version 2017-01-16
 */
public class TempConvUI {

    public static void main(String[] args) {
        Scanner conIn = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("\n\nTemperature Conversion Menu\n");
            System.out.println("1.  Fahrenheit to Celsius");
            System.out.println("2.  Fahrenheit to Kelvin");
            System.out.println("3.  Celsius to Fahrenheit");
            System.out.println("4.  Celsius to Kelvin");
            System.out.println("5.  Kelvin to Fahrenheit");
            System.out.println("6.  Kelvin to Celsius\n");
            System.out.println("0.  EXIT\n");
            System.out.print("Enter your choice: ");

            // confirm the data type from the user choice
            // conIn.hasNextInt() -> Selection statement where it will return true if
            // the next value is an integer and false otherwise.
            while (!conIn.hasNextInt()) {
                System.out.println("Please type a number (0-6)");
                // We know what we have a bad value
                // it must be discarded - flush and buffer
                conIn.next();
            }
            choice = conIn.nextInt();

            // only performs conversion if we received valid input
            // Numbers from 1 to 6
            if (choice > 0 && choice <= 6) {

                System.out.print("Enter the input temperature: ");
                while (!conIn.hasNextDouble()) {
                    System.out.println("Please type a valid temperature");
                    // We know what we have a bad value
                    // it must be discarded - flush and buffer
                    conIn.next();
                }
                double inputTemp = conIn.nextDouble();
                double result = 0.0;

                // Static methods:
                // ClassName.method(...)
                switch (choice) {
                    case 1:
                        result = TempConversion.fToC(inputTemp);
                        break;
                    case 2:
                        result = TempConversion.fToK(inputTemp);
                        break;
                    case 3:
                        result = TempConversion.cToF(inputTemp);
                        break;
                    case 4:
                        result = TempConversion.cToK(inputTemp);
                        break;
                    case 5:
                        result = TempConversion.kToF(inputTemp);
                        break;
                    default:
                        result = TempConversion.kToC(inputTemp);
                        break;
                }
                // System.out.println("Converted temperature is: " + result + "\n");
                System.out.printf("Converted temperature is: %.3f \n", result);
            }
        }
        while (choice != 0);

        System.out.println("Goodbye");
        conIn.close();
    }

}
