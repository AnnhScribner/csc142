public class Participation {
    public static void main(String[] args){
        int[] a = {1, 5, 10, 52, 35, 42, 8};
        System.out.println(sequentialSearch(a, 10));
    }

    // return the index of the target value
    public static int sequentialSearch(int[] arr, int target){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
