import java.text.DecimalFormat;
import java.util.Scanner;

public class bmiCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double kg;
        double height;
        double bmi;

        System.out.println("Plese enter your Kg: ");
        kg = input.nextDouble();

        System.out.println("Plese enter your height in format like 1.78: ");
        height = input.nextDouble();

        bmi = kg / (height * height);

        DecimalFormat df = new DecimalFormat("0.00");


        System.out.println("Your Kg is: " + df.format(kg) + " kg" + " and your height is: " + df.format(height) + "m. So your BMI is: " + df.format(bmi));

    }

}
