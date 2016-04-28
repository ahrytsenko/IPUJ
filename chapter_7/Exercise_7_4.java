/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

/**
 *
 * @author ahryts1
 */
public class Exercise_7_4 extends JPanel implements MouseListener {
    
    private final ArrayList<MyShape> shapeArray = new ArrayList<>();
    
    public static void main(String[] args) {
        JFrame window = new JFrame("Exercise_7_4");
        Exercise_7_4 content = new Exercise_7_4();
        window.setContentPane(content);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocation(120,70);
        window.setSize(400,300);
        window.setVisible(true);
    }

    // ----------------------------------------------------------------------

    /**
     * This constructor simply sets the background color of the panel to be black
     * and sets the panel to listen for mouse events on itself.
     */
    public Exercise_7_4() {
        setBackground(Color.BLACK);
        addMouseListener(this);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (MyShape item : shapeArray) 
            item.draw(g);
    }

    /**
     *  Since this panel has been set to listen for mouse events on itself, 
     *  this method will be called when the user clicks the mouse on the panel.
     *  This method is part of the MouseListener interface.
     */
    public void mousePressed(MouseEvent evt) {

        if ( evt.isShiftDown() ) {
                // The user was holding down the Shift key.  Just repaint the panel.
                // Since this class does not define a paintComponent() method, the 
                // method from the superclass, JPanel, is called.  That method simply
                // fills the panel with its background color, which is black.  The 
                // effect is to clear the panel.
            shapeArray.clear();
            repaint();
            return;
        }

        if ( evt.isMetaDown() ) {
                // User right-clicked at the point (x,y). Draw a blue oval centered 
                // at the point (x,y). (A black outline around the oval will make it 
                // more distinct when shapes overlap.)
            shapeArray.add(new MyOval(Color.BLUE, new Point(evt.getX(), evt.getY()), new Dimension(60, 30)));
        }
        else {
                // User left-clicked (or middle-clicked) at (x,y). 
                // Draw a red rectangle centered at (x,y).
            shapeArray.add(new MyRectangle(Color.RED, new Point(evt.getX(), evt.getY()), new Dimension(60, 30)));
        }
        
        repaint();

    } // end mousePressed();


    // The next four empty routines are required by the MouseListener interface.
    // They don't do anything in this class, so their definitions are empty.

    public void mouseEntered(MouseEvent evt) { }
    public void mouseExited(MouseEvent evt) { }
    public void mouseClicked(MouseEvent evt) { }
    public void mouseReleased(MouseEvent evt) { }


    private abstract class MyShape {
        
        protected Color color;
        protected Point pos;
        protected Dimension size;
        
        public MyShape(Color color, Point pos, Dimension size) { 
            this.color = color; 
            this.pos = pos;
            this.size = size;
        }
        
        public abstract void draw(Graphics g);
        
    }
    
    private class MyRectangle extends MyShape {
        
        public MyRectangle(Color color, Point pos, Dimension size) { 
            super(color, pos, size); 
        }
        
        public void draw(Graphics g) {
            g.setColor(color);
            g.fillRect(pos.x, pos.y, size.width, size.height);
        }
    }
        
    private class MyOval extends MyShape {
        
        public MyOval(Color color, Point pos, Dimension size) { 
            super(color, pos, size); 
        }
        
        public void draw(Graphics g) {
            g.setColor(color);
            g.fillOval(pos.x-size.width/2, pos.y-size.height/2, size.width, size.height);
        }
        
    }
    
}
