import java.util.Arrays;

public class Class {
    public static void main(String[] args) {

        int[] a = {6, 2, 1, 5, 3, 4};
        insertionSort(a);
        System.out.println(Arrays.toString(a));

    }

    public static void insertionSort(int[] arr){
        // point to the card
        // pass -> index to the next card
        for(int pass = 1; pass < arr.length; pass++){
            // save the value of the card that is in [pass] position
            int temp = arr[pass];

            // checkPos -> index in sorted portion
            int checkPos = pass - 1;

            // check the position where it has to be greater/equal to zero
            // and less than the card in the [checkPos] position
            while(checkPos >= 0 && temp < arr[checkPos]){
                arr[checkPos + 1] = arr[checkPos]; // duplicate card
                checkPos--; // go back to the previous index
            }

            arr[checkPos + 1] = temp; // insert the temp value that was saved in the beginning
        }
    }

    //
    public static int sequentialSearch(int[] arr, int target){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    // the array HAS to be sorted
    public static int binarySearch(int[] array, int target) {
        int minIdx = 0; // lower index
        int maxIdx = array.length - 1; // higher index

        while (minIdx <= maxIdx) {
            int midIdx = (minIdx + maxIdx) / 2; // divides the array in half
            if (target > array[midIdx]) {
                minIdx = midIdx + 1; // update lower index
            } else if (target < array[midIdx]) {
                maxIdx = midIdx - 1; // update higher index
            } else {
                return midIdx; // target found
            }
        }
        return -1; // target not found
    }



}

// when compare objects I have to use object.compareTo()
// neg, second comes first
// 0, they are equals
// first, comes first