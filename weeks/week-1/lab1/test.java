
public class test {

    public static void main(String[] args) {
        sampleMethod();
    }

    public static int sampleMethod() {

        int number = 4;
        for (int i = 1; i <= number; i++) {
            System.err.println(number);
            number = number / 2;
        }
        return 0;
    }
    
}
