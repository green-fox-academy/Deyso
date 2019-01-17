import java.util.Scanner;

public class helloUser {
    public static void main(String[] args) {

        /*public class HelloUser {
            public static void main(String[] args) {
                // Modify this program to greet user instead of the World!
                // The program should ask for the name of the user
                System.out.println("Hello, World!");
            }
        }*/

        Scanner init = new Scanner(System.in);

        String name;

        System.out.println("Please write your name: ");
        name = init.next();

        System.out.println("Hello " + name);


    }

}
