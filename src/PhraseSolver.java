public class PhraseSolver {
    private Player player1;
    private Player player2;
    private Board board;
    private boolean isSolved;

    public PhraseSolver() {
        this.player1 = new Player();
        this.player2 = new Player();
        this.board = new Board();
        this.isSolved = false;
    }

    public void runGame() {
        int i = 0;
        while (true) {
            if (i == 0) {
                System.out.println("Current player: " + player1.getName());
            } else {
                System.out.println("Current Player: " + player2.getName());
            }
            System.out.println(board.getSolvedPhrase());
            System.out.println(board.getCurrentLetterValue());
            i = (i + 1) % 2;
        }
    }
}
