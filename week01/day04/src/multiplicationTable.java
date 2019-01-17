import java.util.Scanner;

public class multiplicationTable {

    public static void main(String[] args) {

        // Create a program that asks for a number and prints the multiplication table with that number
        //
        // Example:
        // The number 15 should print:
        //
        // 1 * 15 = 15
        // 2 * 15 = 30
        // 3 * 15 = 45
        // 4 * 15 = 60
        // 5 * 15 = 75

        int askedNumber;
        int multipleNumber = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Please add a number");
        askedNumber = input.nextInt();

        if (askedNumber != 0) {
            for (int i = 0; i < 10; i++) {
                multipleNumber++;
                System.out.println(multipleNumber + " * " + askedNumber + " = " + (multipleNumber * askedNumber));
            }
        }

    }
}
