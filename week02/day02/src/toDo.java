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


        String todoText = " - Buy milk\n";

        String newLine = "\n - ";
        String newLineNewIndention = "\n\t - ";

        if(todoText.startsWith(" -")){
           todoText = todoText.replace(" - Buy milk\n","My todo: ");
        }
        if (todoText.endsWith(": ")){
            todoText += newLine + "Buy milk" ;
        }
        if (todoText.endsWith("milk")){
            todoText += newLine + "Download Games";
        }
        if(todoText.endsWith("es")){
            todoText += newLineNewIndention + "Diablo";
        }

        System.out.println(todoText);

    }


}
