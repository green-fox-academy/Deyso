import java.util.Scanner;

public class drawTriangle {

    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // triangle like this:
        //
        // *
        // **
        // ***
        // ****
        //
        // The triangle should have as many lines as the number was

        int num;
        String star = "";

        Scanner input = new Scanner(System.in);

        System.out.println("Put a number");
        num = input.nextInt();

        for (int i = 0; i != num; i++) {
            star += "*";
            System.out.println(star);
        }

    }

}
