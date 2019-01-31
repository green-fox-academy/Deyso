public class NumberAdder {
    public static void main(String[] args) {
        // Write a recursive function that takes one parameter: n and adds numbers from 1 to n.

        int asd = factorialWithRecursion(10);
        System.out.println(asd);

    }
    public static int factorialWithRecursion(int n) {
        System.out.println(n);
        if ( n == 1) {
            return 1;
        } else {
            return n + factorialWithRecursion(n-1);
        }
    }
}
