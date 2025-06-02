import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Iterators {
    public static void main(String[] args) {

        ArrayList<Integer> myFavNums = new ArrayList<>();
        // unboxing -> going from oject to primitive (Java does this for us)
        myFavNums.add(3);
        myFavNums.add(9);
        myFavNums.add(18);
        myFavNums.add(2);
        myFavNums.add(100);
        myFavNums.add(10);

        int secondIndex = myFavNums.get(1);
        System.out.println(secondIndex);

        System.out.println(myFavNums);
        // sort
        Collections.sort(myFavNums);
        System.out.println(myFavNums);

        // ITERATOR THINGS
        // METHODS:
        // - next() - moves the iterator to the next element
        // - hasNext() - checks to see if there is a next element
        Iterator<Integer> numIter = myFavNums.iterator();

        // -> It does same as for each loop <-
        // checks to see if there is another element
        while (numIter.hasNext()) {
            // retrieve the next element
            int num = numIter.next();

            // remove the number i dont want anymore in my arrayList
            if (num == 3) {
                numIter.remove();
            }
            //System.out.println(num);
        }

        //for each num in myFavNums
//        for (int num : myFavNums) {
//            System.out.println(num);
//        }

        System.out.println(myFavNums);
    }

}

