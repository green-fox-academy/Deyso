
        import javax.swing.*;

        import java.awt.*;

        import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void mainDraw(Graphics g) {
        // Create a square drawing function that takes 3 parameters:
        // The square size, the fill color, graphics
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.

        int sizeX = 160;

        for (int i = 0; i < 10 ; i++) {
            int rColor = (int)(Math.random()*256);
            int gColor = (int)(Math.random()*256);
            int bColor = (int)(Math.random()*256);
            sizeX -= 16;
            squareDrawing(sizeX,rColor,gColor,bColor,g);
        }


    }

    public static void squareDrawing(int size,int rColor, int gColor, int bColor, Graphics g){
        g.setColor(new Color(rColor,gColor,bColor));
        g.fillRect(160-size/2,160-size/2,size,size);

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