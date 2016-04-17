

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * This project is a study purpose project.
 * Everyone can use the project at his/her own reason.
 * The project has got no warranties.
 */

/**
 *
 * @author ahrytsenko
 */
public class Exercise_6_1 extends SimpleStamper implements MouseMotionListener {
    
    public static void main(String[] args) {
        JFrame window = new JFrame("Exercise_6_1");
        Exercise_6_1 content = new Exercise_6_1(Color.WHITE);
        window.setContentPane(content);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocation(120,70);
        window.setSize(640,480);
        window.setVisible(true);
    }
    
    public Exercise_6_1() { 
        super(); 
        addMouseMotionListener(this);
        //addMouseListener(this);
    }
    
    public Exercise_6_1(Color c) {
        this();
        setBackground(c);
    }
    
    public void mouseDragged(MouseEvent evt) {
        super.mousePressed(evt);
    }
    
    public void mouseMoved(MouseEvent evt) {  }
    
}
