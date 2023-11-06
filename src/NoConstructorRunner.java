
/*
 * Activity 2.5.2
 */
import java.util.Scanner;
import java.util.Random;

public class NoConstructorRunner
{
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("Enter player's name: ");
        String playerName = scanner.nextLine();

        try {
            Player p = new Player(playerName);
            System.out.println(p.getName());
            System.out.println(p.getPoints());

            // Generate a random number between 1 and 10
            int correctNumber = new Random().nextInt(10) + 1;

            // Ask the player to make a guess
            System.out.print("Guess a number between 1 and 10: ");
            String guess = p.makeGuess(); // Use Player's makeGuess method
            System.out.println(playerName + " guessed: " + guess);

            // Convert guess to integer and check if it is correct
            try {
                int guessedNumber = Integer.parseInt(guess);
                if (guessedNumber == correctNumber) {
                    System.out.println("Congratulations, you guessed the correct number!");
                    p.addToPoints(10); // For example, add 10 points for a correct guess
                } else {
                    System.out.println("Sorry, the correct number was " + correctNumber + ".");
                }
            } catch (NumberFormatException e) {
                System.out.println("That's not a valid number. Please enter a number between 1 and 10.");
            }

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
