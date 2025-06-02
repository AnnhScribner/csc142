/*
Understand more about function overloading
@author  Anna Scribner
@version Jan 13, 2025
 */
public class SumNum {
    public static void main(String[] args) {
        System.out.print('\u000c');
        System.out.println(sumNum(1, 5));
    }

    public static int sumNum(int highest) {
        int sum = 0;
        for (int i = 1; i <= highest; i++) {
            sum += i;
        }
        return sum;
    }

    public static int sumNum(int lowest, int highest) {
        int sum = 0;
        for (int i = lowest; i <= highest; i++) {
            sum += i;
        }
        return sum;
    }

    public static int sumNum(int lowest, int highest, int increment) {
        int sum = 0;
        for (int i = lowest; i <= highest; i += increment) {
            sum += i;
        }
        return sum;
    }
}
