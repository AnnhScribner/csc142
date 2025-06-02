public class Main {
    public static void main(String[] args) {
        Game g = new Game();
        Chess c = new Chess();
        ThreeDChess t = new ThreeDChess();

        Object og = g;
        Game gc = c;
        Game gt = t;

        Chess ch = new ThreeDChess();
        ((PooChess)ch).players();
// Add new statements here ONE AT A TIME
        ((ThreeDChess)gt).hasMoveableBoard();

    }
}