import java.util.Scanner;

public class toDo {
    public static void main(String[] args) {

         /* // Add "My todo:" to the beginning of the todoText
                // Add " - Download games" to the end of the todoText
                // Add " - Diablo" to the end of the todoText but with indention

                // Expected outpt:

                // My todo:
                //  - Buy milk
                //  - Download games
               //      - Diablo
*/



        String newLine = "\n - ";
        String newLineNewIndention = "\n\t - ";
        String todoText ="My todo:" + newLine + "Buy milk" + newLine + "Download games"+ newLineNewIndention + "Diablo";


        System.out.println(todoText);







    }


}
