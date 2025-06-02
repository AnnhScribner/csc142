/*
@author Anna Scribner
@version Jan 15, 2025
 */

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        // clear console
        System.out.print('\u000c');
        // Scanner buffer -> I just want to remember how it is called
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.next();

        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        double result = Math.sqrt(number);
        System.out.println("Hello " + name + "!");
        System.out.println("The square root of " + number + " is " + result);


    }
}
