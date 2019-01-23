import javax.swing.*;
import javax.swing.*;
import java.awt.*;

public class Canvas {

    public static void main(String[] args) {

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;


        JFrame f = new JFrame("Title");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        toTheCenter t = new toTheCenter();      //a nev amivel mashol egy .js file-t kell csinalni
        f.add(t);                   //addoljuk a codehoz
        f.setSize (screenWidth,screenHeight);
        f.setVisible(true);


    }




}
