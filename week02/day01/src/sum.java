import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        //  Create the usual class wrapper
        //  and main method on your own.

        // - Write a function called `sum` that sum all the numbers
        //   until the given parameter and returns with an integer

        int sumParameter = 5;

        sum(sumParameter);
        System.out.println(sumParameter);

    }

    public static int sum(int sumParameter){
        int inputNumber;
        int sum = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Please give a number");
        inputNumber = input.nextInt();
        int savedSum = inputNumber + inputNumber;

        if(inputNumber != sumParameter){
            sum(sumParameter);
        }
        sumParameter = savedSum;
        return sumParameter;
    }
}
