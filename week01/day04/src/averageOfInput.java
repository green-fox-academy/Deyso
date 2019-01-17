import javafx.scene.transform.Scale;

import java.util.Scanner;

public class averageOfInput {
    public static void main(String[] args) {

        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        //
        // Sum: 22, Average: 4.4

        Scanner init = new Scanner(System.in);
        int number;
        double allNumber = 0;
        int counter = 6 ;

        for (int i = 0; i < 5; i++) {
            counter --;
            System.out.println("Write 5 number. Still " + counter +" missing");

            number = init.nextInt();
            allNumber += number;
        }

        System.out.println("Sum = " + allNumber);
        System.out.println("Average = " + (allNumber / 5));
    }

}
