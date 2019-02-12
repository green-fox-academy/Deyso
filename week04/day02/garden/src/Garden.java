import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Garden {
    int rndFlowerWater = (int) (Math.random() * 10 + 1);
    int rndTreeWater = (int) (Math.random() * 15 + 1);
    int howManyThirsty = 0;

    List<Waterable> listOfPlants = new ArrayList<>();

    public Garden() {
        Flowers yellowFlower = new Flowers("Yellow", 0);
        Flowers blueFlower = new Flowers("Blue", 0);
        Trees purpleTree = new Trees("Purple", 0);
        Trees orangeTree = new Trees("Orange", 0);

        listOfPlants.add(yellowFlower);
        listOfPlants.add(blueFlower);
        listOfPlants.add(purpleTree);
        listOfPlants.add(orangeTree);
    }

    public int countThirsty() {
        howManyThirsty = 0;
        for (Waterable plant : listOfPlants) {
            if (plant.isThirsty() == true) {
                howManyThirsty++;
            }
        }
        System.out.println(howManyThirsty);
        return howManyThirsty;
    }

    public void getStatus() {
        for (Waterable plant : listOfPlants) {
            plant.status();
        }
    }

    public void giveWater(int givenWater) {
        for (Waterable plant : listOfPlants) {
            plant.watering(givenWater, howManyThirsty);
        }
    }
}
