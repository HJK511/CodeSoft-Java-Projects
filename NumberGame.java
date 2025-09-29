import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int score = 0;
        boolean playAgain = true;

        while (playAgain) {
            int numberToGuess = rand.nextInt(100) + 1; // 1 to 100
            int attempts = 0, maxAttempts = 5;
            boolean guessed = false;

            System.out.println("Guess the number between 1 and 100 (You have " + maxAttempts + " attempts):");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();
                attempts++;

                if (guess == numberToGuess) {
                    System.out.println("🎉 Correct! You guessed it in " + attempts + " attempts.");
                    score++;
                    guessed = true;
                    break;
                } else if (guess > numberToGuess) {
                    System.out.println("Too High! Try again.");
                } else {
                    System.out.println("Too Low! Try again.");
                }
            }

            if (!guessed) {
                System.out.println("❌ Out of attempts! The number was: " + numberToGuess);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String choice = sc.next();
            if (!choice.equalsIgnoreCase("yes")) {
                playAgain = false;
            }
        }
        System.out.println("Your final score (Rounds Won): " + score);
        sc.close();
    }
}
