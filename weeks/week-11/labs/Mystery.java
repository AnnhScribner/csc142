public class Mystery {
    public static void main(String[] args) {
        mystery2(2);
    }

    public void mystery2(int n) {
        if (n > 100) {
            System.out.print(n);
        } else {
            mystery2(2 * 2);
            System.out.print(", " + n);
        }
    }
}
}
