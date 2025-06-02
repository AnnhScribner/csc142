// Anna Scribner
// Jan 8, 2025

public class DrawDiamond {

    public static void main(String[] args) {
        // System.out.println('\u000c');
        // System.out.print("\t---------\n"
        //         + "\t    *    \n"
        //         + "\t   ***   \n"
        //         + "\t  *****  \n"
        //         + "\t ******* \n"
        //         + "\t  *****  \n"
        //         + "\t   ***   \n"
        //         + "\t    *    \n"
        //         + "\t---------\n");
        
        int totalCh = 8;
        System.out.print("+");
        for (int i = 1; i < totalCh; i++) {
            System.out.print("-");
        }
        System.out.println("+");
        // -----------------------
        System.out.print("|");
        for (int i = 1; i < totalCh; i++) {
            System.out.print(" ");
        }
        System.out.println("|");
        //  ----------------------
        System.out.print("|");
        for (int i = 1; i < totalCh / 2; i++) {
            System.out.print(" ");
        }
        System.out.print("*");
        for (int i = 1; i < totalCh / 2; i++) {
            System.out.print(" ");
        }
        System.out.println("|");
        //  ----------------------

    }
}
