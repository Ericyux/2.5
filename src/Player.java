import java.util.Scanner;

public class Player {
    private String name;
    private double points;

    // Default constructor
    public Player() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter player's name: ");
        this.name = scanner.nextLine();
        this.points = 0;
        System.out.println("Welcome " + this.name + " to the game!");
    }

    // Constructor with a name parameter
    public Player(String inputName) {
        this.name = inputName;
        this.points = 0;
        System.out.println("Welcome " + this.name + " to the game!");
    }

    public String getName() {
        return name;
    }

    public void setName(String x) {
        name = x;
    }

    public double getPoints() {
        return points;
    }
}
