import java.util.Scanner;
import java.util.Random;

public class GuessMyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Guess My Number Game!");
        System.out.println("I'm thinking of a number between 1 and 100. Can you guess what it is?");

        int numberToGuess = random.nextInt(100) + 1; // Random number between 1 and 100
        int userGuess = 0;
        int attempts = 0;

        while (userGuess != numberToGuess) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            attempts++;

            if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
            }
        }

        scanner.close();
    }
}