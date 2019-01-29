import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class TriangleWithFunction {
    public static void mainDraw(Graphics g) {
        int fromRightX = WIDTH/2;
        int fromLefttX = WIDTH/2;
        int fromY = HEIGHT/6;
        int toX = WIDTH/6;
        for (int i = 0; i < 21; i++) {

            drawTheTriangles(fromRightX, fromY, toX, g);
            fromRightX += WIDTH/60;
            fromY += HEIGHT/30;
            toX += WIDTH/30;
        }
    }

    public static void drawTheTriangles(int fromRightX, int FromY, int toX, Graphics g) {
        g.setColor(Color.BLACK);
        g.drawLine(fromRightX, FromY, toX, 250);

        int toX2 = WIDTH - toX;
        int newRightX = WIDTH - fromRightX;
        g.drawLine(newRightX, FromY, toX2, 250);

        g.drawLine(fromRightX, FromY, newRightX, FromY);

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
