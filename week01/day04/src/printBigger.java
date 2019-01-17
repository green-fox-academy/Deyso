import java.util.Scanner;

public class printBigger {

    public static void main(String[] args) {

        // Write a program that asks for two numbers and prints the bigger one

        Scanner input = new Scanner(System.in);

        double number1;
        double number2;

        System.out.println("Please write the first number");
        number1 = input.nextDouble();
        System.out.println("Please write the secound number");
        number2 = input.nextDouble();

        if (number1 > number2) {
            System.out.println("The number1 is bigger than number2 with " + (number1 - number2) + " || " + number1 + " > " + number2);
        } else {
            System.out.println("The number2 is bigger than number1 " + (number2 - number1) + " || " + number1 + " < " + number2);
        }


    }

}
