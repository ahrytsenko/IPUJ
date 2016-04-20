
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*
 * This project is a study purpose project.
 * Everyone can use the project at his/her own reason.
 * The project has got no warranties.
 */

/**
 *
 * @author ahrytsenko
 */
public class Exercise_6_5 extends JPanel implements MouseListener {

    private final int ROWS = 8;
    private final int COLS = 8;
    private int selectedSquare = -1;

    public Exercise_6_5() {
        super();
        addMouseListener(this);
    }

    public void paintComponent(Graphics g) {
        int w = getWidth()/COLS;
        int h = getHeight()/ROWS;

        super.paintComponent(g);
        
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                if ((i + j) % 2 == 0) 
                    g.setColor(Color.RED);
                else
                    g.setColor(Color.BLACK);
                g.fillRect(w*j, h*i, w, h);
            }
        }
    }

    public static void main(String[] args) {
        JFrame wnd = new JFrame("Exercise_6_5");
        wnd.setLocation(100, 100);
        wnd.setSize(320, 320);
        wnd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        wnd.setContentPane(new Exercise_6_5());
        wnd.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
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

}
