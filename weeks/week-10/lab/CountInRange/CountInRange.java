import java.util.ArrayList;

public class CountInRange {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList();
        int numOfElements = countInRange(arr, 100, 300);
        System.out.println(numOfElements);
    }

    public static int countInRange(ArrayList<Integer> arr, int min, int max){
        int count = 0;

            for (int i = 0; i <= arr.size() - 1; i++){
                if (arr.get(i) >= min && arr.get(i) <= max){
                    count += 1;
                }
            }

        return count;
    }
}
