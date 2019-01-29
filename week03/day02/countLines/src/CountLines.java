import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
    public static void main(String[] args) {

        try {
            Path file = Paths.get("neededFile.txt");
            List<String> countLines = Files.readAllLines(file);
            System.out.println(countLines.size());
        } catch (Exception ex){
            System.err.println("Can't open the file");
        }

    }


}
