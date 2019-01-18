import java.util.Scanner;

public class parametricAverage {

    public static void main(String[] args) {

        // Write a program that asks for a number.
        // It would ask this many times to enter an integer,
        // if all the integers are entered, it should print the sum and average of these
        // integers like:
        //
        // Sum: 22, Average: 4.4

        int typedNumber;
        int numbers;
        double counter = 0;
        int sum = 0;


        Scanner input = new Scanner(System.in);
        System.out.println("Add how many numbers you would get them Sum, and average");
        typedNumber = input.nextInt();

        while (counter < typedNumber) {
            int askNumber;
            System.out.println("---------------------");
            askNumber = input.nextInt();
            sum += askNumber;
            counter++;
        }
        double average = sum / counter;

        System.out.println("The Sum of the numbers what you wrote is: " + sum + " and the average is " + average);

    }

}
