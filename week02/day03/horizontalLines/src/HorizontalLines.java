import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class HorizontalLines {
    public static void mainDraw(Graphics g) {
        // Create a line drawing function that takes 3 parameters:
        // The x and y coordinates of the line's starting point and the graphics
        // and draws a 50 long horizontal line from that point.
        // Draw 3 lines with that function. Use loop for that.

        for (int i = 0; i <3 ; i++) {
            int rndX = (int)(Math.random()*321);
            int rndY = (int)(Math.random()*321);
            int rColor= (int)(Math.random()*256);
            int gColor= (int)(Math.random()*256);
            int bColor= (int)(Math.random()*256);

            if(rndX>270){
                rndX = rndX-50;
                g.setColor(new Color(rColor,gColor,bColor));
                g.drawLine(rndX,rndY,rndX,rndY);
            }

            g.setColor(new Color(rColor,gColor,bColor));
            g.drawLine(rndX,rndY,rndX+50,rndY);
        }



    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}