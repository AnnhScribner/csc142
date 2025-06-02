import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] a = {42, 3, 9, 42, 42, 0, 42, 9, 42, 42, 17, 8, 2222, 4, 9, 0, 1};
        int[] b = {42, 2222, 9};
        banish(a, b);

        a = new int[]{1, 2, 3, 4, 5};
        b = new int[]{1};
        banish(a, b);
    }

    static public void banish(int[] a1, int[] a2) {

        for (int j = 0; j < a2.length; j++) {
            for (int i = 0; i < a1.length; i++) {
                if (a2[j] == a1[i]) {
                    // step 1: shift everything to the left
                    for(int k = i; k < a1.length - 1; k++) {
                        a1[k] = a1[k + 1];
                    }
                    i--;

                    // step 2: place a zero in the last index
                    a1[a1.length - 1] = 0;
                }
            }
        }

    }
}