
import java.util.Scanner;

public class Player {
    private String name;
    private double points;
    private static final Scanner scanner = new Scanner(System.in);

    // Default constructor now requires a name
    public Player(String initialName) {
        setName(initialName);
        this.points = 0;
        System.out.println("Welcome " + this.name + " to the game!");
    }

    public String makeGuess() {
        return scanner.nextLine();
    }

    public String getName() {
        return name;
    }

    // Mutator method for name with validation
    public void setName(String newName) {
        if (newName != null && newName.length() > 0 && newName.length() <= 10) {
            name = newName;
        } else {
            System.out.println("Name must be 1-10 characters long.");
            throw new IllegalArgumentException("Name must be 1-10 characters long.");
        }
    }

    public double getPoints() {
        return points;
    }

    public void addToPoints(int value) {
        points += value;
    }
}
