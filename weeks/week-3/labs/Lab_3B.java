/**
 * @author Anna Scribner
 * @version Jan 21, 2025
 */

public class Lab_3B {
    public static void main (String[] args){
        seeMovie(12.00, 5);
    }

    public static void seeMovie(double costOfATicket, int numberOfStarts){
        String answer = "";
        if (costOfATicket < 5.00 || (costOfATicket < 12.00 && numberOfStarts == 5)){
            System.out.println("very interested");
        }
        else if ((costOfATicket >= 12.00 && numberOfStarts == 5) ||
                (costOfATicket >= 5.00 && costOfATicket <= 11.99 && numberOfStarts >= 2 && numberOfStarts <= 4)){
            System.out.println("sort-of interested");
        }
        else{
            System.out.println("not interested");
        }
    }
}
