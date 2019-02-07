import java.util.ArrayList;

public class Sum {

    public static int sum(ArrayList<Integer> valami) {
        if (valami.equals(null)){
            throw new NullPointerException();
        }

        int sum = 0;
        for (Integer numbers : valami) {
            sum += numbers;
        }
        return sum;

    }

}
