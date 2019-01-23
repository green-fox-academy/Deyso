import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
    public static void mainDraw(Graphics g) {

        int purpleFromX = 310;
        int purpleFromY = 300;
        int purpleToX =   290;
        int purpleToY =   5;

        int greenFromX = 10;
        int greenFromY = 20;
        int greenToX =   30;
        int greenToY =   315;

        for (int i = 0; i < 14; i++) {
            g.setColor(Color.PINK);
            g.drawLine(purpleFromX,purpleFromY,purpleToX,purpleToY);
            purpleFromY -=20;
            purpleToX -=20;
        }
        for (int i = 0; i < 14; i++) {
            g.setColor(Color.GREEN);
            g.drawLine(greenFromX,greenFromY,greenToX,greenToY);
            greenFromY +=20;
            greenToX +=20;
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