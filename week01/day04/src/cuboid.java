import java.util.Scanner;

public class cuboid {
    public static void main(String[] args) {

        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        // The program should write the surface area and volume of the cuboid like:
        //
        // Surface Area: 600
        // Volume: 1000

       // Volume = Length × Width ×  Height

        double lenght = 13.75;
        double width = 4.5;
        double height = 6.5;

        double area = (lenght * 2) + (width * 2) + (height * 2);
        double volume = (lenght * width * height);

        System.out.println(area);
        System.out.println(volume);




    }

}
