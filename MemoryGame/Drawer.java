import javax.swing.*;
import java.awt.*;

public class Drawer extends JComponent {


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

    public  void drawCircle()
    {
        Graphics g2d = getGraphics();
        g2d.setColor(Color.BLACK);
        g2d.fillOval(0,0,100,100);
        g2d.setColor(Color.WHITE);
        g2d.fillOval(15,15,70,70);
        g2d.setColor(Color.RED);
        g2d.fillOval(16,16,68,68);
    }


}
