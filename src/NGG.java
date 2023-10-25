import java.util.Random;
import java.util.Scanner;

//Number Guessing Game
public class NGG {
    public static void main(String[] args) {
        System.out.println("Guess the Number from Range 1 - 10");
        System.out.println("Total 3 Rounds, each round has 3 attempts");
        int rounds = 3;
        int attempts = 3;
        int min = 1;
        int max = 10;

        for (int i = 1; i <= rounds; i++) {
            int roundPoints = 0;
            Random random = new Random();
            int randomnumber = random.nextInt(max - min + 1) + min;
            //System.out.println("\n" + randomnumber);
            System.out.println("\nRound " + i);

            for (int j = 1; j <= attempts; j++) {
                System.out.println("Attempt " + j);
                System.out.println("Enter your guess:");
                Scanner getInput = new Scanner(System.in);
                int enterednumber = getInput.nextInt();

                if (randomnumber == enterednumber) {
                    System.out.println("Your Guessed Number is Correct!\n");
                    roundPoints = (attempts - j + 1) * 10;
                    break;
                } else if (randomnumber < enterednumber) {
                    System.out.println("Your Guessed Number is Greater!\n");
                } else {
                    System.out.println("Your Guessed Number is Lower!\n");
                }
                if (j == attempts) {
                    System.out.println("Sorry, you've run out of attempts. The correct number was: " + randomnumber + "\n");
                }
            }
            System.out.println("Score : " + roundPoints);
        }
    }
}