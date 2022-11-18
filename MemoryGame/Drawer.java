import java.awt.*;

public class Drawer {


    public void drawBoard(Graphics2D g2d)
    {
        // Graphics2D g2d = (Graphics2D) g;
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
