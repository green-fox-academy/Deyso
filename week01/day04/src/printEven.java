public class printEven {

    public static void main(String[] args) {

        // Create a program that prints all the even numbers between 0 and 500

        int numbers = 0;

        for (int i = 0; i < 500; i++) {

            numbers++;

            if ((numbers % 2) != 0) {
                System.out.println(numbers);
            }
        }
    }


}
