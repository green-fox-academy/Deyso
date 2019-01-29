import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LineRoni {
    public static void mainDraw(Graphics g) {
        drawPinkLines(WIDTH / 16, HEIGHT / 16, WIDTH - 20, WIDTH / 8, g, Color.PINK);
        drawGreenLines(WIDTH / 16, HEIGHT / 8, WIDTH / 8, HEIGHT - 20, g, Color.GREEN);

    }

    public static void drawPinkLines(int fromPosX, int fromPosY, int toPosX, int toPosY, Graphics g, Color color) {
        g.setColor(color);
        for (int i = 0; i < 14; i++) {
            g.drawLine(fromPosX, fromPosY, toPosX, toPosY);
            fromPosX += 20;
            toPosY += 20;
        }
    }

    public static void drawGreenLines(int fromPosX, int fromPosY, int toPosX, int toPosY, Graphics g, Color color) {
        g.setColor(color);
        for (int i = 0; i < 14; i++) {
            g.drawLine(fromPosX, fromPosY, toPosX, toPosY);
            fromPosY += 20;
            toPosX += 20;
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
            this.setBackground(Color.BLACK);
            mainDraw(graphics);
        }
    }
}