import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class TrianglesFunction {
    public static void mainDraw(Graphics g) {

        drawingLinesForTriangle(WIDTH / 2, WIDTH / 2, 50, 50, HEIGHT - 50, (((WIDTH + HEIGHT) / 2) - 100) / 10, g, Color.BLACK, 5);
        //drawingLinesForTriangle(WIDTH / 2, 50, WIDTH-50, HEIGHT - 50, 20, g, Color.BLACK,5);
    }

    public static void drawingLinesForTriangle(int fromX, int fromX2, int fromY, int toX, int toY, int howMany, Graphics g, Color color, int set) {
        g.setColor(color);
        for (int i = 0; i < 20; i++) {
            g.drawLine(fromX += set, fromY += 10, toX += 10, toY);
            System.out.println(fromX);
            g.drawLine(fromX2 - set*i, fromY, 250 -= 10, toY);
            System.out.println("secound" + fromX);*/
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
