public class Lab1 {
    public static void main(String[] args) {

        System.out.println(range(new int[]{32}));
    }

    public static int range(int[] arr) {
        int bigger = arr[0];
        int smallest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > bigger) {
                bigger = arr[i];
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return bigger - smallest + 1;
    }
}
