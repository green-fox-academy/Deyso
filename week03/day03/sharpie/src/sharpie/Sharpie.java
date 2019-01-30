package sharpie;

public class Sharpie {

    /*
    -Create Sharpie class
    -We should know about each sharpie their color (which should be a string), width (which will be a floating point number), inkAmount (another floating point number)
    -When creating one, we need to specify the color and the width
    -Every sharpie is created with a default 100 as inkAmount
    -We can use() the sharpie objects
    -which decreases inkAmount*/


    String color;
    int width;
    int inkAmount;

    public Sharpie(String color, int width) {
        this.color = color.toUpperCase();
        this.width = width;
        inkAmount = 100;
    }

    public void use() {
        inkAmount--;
    }

    public void getTheCurrentData() {
        System.out.println("Your sharpie color is: " + color + " and the width is: " + width + " amount of ink is: " + inkAmount);
    }


}
