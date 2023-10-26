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
}
