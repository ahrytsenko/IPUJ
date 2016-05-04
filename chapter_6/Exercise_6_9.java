/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.JFrame.*;

/**
 *
 * @author ahryts1
 */
public class Exercise_6_9 extends JPanel implements MouseListener {

    private final Color BG_COLOR = Color.WHITE;
    private final Color FG_COLOR = Color.RED;
    private final Color BR_COLOR = Color.BLACK;
    private final int MAX_POINTS = 100;
    private int[] pointsX = new int[MAX_POINTS];
    private int[] pointsY = new int[MAX_POINTS];
    private int points;


    public static void main (String[] args) {
        
        JFrame wnd = new JFrame("Polygon - Exercise 6.9");
        wnd.setDefaultCloseOperation(EXIT_ON_CLOSE);
        wnd.setLocation(200, 200);
        wnd.setSize(300, 300);
        
        JPanel content = new Exercise_6_9();
        wnd.setContentPane(content);
        
        wnd.setResizable(false);
        wnd.setVisible(true);
    }
    
    public Exercise_6_9() {
        setBackground(BG_COLOR);
        points = 0;
        addMouseListener(this);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        if (points < 2) return;
       
        if (points < 3) {
            g.setColor(BR_COLOR);
            g.drawLine(pointsX[0], pointsY[0], pointsX[1], pointsY[1]);
        } else {
            g.setColor(FG_COLOR);
            g.fillPolygon(pointsX, pointsY, points);
            g.setColor(BR_COLOR);
            g.drawPolygon(pointsX, pointsY, points);
        }
    }
    
    @Override
    public void mousePressed(MouseEvent e) { 
        if (points < MAX_POINTS) {
            pointsX[points] = e.getX();
            pointsY[points++] = e.getY();
            repaint();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) { }

    @Override
    public void mouseReleased(MouseEvent e) { }

    @Override
    public void mouseEntered(MouseEvent e) { }

    @Override
    public void mouseExited(MouseEvent e) { }
    
}
