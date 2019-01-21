import java.util.Random;
import java.util.Scanner;

public class gussTheNumber {
    public static void main(String[] args) {

        // Write a program that stores a number, and the user has to figure it out.
        // The user can input guesses, after each guess the program would tell one
        // of the following:
        //
        // The stored number is higher
        // The stried number is lower
        // You found the number: 8


        int guessedNumber;
        int randomNumber = (int) (Math.random() * 50 + 1);
        Scanner input = new Scanner(System.in);

        System.out.println("I thought a number between 0-50. Guess the number : ");
        guessedNumber = input.nextInt();

        while (guessedNumber != randomNumber) {
            if (guessedNumber < randomNumber) {
                System.out.println("The number is higher. Guess another one: ");
                guessedNumber = input.nextInt();
            } else if (guessedNumber > randomNumber) {
                System.out.println("The number is lower. Guess another one: ");
                guessedNumber = input.nextInt();
            }

        }
        System.out.println("You won!!");
    }
}
