import com.sun.deploy.util.StringUtils;

import java.util.Collections;
import java.util.Scanner;

public class drawDiamond {

    public static void main(String[] args) {

        //    *
        //   ***
        //  *****
        // *******
        //  *****
        //   ***
        //    *

        int num;
        Scanner input = new Scanner(System.in);

        System.out.println("Please insert a number");
        num = input.nextInt();
        int num2 = num - 1;
        int space = 2;

        for (int i = 0; i < num; i++) {
            for (int k = 0; k < num - i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.print("  ");
        for (int a = 0; a < num2; a++) {
            for (int b = 0; b < num2 - a; b++) {
                System.out.print("* ");
            }
            space++;
            System.out.println();
            System.out.print(String.join("", Collections.nCopies(space, " ")));

        }
    }

}
