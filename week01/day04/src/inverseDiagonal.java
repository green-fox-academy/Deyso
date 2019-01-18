import java.util.Collections;
import java.util.Scanner;

public class inverseDiagonal {
    public static void main(String[] args) {

        // %%%%%%
        // %%   %
        // % %  %
        // %  % %
        // %   %%
        // %%%%%%

        for (int i = 0; i < 10; ++i) {
            for (int j = 0; j < 10; j++) {
                System.out.print(i  +""+ j + " ");
            }
            System.out.println();
        }

        int squareHigh;

        Scanner input = new Scanner(System.in);
        System.out.println("How big you want the square (in lines)");
        squareHigh = input.nextInt();

        int space = 0;
        int spaceForDiagonal = squareHigh - 3;


        for (int i = 0; i < squareHigh; i++) {

            if (i == squareHigh - 1) {
                for (int j = 0; j < squareHigh; j++) {
                    System.out.print("%");
                }
                System.out.println();
            } else if (i == 0) {
                for (int k = 0; k < squareHigh; k++) {
                    System.out.print("%");
                }
                System.out.println();
            } else if (i != squareHigh && i != 0) {

                System.out.print("%");
                System.out.print(String.join("", Collections.nCopies(spaceForDiagonal, " ")));
                System.out.print("%");
                System.out.print(String.join("", Collections.nCopies(space, " ")));
                System.out.print("%");
                System.out.println();
                spaceForDiagonal--;
                space++;
            }
        }
    }
}
