import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;


public class DrawingCanvas extends JComponent {

    private int width;
    private int height;


    public DrawingCanvas(int w, int h)
    {
        width = w;
        height = h;
    }


    protected void paintComponent(Graphics g) {
        //New Graphics object to draw board
        Graphics2D g2d = (Graphics2D) g;

        RenderingHints rh = new RenderingHints(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);

        g2d.setColor(Color.BLACK);
        //horizontal lines
        g2d.drawLine(100,0,100,400);
        g2d.drawLine(200,0,200,400);
        g2d.drawLine(300,0,300,400);
        //vertical lines
        g2d.drawLine(0,100,400,100);
        g2d.drawLine(0,200,400,200);
        g2d.drawLine(0,300,400,300);


    }


}
