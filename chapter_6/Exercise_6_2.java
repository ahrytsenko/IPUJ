
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
public class Exercise_6_2 extends JPanel implements MouseListener, MouseMotionListener {

    private final Square redSquare;
    private final Square blueSquare;
    private Square selectedSquare = null;
    private int x=0, y=0;
    
    public static void main(String[] args) {
        JFrame wnd = new JFrame("Exercise 6.2");
        Exercise_6_2 content = new Exercise_6_2();
        wnd.setContentPane(content);
        wnd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        wnd.setLocation(200, 200);
        wnd.setSize(640, 480);
        wnd.setVisible(true);
    }
    
    public Exercise_6_2() {
        super();
        addMouseListener(this);
        addMouseMotionListener(this);
        redSquare = new Square(Color.RED, new Point(20, 20), new Dimension(50, 50));
        blueSquare = new Square(Color.BLUE, new Point(120, 120), new Dimension(50, 50));
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        redSquare.draw(g);
        blueSquare.draw(g);
    }
    
    @Override
    public void mouseClicked(MouseEvent e) { }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("mousePressed");
        if (redSquare.isSelected(e.getX(), e.getY())) {
            selectedSquare = redSquare;
        }
        else if (blueSquare.isSelected(e.getX(), e.getY())) {
            selectedSquare = blueSquare;
        }
        else selectedSquare = null;
        x = e.getX();
        y = e.getY();
    }

    @Override
    public void mouseReleased(MouseEvent e) { }

    @Override
    public void mouseEntered(MouseEvent e) { }

    @Override
    public void mouseExited(MouseEvent e) { }

    @Override
    public void mouseDragged(MouseEvent e) {
        if (selectedSquare != null) {
            selectedSquare.changeX(e.getX()-x);
            x = e.getX();
            selectedSquare.changeY(e.getY()-y);
            y = e.getY();
            repaint();
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) { }
    
    private class Square {
        
        private final Color color;
        private final Point pos;
        private final Dimension size;
        
        public Square(Color c, Point pos, Dimension size) {
            color = c;
            this.pos = pos;
            this.size = size;
        }
        
        public void changeX(int deltaX) { this.pos.x += deltaX; }
        public void changeY(int deltaY) { this.pos.y += deltaY; }
        
        public void draw(Graphics g) {
            g.setColor(color);
            g.fillRect(pos.x, pos.y, size.width, size.height);
            g.setColor(Color.BLACK);
            g.drawRect(pos.x, pos.y, size.width, size.height);
        }
        
        public boolean isSelected(int x, int y) {
            return (x>=pos.x && x<(pos.x+size.width) &&
                    y>=pos.y && y<(pos.y+size.height));
        }
        
    }
    
}
