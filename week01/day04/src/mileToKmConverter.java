import java.util.Scanner;

public class mileToKmConverter {

    public static void main(String[] args) {


        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it

        Scanner init = new Scanner(System.in);

        double km;

        System.out.println("Pleas add how long the distance (in km) ");
        km = init.nextDouble();

        System.out.println("Your distance in mile is " + (km / 1.609344));
    }

}
