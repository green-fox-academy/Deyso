import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class WriteSingleLine {
    public static void main(String[] args) {

        List<String > aboutMe = new ArrayList<>();
        aboutMe.add("Hello this is the first line");
        try {
            File filef = new File("myFile.txt");
            filef.createNewFile();


            Path path = Paths.get("myFile.txt");
            Files.write(path, aboutMe);

        } catch (Exception ex){
            System.err.println("Can't add nothing");

        }


    }


}
