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
public class Exercise_6_9 extends JPanel implements MouseListener, MouseMotionListener {

    private final Color BG_COLOR = Color.WHITE;
    private final Color FG_COLOR = Color.RED;
    private final Color BR_COLOR = Color.BLACK;
    private final int MAX_POINTS = 100;
    private int[] pointsX = new int[MAX_POINTS];
    private int[] pointsY = new int[MAX_POINTS];
    private int points, lastX, lastY;
    private boolean nearStart;


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
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        switch (points) {
            case 0: {
                g.setColor(BR_COLOR);
                g.fillRect(lastX, lastY, 2, 2);
                break;
            }
            case 1: {
                g.setColor(BR_COLOR);
                g.drawLine(pointsX[0], pointsY[0], lastX, lastY);
                break;
            }
            case 2: {
                g.setColor(BR_COLOR);
                g.drawLine(pointsX[0], pointsY[0], pointsX[1], pointsY[1]);
                g.drawLine(pointsX[1], pointsY[1], lastX, lastY);
                break;
            }
            default: {
                g.setColor(FG_COLOR);
                g.fillPolygon(pointsX, pointsY, points);
                g.setColor(BR_COLOR);
                g.drawPolygon(pointsX, pointsY, points);
                g.setColor(BR_COLOR);
                g.drawLine(pointsX[points-1], pointsY[points-1], lastX, lastY);
            }
        }
        if (nearStart) {
            g.setColor(Color.BLUE);
            g.drawOval(lastX-3, lastY-3, 6, 6);
        }
    }
    
    @Override
    public void mousePressed(MouseEvent e) { 
        updateCoords(e);
    }

    @Override
    public void mouseClicked(MouseEvent e) { }

    @Override
    public void mouseReleased(MouseEvent e) { 
        if (points < MAX_POINTS) {
            pointsX[points] = lastX;
            pointsY[points++] = lastY;
            repaint();
            nearStart = false;
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) { }

    @Override
    public void mouseExited(MouseEvent e) { }

    @Override
    public void mouseDragged(MouseEvent e) { 
        updateCoords(e);
    }

    private void updateCoords(MouseEvent e) {
        lastX = e.getX();
        lastY = e.getY();
        nearStart = (getDistance() < 2);
        repaint();
    }
    
    private double getDistance() {
        if (points == 0) return Double.POSITIVE_INFINITY;
        return Math.sqrt(Math.pow(pointsX[0]-lastX, 2) + Math.pow(pointsY[0]-lastY, 2));
    }
    
    @Override
    public void mouseMoved(MouseEvent e) { }
    
}
