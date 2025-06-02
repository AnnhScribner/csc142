//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {};
        System.out.println(isMonotonic(arr));
    }

    static public boolean isMonotonic(int[] arr) {
        boolean isItUp= true;
        boolean isItDown= true;

        for (int i = 0; i < arr.length - 1; i++) {
            if ((arr[i] > arr[i + 1]) ) {
                isItUp = false;
            }

            if ((arr[i] < arr[i + 1])) {
                isItDown = false;
            }
        }
        return isItUp || isItDown;
    }
}