import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayWithFunction {
    public static void mainDraw(Graphics g) {

        int greenFromX = 510;
        int greenFromY = 20;
        int greenToX =   530;
        int greenToY =   315;

        int greenFromX1 = 510;
        int greenFromY1 = 20;
        int greenToX1 =   530;
        int greenToY1 =   315;

        int greenFromX2 = 510;
        int greenFromY2 = 620;
        int greenToX2 =   510;
        int greenToY2 =   335;


        for (int i = 0; i < 14; i++) {
            g.setColor(Color.GREEN);
            g.drawLine(greenFromX,greenFromY,greenToX,greenToY);
            greenFromY +=20;
            greenToX +=20;
        }
        for (int i = 0; i < 14; i++) {
            g.setColor(Color.GREEN);
            g.drawLine(greenFromX1,greenFromY1,greenToX1,greenToY1);
            greenFromY1 +=20;
            greenToX1 -=20;
        }
        for (int i = 0; i < 14; i++) {
            g.setColor(Color.GREEN);
            g.drawLine(greenFromX2,greenFromY2,greenToX2,greenToY2);
            greenFromY2 -=20;
            greenToX2 -=20;
        }
    }

    // Don't touch the code below
    static int WIDTH = 1024;
    static int HEIGHT = 1024;

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