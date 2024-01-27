package bhagya;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        Scanner choice = new Scanner(System.in);
        boolean Retry;

        do {
            PlayingGame(choice);

            System.out.println("Wanna play again?\n");
            System.out.println("(yes/no): ");
            String response = choice.next().toLowerCase();
            Retry = response.equals("yes");

            if (!Retry) {
                float rating = getRating(choice);
                
                System.out.println("Your play was highly appreciable!\nThank you for the rating!");
                System.out.println("Have a nice day,GoodLuck");
            }

        } while (Retry);

        choice.close();
    }

    private static void PlayingGame(Scanner game) {
        System.out.println("Welcome to the Guessing Game!");
        System.out.println("Now,Let's start the game");
        System.out.println("A number is selected between 1 and 100. Try finding it!");

        int secretNumber = (int) (Math.random() * 100) + 1;
        int guess;
        int attempts = 0;
        int maxNumberOfAttempts = 5;

        while (attempts < maxNumberOfAttempts) {
            System.out.print("Please Enter your guess: ");
            guess = game.nextInt();
            attempts++;

            if (guess < secretNumber) {
                System.out.println("Your guess is Too low! Retry");
            } else if (guess > secretNumber) {
                System.out.println("Your guess is Too high!Retry");
            } else {
                System.out.println("Congratulations! You guessed the secret number " + secretNumber + " in " + attempts + " attempts.");
                return; 
            }
        }
        System.out.println("Sorry, you've reached the maximum number of attempts.");
        System.out.println("The secret number was: " + secretNumber);
    }

    private static float getRating(Scanner game) {
        System.out.print("Please rate the game: \n");
        String ratingInput = game.next();

        try {
           
            return Float.parseFloat(ratingInput);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input>");
            return 3.0f;  
        }
    }
}