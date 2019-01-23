import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class toTheCenter extends JPanel {
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        this.setBackground(Color.WHITE);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = screenSize.width;
        int height = screenSize.height;

        int[] x={};
        int[] y={};
        int[] lineColor={};

        for (int i = 0; i < 3; i++) {
            int rndX = (int)(Math.random()*width);
            int rndY = (int)(Math.random()*height);
            int rColor = (int)(Math.random()*256);
            int gColor = (int)(Math.random()*256);
            int bColor = (int)(Math.random()*256);

            g.setColor(new Color(rColor,gColor,bColor));
            g.drawLine(rndX,rndY,width/2,height/2);
        }


    }


}
