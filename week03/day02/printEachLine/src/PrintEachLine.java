import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.rmi.server.ExportException;
import java.util.ArrayList;
import java.util.List;

public class PrintEachLine {

    public static void main(String[] args) {

        ArrayList<String> content = new ArrayList<>();
        try {
            Path filePath = Paths.get("valami.txt");
            List<String> lines = Files.readAllLines(filePath);
            System.out.println(lines.get(0));
        } catch (Exception ex){
            System.out.println("Could not read the file");
        }

    }
}
