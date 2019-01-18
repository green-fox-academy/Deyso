import java.util.Scanner;

public class drawPyramid {

    public static void main(String[] args) {

        int num;

        Scanner inp = new Scanner(System.in);

        System.out.println("Please insert number");
        num = inp.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}

