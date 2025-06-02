// Anna Scribner
// Jan 08, 2025

public class functionOverloading {

    public static void main(String[] args) {
        int ans = sumNums(2,4);
        System.out.println(ans);
    }

    public static int sumNums(int highestNum) {
        int sum = 0;

        for (int i = 1; i <= highestNum; i++) {
            sum += i;
        }
        return sum;
    }

    public static int sumNums(int startNumber, int lastNumber){
        int sum = 0;
        
        for(int i = startNumber; i <= lastNumber; i++){
            sum += i;
        }
        return sum;
    }
}
