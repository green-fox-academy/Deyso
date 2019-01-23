import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
    public static void mainDraw(Graphics g) {
        // Fill the canvas with a checkerboard pattern.

        int y = 0;

        for (int i = 0; i <16 ; i++) {
            int x=0;
            if(i%2 != 0){
                x+=10;
            }
            for (int j = 0; j < 16; j++) {
                g.setColor(Color.BLACK);
                g.fillRect(x,y,10,10);
                x +=20;
            }
            y+=10;
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