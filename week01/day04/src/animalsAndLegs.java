import java.util.Scanner;

public class animalsAndLegs {

    public static void main(String[] args) {

        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have

        Scanner init = new Scanner(System.in);

        int chickenLegs = 2 ;
        int pigLegs = 4 ;
        int chickens;
        int pigs;

        System.out.println("How many chickens lives in the farm? ");
        chickens = init.nextInt();

        System.out.println("How many pigs lives in the farm?");
        pigs = init.nextInt();


        int legsOnTheFarm = (chickens * chickenLegs) + (pigs * pigLegs);

        System.out.println("The chickens and the pigs have " + legsOnTheFarm + " legs together" );


    }
}
