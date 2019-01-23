import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics g){
        // draw four different size and color rectangles.
        // avoid code duplication.
        for (int i = 0; i <4 ; i++) {
            int rndX = (int)(Math.random()*271);
            int rndY = (int)(Math.random()*271);

            int rndSizeX = (int)(Math.random()*51);
            int rndSizey = (int)(Math.random()*51);

            int redColor = (int)(Math.random()*256);
            int greenColor = (int)(Math.random()*256);
            int blueColor = (int)(Math.random()*256);

            g.setColor(new Color(redColor,greenColor,blueColor));
            g.fillRect(rndX,rndY,rndSizeX,rndSizey);


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