import java.lang.reflect.Array;
import java.util.Arrays;

public class reserveList {
    public static void main(String[] args) {
        // - Create an array variable named `aj`
        //   with the following content: `[3, 4, 5, 6, 7]`
        // - Reverse the order of the elements in `aj`
        // - Print the elements of the reversed `aj`

       int[] aj = {3, 4, 5, 6, 7};
        int temp;
        for (int i = 0; i < aj.length / 2; i++) {
            temp = aj[i];
            aj[i] = aj[aj.length - 1 - i];
            aj[aj.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(aj));
}
}
