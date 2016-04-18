
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
public class Exercise_6_3 extends JPanel implements MouseListener, MouseMotionListener {

    private final Die[] dice = new Die[2];

    public static void main(String[] args) {
        JFrame wnd = new JFrame("Exercise 6.3");
        Exercise_6_3 content = new Exercise_6_3();
        wnd.setContentPane(content);
        wnd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        wnd.setLocation(200, 200);
        wnd.setSize(100, 100);
        wnd.setVisible(true);
    }
    
    public Exercise_6_3() {
        super();
        addMouseListener(this);
        addMouseMotionListener(this);
        dice[0] = new Die(Color.WHITE, Color.BLACK, new Point(10, 10), new Dimension(35, 35));
        dice[1] = new Die(Color.WHITE, Color.BLACK, new Point(55, 55), new Dimension(35, 35));
    }
    
    private void drawDice(Graphics g) {
        dice[0].draw(g, (int)(Math.random()*6 + 1));
        dice[1].draw(g, (int)(Math.random()*6 + 1));
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawDice(g);
    }
    
    @Override
    public void mouseClicked(MouseEvent e) { repaint(); }

    @Override
    public void mousePressed(MouseEvent e) { }

    @Override
    public void mouseReleased(MouseEvent e) { }

    @Override
    public void mouseEntered(MouseEvent e) { }

    @Override
    public void mouseExited(MouseEvent e) { }

    @Override
    public void mouseDragged(MouseEvent e) { }

    @Override
    public void mouseMoved(MouseEvent e) { }
    
    private class Die {
        
        private final Color colorBG;
        private final Color colorFG;
        private final Point pos;
        private final Dimension size;
        
        public Square(Color cBG, Color cFG, Point pos, Dimension size) {
            colorBG = cBG;
            colorFG = cFG;
            this.pos = pos;
            this.size = size;
        }
        
        public void draw(Graphics g, int val) {
            g.setColor(color);
            g.fillRect(pos.x, pos.y, size.width, size.height);
            g.setColor(Color.BLACK);
            g.drawRect(pos.x, pos.y, size.width, size.height);
        }

    }
    
}
