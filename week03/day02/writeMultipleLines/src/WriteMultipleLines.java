import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteMultipleLines {
    public static void main(String[] args) {

        // Create a function that takes 3 parameters: a path, a word and a number
        // and is able to write into a file.
        // The path parameter should be a string that describes the location of the file you wish to modify
        // The word parameter should also be a string that will be written to the file as individual lines
        // The number parameter should describe how many lines the file should have.
        // If the word is 'apple' and the number is 5, it should write 5 lines
        // into the file and each line should read 'apple'
        // The function should not raise any errors if it could not write the file.

        try {

            String path = "./files/myFile.txt";

            Files.createDirectory(Paths.get("./files/"));

            Scanner scannerString = new Scanner(System.in);
            Scanner scannerInteger = new Scanner(System.in);
            System.out.println("Please give a content");
            String askedString = scannerString.next();
            System.out.println("Please give a number");
            Integer multiplierNum = scannerInteger.nextInt();

            putIntoTheFile(askedString,multiplierNum,path);


        }catch (Exception ex){

        }

    }
    public static void putIntoTheFile(String askedString,Integer multiplierNum,String path){
        List<String> arryString = new ArrayList<>();

        for (int i = 0; i < multiplierNum; i++) {
            arryString.add(askedString);
        }
        try {
            Path toPath = Paths.get(path);
            giles.write(toPath,arryString);

        } catch (Exception ex){

        }


    }


}
