import java.util.Scanner;

public class countFromTo {

    public static void main(String[] args) {

        // Create a program that asks for two numbers
        // If the second number is not bigger than the first one it should print:
        // "The second number should be bigger"
        //
        // If it is bigger it should count from the first number to the second by one
        //
        // example:
        //
        // first number: 3, second number: 6, should print:
        //
        // 3
        // 4
        // 5

        int firstNumber;
        int secoundNumber;

        Scanner input = new Scanner(System.in);

        System.out.println("Write the firstnumber");
        firstNumber = input.nextInt();

        System.out.println("Write the secoundnumber");
        secoundNumber = input.nextInt();

        if (firstNumber > secoundNumber) {
            System.out.println("The second number should be bigger");
        }

        if (firstNumber < secoundNumber) {
            for (int i = firstNumber; i != secoundNumber-1; i++) {
                firstNumber++;

                System.out.println(firstNumber);
            }
        }
    }
}
