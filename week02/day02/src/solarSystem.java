import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class solarSystem {
    public static void main(String[] args) {
        /*import java.util.*;

                ArrayList<String> planetList = new ArrayList<String>(Arrays.asList("Mercury","Venus","Earth","Mars","Jupiter","Uranus","Neptune"));

                // Saturn is missing from the planetList
                // Insert it into the correct position
                // Create a method called putSaturn() which has list parameter and returns the correct list.

                System.out.println(putSaturn(planetList));
                // Expected output: "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"
            */

        ArrayList<String> planetList = new ArrayList<>(Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Uranus", "Neptune"));

        putSaturn(planetList);
        System.out.println(planetList);
    }

    public static List putSaturn(List correctPlanets){
        correctPlanets.add(5,"Saturn");
        return correctPlanets;
    }

}



