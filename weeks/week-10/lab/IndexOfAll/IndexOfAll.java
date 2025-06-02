import java.util.ArrayList;
import java.util.Arrays;

public class IndexOfAll {
    public static void main(String[] args) {

        int[] list = new int[]{0, 2, 4, 1, 6, 7, 2, 4, 2};
        int[] list2 = new int[]{2, 4,};

        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        for (int j : list) {
            a.add(j);
        }
        for(int i : list2){
            b.add(i);
        }

        ArrayList<Integer> save = indexOfAll(a, b);
        System.out.println(a);
        System.out.println(b);
        System.out.println(save);
    }

    public static ArrayList<Integer> indexOfAll(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        ArrayList<Integer> index = new ArrayList<>();

        for (int i = 0; i < arr1.size() - (arr2.size() - 1); i++) {
            boolean save = true;

            for (int j = 0; j < arr2.size(); j++) {

                if (arr2.get(j) != arr1.get(i + j)) {
                    save = false;
                }

            }

            if (save){
                index.add(i);
            }
        }
        return index;
    }
}
