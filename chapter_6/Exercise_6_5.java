
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
public class Exercise_6_5 extends JPanel implements MouseListener, MouseMotionListener {

    private final int ROWS = 8;
    private final int COLS = 8;
    private int selectedSquare = 23;

    public static void main(String[] args) {
        JFrame wnd = new JFrame("Exercise_6_5");
        wnd.setLocation(100, 100);
        wnd.setSize(320, 340);
        wnd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        wnd.setContentPane(new Exercise_6_5());
        wnd.setVisible(true);
    }

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
        
        if (selectedSquare != -1) {
            g.setColor(Color.CYAN);
            g.drawRect((selectedSquare % COLS)*w, (selectedSquare / ROWS)*h, w, h);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        int cel = e.getY() / (getHeight()/ROWS)*COLS + e.getX() / (getHeight()/COLS);
        if (selectedSquare == cel) 
            selectedSquare = -1;
        else
            selectedSquare = cel;
        repaint();
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

    @Override
    public void mouseDragged(MouseEvent e) {
        
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        
    }

}
