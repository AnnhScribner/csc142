import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args){

        // create an array
        int [] myFavNums = new int[4];

        System.out.println(myFavNums); // print the address of the array
        System.out.println(Arrays.toString(myFavNums)); // print my array as a string -> need to import java.util.Arrays;

        // change the values in the array
        myFavNums[0] = 25;
        myFavNums[1] = 9;
        myFavNums[2] = 26;
        myFavNums[3] = 200;
        // myFavNums[4] = 7; gives an error because it is out of bounds -> .ArrayIndexOutOfBoundsException

        // length of array is arrayName.length


        System.out.printf("The size of the array is: %d\n", myFavNums.length);
        System.out.println(Arrays.toString(myFavNums));

    }
}
