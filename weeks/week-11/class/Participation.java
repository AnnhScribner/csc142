public class Participation {
    public static void main(String[] args) {
        System.out.println(sumOfSquares(0));
    }

    public static int sumOfSquares(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must not be negative");
        }
        if (n == 0) {
            // base case
            return 0;
        } else {
            // recursive case
            return n * n + sumOfSquares(n - 1);
        }
    }
}
