import javax.swing.*;

public class DrawingPanel {

    public static void main(String[] args) {
        int w=400;
        int h=400;

        JFrame f = new JFrame();
        DrawingCanvas dc = new DrawingCanvas(h,w);
        f.setSize(w,h);
        f.setTitle("Memory Game");
        f.add(dc);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
