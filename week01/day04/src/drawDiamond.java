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
            for (int j = 0; j < num - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.print("  ");
        for (int l = 0; l < num2; l++) {
            for (int m = 0; m < num2 - l; m++) {
                System.out.print("* ");
            }
            space++;
            System.out.println();
            System.out.print(String.join("", Collections.nCopies(space, " ")));

        }
    }

}
