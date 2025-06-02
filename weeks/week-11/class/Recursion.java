public class Recursion {
    public static void main(String[] args) {

        /**
         * MEMORY LAYOUT
         *
         * -----------              -----------               ----------------
         * |            |               |            |              |                   |
         * |STACK |               |  HEAP |              |Instructions|
         * |            |              |            |               |                   |
         * -----------              -----------             ----------------
         *
         * (method/               (objects)
         * functions)
         */
        int[] nums = {1, 2, 3, 4, 5};

        System.out.println(addEmRecursive(nums, 2));

    }

    public static void printStarts(int n) {
        // n represents the number of stars we want to print
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }

    public static void printStartsRecursive(int n) {
        if (n == 0) {
            // base case
            System.out.print("");
        } else {
            // recursive case
            System.out.print("*");
            // recursive method MUST call itself at some point
            printStartsRecursive(n - 1);
        }
    }


    public static int addEmInterative(int[] intArr) {
        int sum = 0;

        for (int num : intArr) {
            sum += num;
        }

        return sum;
    }

    public static int addEmRecursive(int[] intArr) {
        // add a method to help us to recurse
        return addEmRecursive(intArr, 0);
    }

    public static int addEmRecursive(int[] intArr, int currentIndex) {
        if (currentIndex == intArr.length - 1) {
            // base case
            return intArr[currentIndex];
        } else {
            // recursive case
            return intArr[currentIndex] + addEmRecursive(intArr, currentIndex + 1);
        }
    }
}
