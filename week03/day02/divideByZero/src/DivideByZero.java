import java.util.Scanner;

public class DivideByZero {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a number");
        int dividedBy = scanner.nextInt();

        try {
            int result = 10/dividedBy;
            System.out.println(result);
        } catch (ArithmeticException ex) {
            System.err.println("The divider can't be 0");
        }

    }
}
