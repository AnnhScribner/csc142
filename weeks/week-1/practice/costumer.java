// Anna Scribner
// Jan 08, 2025


public class costumer {
    public static final double DAYS_IN_A_YEAR = 365.25;

    public static void main(String[] args) {
        // String name = "Anna";
        // double balance = 500.25;
        // int ageInDays = 30125;
        // double ageInYears = ageInDays / DAYS_IN_A_YEAR;

        // System.out.print('\u000c');
        // System.out.println("Name   :  " + name);
        // System.out.println("Balance:  " + balance);
        // System.out.println("age    :  " + ageInYears);





            // for (initialization step; test step; update step) {the code in the loop}
        // for(int i = 0; i <= 10; i++){
        //     System.out.println(i);
        // }

        sumNums(4);

    }

    public static int sumNums(int highestNum){
        int sum = 0;
        
        for(int i = 1; i <= highestNum; i++){
            sum += i;
        }
        return sum;
    }
}
