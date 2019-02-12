import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Planes> planes = new ArrayList<>();
        int numberOfRefill = 50;


        planes.add(new F16());
        planes.add(new F35());


        for (int i = 0; i < planes.size(); i++) {
        System.out.println(planes.get(i));

        }

    }

}
