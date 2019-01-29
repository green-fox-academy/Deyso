import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    public static void main(String[] args) {

        // Write a function that copies a file to an other
        // It should take the filenames as parameters
        // It should return a boolean that shows if the copy was successful

        String pathCopyFrom = "myText.txt";
        String pathCopyTo = "copyOfMyText.txt";

        copyFiles(pathCopyFrom,pathCopyTo);
    }
    public static void copyFiles(String pathCopyFrom, String pathCopyTo){
        List<String> someWords = new ArrayList<>();
        someWords.add("valami");
        someWords.add("copy");
        someWords.add("filesaa");

        try {
            Path path = Paths.get(pathCopyFrom);
            Files.write(path,someWords);
            Path pathTo = Paths.get(pathCopyTo);
            Files.copy(path,pathTo);

        } catch (Exception ex){
            System.err.println("e");

        }


    }

}
