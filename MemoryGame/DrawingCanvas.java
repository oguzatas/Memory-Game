import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.*;
import javax.swing.*;


public class DrawingCanvas extends JComponent implements MouseListener {


    public boolean Clicked= false;

//    public static void main(String args[]) {
//
//        ArrayInitializer.InitializeGame(); // Static method to initialize the array and set the game
//
//
//        setCanvas();
//
//
//
//        //Setting session Ends
//
//
//
//    }


    private int width;
    private int height;

    private int index;

    private int previousIndex;



    private Color color;

    private Color previousColor;



    public int game[][];




    public DrawingCanvas(int w, int h) //
    {
        width = w;
        height = h;
        addMouseListener(this);
        ArrayInitializer.InitializeGame();

        game = ArrayInitializer.getGame();
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(int Color) {

        if(Color == 0)
        {
            this.color = java.awt.Color.RED;
        }
        else if (Color == 1) {
            this.color = java.awt.Color.GREEN;
        }
        else if (Color == 2) {
            this.color = java.awt.Color.BLUE;
        }
        else if (Color == 3) {
            this.color = java.awt.Color.yellow;
        }
        else if (Color == 4) {
            this.color = java.awt.Color.orange;
        }
        else if (Color == 5) {
            this.color = java.awt.Color.pink;
        }
        else if (Color == 6) {
            this.color = java.awt.Color.magenta;
        }
        else if (Color == 7) {
            this.color = java.awt.Color.GRAY;
        }


    }

    public int getPreviousIndex() {
        return previousIndex;
    }

    public void setPreviousIndex(int previousIndex) {
        this.previousIndex = previousIndex;
    }

    public Color getPreviousColor() {
        return previousColor;
    }

    public void setPreviousColor(Color previousColor) {
        this.previousColor = previousColor;
    }




    protected void paintComponent(Graphics g) {  // With this method setting the board within the run
        //New Graphics object to draw board
        Graphics2D g2d = (Graphics2D) g;

        //Adding AA
        RenderingHints rh = new RenderingHints(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);

        drawBoard(g2d);
    }

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

    public static void setCanvas()
    {
        int w=400;
        int h=400;

        JFrame f = new JFrame();
        DrawingCanvas dc = new DrawingCanvas(h,w);

        //Setting JFrame Options
        f.setSize(w,h);
        f.setTitle("Memory Game");
        f.add(dc); //adding canvas to the JFrame
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);


        //Setting session Ends
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        //Drawer d = new Drawer();

        if(!Clicked)
        {
            double Xcor = e.getX();
            double Ycor = e.getY();
            indexDetector(Xcor,Ycor);
            index = getIndex();
            color = getColor();
            drawCircle(color,index);
            Clicked = true;
        }

        else
        {
            double Xcor = e.getX();
            double Ycor = e.getY();

            setPreviousColor(getColor());
            setPreviousIndex(getIndex());
//            previousColor = color;
//            previousIndex = index;

            indexDetector(Xcor,Ycor);

            index = getIndex();
            color = getColor();

            System.out.println(index);
            System.out.println(color);
            System.out.println(previousIndex);
            System.out.println(previousColor);

            if(previousIndex != index)
            {
                if(previousColor == color)
                {
                    // TODO save it and prevent reuse
                }
                else
                {
                    clearCircle(index);
                    clearCircle(previousIndex);
                }
                Clicked= false;
            }



            //drawcircle with 2. index
            // if color 1 = color 2
            //continue without clearing
            //else clear 1 and 2

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
            setIndex(0);
            setColor(game[0][0]);
        }
        else if (X<200 && Y<100)
        {
            setIndex(1);
            setColor(game[0][1]);
        }
        else if (X<300 && Y<100)
        {
            setIndex(2);
            setColor(game[0][2]);
        }
        else if (X<400 && Y<100)
        {
            setIndex(3);
            setColor(game[0][3]);
        }
        //Line 2
        else if (X<100 && Y<200)
        {
            setIndex(4);
            setColor(game[1][0]);
        }
        else if (X<200 && Y<200)
        {
            setIndex(5);
            setColor(game[1][1]);
        }
        else if (X<300 && Y<200)
        {
            setIndex(6);
            setColor(game[1][2]);
        }
        else if (X<400 && Y<200)
        {
            setIndex(7);
            setColor(game[1][3]);
        }
        //Line 3
        else if (X<100 && Y<300)
        {
            setIndex(8);
            setColor(game[2][0]);
        }
        else if (X<200 && Y<300)
        {
            setIndex(9);
            setColor(game[2][1]);
        }
        else if (X<300 && Y<300)
        {
            setIndex(10);
            setColor(game[2][2]);
        }
        else if (X<400 && Y<300)
        {
            setIndex(11);
            setColor(game[2][3]);
        }
        //Line 4
        else if (X<100 && Y<400)
        {
            setIndex(12);
            setColor(game[3][0]);
        }
        else if (X<200 && Y<400)
        {
            setIndex(13);
            setColor(game[3][1]);
        }
        else if (X<300 && Y<400)
        {
            setIndex(14);
            setColor(game[3][2]);

        }
        else if (X<400 && Y<400)
        {
            setIndex(15);
            setColor(game[3][3]);

        }
    }

    public void colorEncoder()
    {

    }

    public void clearCircle(int index)
    {
        Graphics g2d = getGraphics();
        if(index ==0)
        {
            g2d.setColor(Color.WHITE);
            g2d.fillOval(0,0,100,100);
        }
        else if(index ==1)
        {
            g2d.setColor(Color.WHITE);
            g2d.fillOval(100,0,100,100);
        }
        else if(index ==2)
        {
            g2d.setColor(Color.WHITE);
            g2d.fillOval(200,0,100,100);
        }
        else if(index ==3)
        {
            g2d.setColor(Color.WHITE);
            g2d.fillOval(300,0,100,100);
        }
        else if(index ==4)
        {
            g2d.setColor(Color.WHITE);
            g2d.fillOval(0,100,100,100);
        }
        else if(index ==5)
        {
            g2d.setColor(Color.WHITE);
            g2d.fillOval(100,100,100,100);
        }
        else if(index ==6)
        {
            g2d.setColor(Color.WHITE);
            g2d.fillOval(200,100,100,100);
        }
        else if(index ==7)
        {
            g2d.setColor(Color.WHITE);
            g2d.fillOval(300,100,100,100);
        }
        else if(index ==8)
        {
            g2d.setColor(Color.WHITE);
            g2d.fillOval(0,200,100,100);
        }
        else if(index ==9)
        {
            g2d.setColor(Color.WHITE);
            g2d.fillOval(100,200,100,100);
        }
        else if(index ==10)
        {
            g2d.setColor(Color.WHITE);
            g2d.fillOval(200,200,100,100);
        }
        else if(index ==11)
        {
            g2d.setColor(Color.WHITE);
            g2d.fillOval(300,200,100,100);
        }
        else if(index ==12)
        {
            g2d.setColor(Color.WHITE);
            g2d.fillOval(0,300,100,100);
        }
        else if(index ==13)
        {
            g2d.setColor(Color.WHITE);
            g2d.fillOval(100,300,100,100);
        }
        else if(index ==14)
        {
            g2d.setColor(Color.WHITE);
            g2d.fillOval(200,300,100,100);
        }
        else if(index ==15)
        {
            g2d.setColor(Color.WHITE);
            g2d.fillOval(300,300,100,100);
        }
    }
    public  void drawCircle(Color color, int index)
    {
        Graphics g2d = getGraphics();

        if(index ==0)
        {
            g2d.setColor(Color.BLACK);
            g2d.fillOval(0,0,100,100);
            g2d.setColor(Color.WHITE);
            g2d.fillOval(15,15,70,70);
            g2d.setColor(color);
            g2d.fillOval(16,16,68,68);
        }
        else if(index ==1)
        {
            g2d.setColor(Color.BLACK);
            g2d.fillOval(100,0,100,100);
            g2d.setColor(Color.WHITE);
            g2d.fillOval(115,15,70,70);
            g2d.setColor(color);
            g2d.fillOval(116,16,68,68);
        }
        else if(index ==2)
        {
            g2d.setColor(Color.BLACK);
            g2d.fillOval(200,0,100,100);
            g2d.setColor(Color.WHITE);
            g2d.fillOval(215,15,70,70);
            g2d.setColor(color);
            g2d.fillOval(216,16,68,68);
        }
        else if(index ==3)
        {
            g2d.setColor(Color.BLACK);
            g2d.fillOval(300,0,100,100);
            g2d.setColor(Color.WHITE);
            g2d.fillOval(315,15,70,70);
            g2d.setColor(color);
            g2d.fillOval(316,16,68,68);
        }
        else if(index ==4)
        {
            g2d.setColor(Color.BLACK);
            g2d.fillOval(0,100,100,100);
            g2d.setColor(Color.WHITE);
            g2d.fillOval(15,115,70,70);
            g2d.setColor(color);
            g2d.fillOval(16,116,68,68);
        }
        else if(index ==5)
        {
            g2d.setColor(Color.BLACK);
            g2d.fillOval(100,100,100,100);
            g2d.setColor(Color.WHITE);
            g2d.fillOval(115,115,70,70);
            g2d.setColor(color);
            g2d.fillOval(116,116,68,68);
        }
        else if(index ==6)
        {
            g2d.setColor(Color.BLACK);
            g2d.fillOval(200,100,100,100);
            g2d.setColor(Color.WHITE);
            g2d.fillOval(215,115,70,70);
            g2d.setColor(color);
            g2d.fillOval(216,116,68,68);
        }
        else if(index ==7)
        {
            g2d.setColor(Color.BLACK);
            g2d.fillOval(300,100,100,100);
            g2d.setColor(Color.WHITE);
            g2d.fillOval(315,115,70,70);
            g2d.setColor(color);
            g2d.fillOval(316,116,68,68);
        }
        else if(index ==8)
        {
            g2d.setColor(Color.BLACK);
            g2d.fillOval(0,200,100,100);
            g2d.setColor(Color.WHITE);
            g2d.fillOval(15,215,70,70);
            g2d.setColor(color);
            g2d.fillOval(16,216,68,68);
        }
        else if(index ==9)
        {
            g2d.setColor(Color.BLACK);
            g2d.fillOval(100,200,100,100);
            g2d.setColor(Color.WHITE);
            g2d.fillOval(115,215,70,70);
            g2d.setColor(color);
            g2d.fillOval(116,216,68,68);
        }
        else if(index ==10)
        {
            g2d.setColor(Color.BLACK);
            g2d.fillOval(200,200,100,100);
            g2d.setColor(Color.WHITE);
            g2d.fillOval(215,215,70,70);
            g2d.setColor(color);
            g2d.fillOval(216,216,68,68);
        }
        else if(index ==11)
        {
            g2d.setColor(Color.BLACK);
            g2d.fillOval(300,200,100,100);
            g2d.setColor(Color.WHITE);
            g2d.fillOval(315,215,70,70);
            g2d.setColor(color);
            g2d.fillOval(316,216,68,68);
        }
        else if(index ==12)
        {
            g2d.setColor(Color.BLACK);
            g2d.fillOval(0,300,100,100);
            g2d.setColor(Color.WHITE);
            g2d.fillOval(15,315,70,70);
            g2d.setColor(color);
            g2d.fillOval(16,316,68,68);
        }
        else if(index ==13)
        {
            g2d.setColor(Color.BLACK);
            g2d.fillOval(100,300,100,100);
            g2d.setColor(Color.WHITE);
            g2d.fillOval(115,315,70,70);
            g2d.setColor(color);
            g2d.fillOval(116,316,68,68);
        }
        else if(index ==14)
        {
            g2d.setColor(Color.BLACK);
            g2d.fillOval(200,300,100,100);
            g2d.setColor(Color.WHITE);
            g2d.fillOval(215,315,70,70);
            g2d.setColor(color);
            g2d.fillOval(216,316,68,68);
        }
        else if(index ==15)
        {
            g2d.setColor(Color.BLACK);
            g2d.fillOval(300,300,100,100);
            g2d.setColor(Color.WHITE);
            g2d.fillOval(315,315,70,70);
            g2d.setColor(color);
            g2d.fillOval(316,316,68,68);
        }
    }

}
