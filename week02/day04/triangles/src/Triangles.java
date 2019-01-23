import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
    public static void mainDraw(Graphics g) {

        int fromX = 50;
        int fromY = 250;
        int toX = 250;
        int toY = 250;

        int fromVerticalX = 150;
        int fromVerticalY = 50;
        int toVerticalX = 50;


        g.setColor(Color.BLACK);
        g.drawLine(fromX, fromY, 150, 50);
        g.drawLine(150, 50, toX, toY);
        g.drawLine(fromX, fromY, toX, toY);

        for (int i = 0; i < 20; i++) {
            fromX += 5;
            fromY -= 10;
            toX -= 5;
            toY -= 10;

            fromVerticalX += 5;
            fromVerticalY += 10;
            toVerticalX += 10;

            drawHorizontalLines(fromX, fromY, toX, toY, g);
            drawFirstVerticalLines(fromVerticalX, fromVerticalY, toVerticalX, g);
        }

        drawSecondVertical(fromVerticalX, fromVerticalY, g);

    }

    public static void drawHorizontalLines(int fromX, int fromY, int toX, int toY, Graphics g) {
        g.setColor(Color.BLACK);
        g.drawLine(fromX, fromY, toX, toY);
    }

    public static void drawFirstVerticalLines(int fromVerticalX, int fromVerticalY, int toVerticalX, Graphics g) {
        g.setColor(Color.BLACK);
        g.drawLine(fromVerticalX, fromVerticalY, toVerticalX, 250);
    }

    public static void drawSecondVertical(int fromVerticalX, int fromVerticalY, Graphics g) {
        int fromX = fromVerticalX;
        int fromY = fromVerticalY;
        int toX = 150;
        int toY = 50;
        for (int i = 0; i < 20; i++) {
            g.setColor(Color.BLACK);
            g.drawLine(fromX, fromY, toX, toY);
            fromX -= 10;
            toX -= 5;
            toY += 10;
        }
    }


    // Don't touch the code below
    static int WIDTH = 300;
    static int HEIGHT = 300;

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
