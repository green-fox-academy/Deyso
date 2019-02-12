public class Flowers implements Waterable {

    String color;
    String typeOfPlant = "Flower";
    int water;
    String nW;

    public Flowers(String color, int water) {
        this.color = color;
        this.water = water;
    }


    @Override
    public void watering(int givenWater, int count) {
        if (isThirsty() == true) {
            this.water += (givenWater / count) * 0.75;
        }
    }


    @Override
    public void status() {
        if (this.water < 5) {
            nW = "needs water";
        } else {
            nW = "doesn't need water";
        }
        System.out.println(this.color + " " + this.typeOfPlant + " " + this.water + " " + nW);
    }

    @Override
    public boolean isThirsty() {
        if (this.water < 5) {
            return true;
        } else {
            return false;
        }
    }
}
