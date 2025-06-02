public class Test {
    public static void main(String[] args){
        System.out.println(numUnique(15, 5, 5));
    }
    public static int numUnique(int a, int b, int c) {
        if (a == b && a == c) {
            return 1;
        }
        if (a == b || a == c || b == c) {
            return 2;
        }
        return 3;
    }
}
