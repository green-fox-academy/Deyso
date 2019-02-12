import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Garden garden = new Garden();
        garden.getStatus();
        garden.countThirsty();
        garden.giveWater(40);
        garden.getStatus();
        garden.countThirsty();
        garden.giveWater(70);
        garden.getStatus();

    }
}
