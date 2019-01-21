import java.util.Scanner;

public class diagonalHowKariSad {

    public static void main(String[] args) {

        int squareNumber;
        Scanner input = new Scanner(System.in);
        System.out.println("Give a number");
        squareNumber = input.nextInt();


        for (int i = 0; i < squareNumber; ++i) {
            for (int j = 0; j < squareNumber; j++) {
                if (i == 0 || i == squareNumber - 1) {
                    System.out.print("%");
                } else if (i + j == squareNumber - 1) {
                    System.out.print("%");
                } else if (j == 0 || j == squareNumber - 1) {
                    System.out.print("%");
                } else if (i != 0 || i != squareNumber - 1) {
                    System.out.print(" ");
                } else if (j != 0 || j != squareNumber - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }
}
