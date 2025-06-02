import java.util.Scanner;

public class PracticeIt2 {
    public static void main(String[] args) {

        System.out.println(dateIsBefore(10, 1, 2, 25));
    }

    public static double computeTax(double salary) {
        double flatAmount = 0.0;
        double overMinimum = 0.0;
        int percentage = 0;

        if (salary >= 70350) {
            flatAmount = 14325;
            percentage = 28;
            overMinimum = salary - 70350;

        } else if (salary >= 29050) {
            flatAmount = 4000;
            percentage = 25;
            overMinimum = salary - 29050;

        } else if (salary >= 7150) {
            flatAmount = 715;
            percentage = 15;
            overMinimum = salary - 7150;

        } else {
            percentage = 10;
            overMinimum = salary;
        }

        double tax = (overMinimum * percentage / 100.0) + flatAmount;

        return tax;
    }

    public static boolean dateIsBefore(int month1, int day1, int month2, int day2) {
        if (month1 < month2) {
            return true;
        }
         else if ((month1 == month2) && (day1 < day2)) {
            return true;
        } else {
            return false;
        }

    }


}

