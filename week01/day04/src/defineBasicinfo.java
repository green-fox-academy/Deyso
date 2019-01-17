import java.util.Scanner;

public class defineBasicinfo {

    public static void main(String[] args) {

        // Define several things as a variable then print their values
        // Your name as a string
        // Your age as an integer
        // Your height in meters as a double
        // Whether you are married or not as a boolean

        int myAge = 23;
        double height = 1.78;
        boolean married;
        String answer;


        String myName = new String("Dezso Bauer");
        Scanner input = new Scanner(System.in);


        System.out.println("My name is " + myName);
        System.out.println("My age is " + myAge);
        System.out.println("My height is " + height);

        System.out.println("Your name is Dezso Bauer? y/n ");
        answer = input.next();

        if (answer.equals("y")) {
            married = false;
            System.out.println("Because your answer was y your married status is " + married);
        } else {
            married = true;
            System.out.println("Because your answer was n i'dont know who you are so maybe your married status could be " + married);
        }

    }
}
