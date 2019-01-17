import java.util.Scanner;

public class oddEven {

    public static void main(String[] args) {

        // Write a program that reads a number from the standard input,
        // Then prints "Odd" if the number is odd, or "Even" if it is even.

        Scanner input = new Scanner(System.in);

        int number;

        System.out.println("Write in a number");
        number = input.nextInt();

        if ((number % 2) == 0){
            System.out.println("The number what you wrote is an Odd number --> " + number);
        } else {
            System.out.println("The number what you wrote is an Even number --> " + number);
        }

    }

}
