public class SumDigit {
    public static void main(String[] args) {

        // Given a non-negative int n, return the sum of its digits recursively (no loops).
        // Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while
        // divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

        int sum = sumNums(25);
        int percentDivide = sum % 10;
        int divideByTen = sum / 10;
        System.out.println("The sum of the numbers: " + sum);
        System.out.println(sum + "%10 = " + percentDivide);
        System.out.println(sum + "/10 = " + divideByTen);
    }

    public static int sumNums(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n + sumNums(n - 1);
        }
    }


}
