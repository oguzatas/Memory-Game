import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Ellipse2D;
import javax.swing.*;
class Mouse extends JFrame implements MouseListener {

    private int index;
    private boolean clicked;

    public boolean isClicked() {
        return clicked;
    }

    public void setClicked(boolean clicked) {
        this.clicked = clicked;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public void mouseClicked(MouseEvent e)
    {


        clicked = false;
        //Getting index of the element
        double Xcor = e.getX();
        double Ycor = e.getY();
        indexDetector(Xcor,Ycor);

        if (!clicked)
        {

            clicked = true;
        }
        //Revealing the first circle
        /*----------TODO ---------------*/


        if(clicked)
        {

            clicked = false;
        }

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    public void indexDetector(double X, double Y)
    {
        //Line 1
        if(X < 100 && Y < 100)
        {
            setIndex(1);
        }
        else if (X<200 && Y<100)
        {
            setIndex(2);
        }
        else if (X<300 && Y<100)
        {
            setIndex(3);
        }
        else if (X<400 && Y<100)
        {
            setIndex(4);
        }
        //Line 2
        else if (X<100 && Y<200)
        {
            setIndex(5);
        }
        else if (X<200 && Y<200)
        {
            setIndex(6);
        }
        else if (X<300 && Y<200)
        {
            setIndex(7);
        }
        else if (X<400 && Y<200)
        {
            setIndex(8);
        }
        //Line 3
        else if (X<100 && Y<300)
        {
            setIndex(9);
        }
        else if (X<200 && Y<300)
        {
            setIndex(10);
        }
        else if (X<300 && Y<300)
        {
            setIndex(11);
        }
        else if (X<400 && Y<300)
        {
            setIndex(12);
        }
        //Line 4
        else if (X<100 && Y<400)
        {
            setIndex(13);
        }
        else if (X<200 && Y<400)
        {
            setIndex(14);
        }
        else if (X<300 && Y<400)
        {
            setIndex(15);
        }
        else if (X<400 && Y<400)
        {
            setIndex(16);
        }
    }
}