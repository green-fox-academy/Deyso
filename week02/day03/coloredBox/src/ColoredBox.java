import javax.swing.*;
import java.awt.*;

public class ColoredBox extends JPanel {
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        this.setBackground(Color.BLACK);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = screenSize.width;
        int height = screenSize.height;


        g.setColor(Color.GREEN);
        g.drawLine(0,0,width/2,0);

        g.setColor(Color.BLUE);
        g.drawLine(width/2,height/2,width/2,0);

        g.setColor(Color.RED);
        g.drawLine(0,0,0,height/2);

       g.setColor(Color.CYAN);
        g.drawLine(width/2,height/2 ,0,height/2);



    }

}
