import javax.swing.*;
import java.awt.*;

public class LineInTheMiddle extends JPanel {
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        this.setBackground(Color.BLACK);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;

        g.setColor(Color.red);
        g.drawLine(screenWidth/2, 0, screenWidth/2,screenHeight/2);

        g.setColor(Color.green);
        g.drawLine(0, screenHeight/2, screenWidth/2,screenHeight/2);


    }

}
