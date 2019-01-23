import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

public class AppendLetter {
    public static void main(String[] args) {

        List<String> far = asList("bo", "anacond", "koal", "pand", "zebr");
        // Create a method called "appendA()" that adds "a" to every string in the "far" list.
        // The parameter should be a list.

        List hello = appendA(far);
        System.out.println(hello);
    }

    public static List appendA(List atadott) {
        List<String> ujAtadott= asList();
        for (int i = 0; i < atadott.size(); i++) {
            ujAtadott.add(atadott.get(i) + "a");
        }
        System.out.print(ujAtadott);
        return ujAtadott ;

    }

}
