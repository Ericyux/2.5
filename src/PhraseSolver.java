public class PhraseSolver {
    private Player player1;
    private Player player2;
    private Player currentPlayer; // Declare currentPlayer here
    private Board board;
    private boolean isSolved;

    public PhraseSolver() {
        this.player1 = new Player("PlayerName");
        this.player2 = new Player("PlayerName");
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


    public void startGame() {
        // Start the game with Player 1
        currentPlayer = player1; // Now currentPlayer is recognized as a member variable

        boolean gameFinished = false;

        while (!gameFinished) {
            // Display the current state of the game
            displayGameState();

            // Prompt the current player for a guess
            String guess = currentPlayer.makeGuess();

            // If the guess is a full phrase
            if (guess.length() > 1) {
                if (board.getPhrase().equalsIgnoreCase(guess)) {
                    System.out.println("Congratulations " + currentPlayer.getName() + "! You've solved the phrase!");
                    gameFinished = true;
                } else {
                    System.out.println("Incorrect guess!");
                    switchPlayers();
                }
            } else if (guess.length() == 1) { // If the guess is a single letter
                char letterGuess = guess.charAt(0);
                if (board.guessletter(letterGuess)) {
                    System.out.println("Correct! The letter " + letterGuess + " is in the phrase.");
                    if (board.getSolvedPhrase().equalsIgnoreCase(board.getPhrase())) {
                        System.out.println("Congratulations " + currentPlayer.getName() + "! You've solved the phrase!");
                        gameFinished = true;
                    }
                } else {
                    System.out.println("Incorrect guess!");
                    switchPlayers();
                }
            }
        }
    }

    private void displayGameState() {
        System.out.println("Current player: " + currentPlayer.getName());
        System.out.println("Phrase: " + board.getSolvedPhrase());
        System.out.println("Current letter value: " + board.getCurrentLetterValue());
    }

    private void switchPlayers() {
        currentPlayer = (currentPlayer == player1) ? player2 : player1;
    }

}
