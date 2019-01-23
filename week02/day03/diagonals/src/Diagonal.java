import javax.swing.*;
import java.awt.*;

public class Diagonal extends JPanel {
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        this.setBackground(Color.BLACK);


        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = screenSize.width;
        int height = screenSize.height;


        g.setColor(Color.GREEN);
        g.drawLine(0,0,width, height);

        g.setColor(Color.red);
        g.drawLine(width,0,0, height);


    }
}
