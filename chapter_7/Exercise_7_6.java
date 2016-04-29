/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;

/**
 *
 * @author ahryts1
 */
public class Exercise_7_6 extends JPanel {

    private ArrayList<ArtData> artDataList = new ArrayList<>();

    public Exercise_7_6() {
        RepaintAction action = new RepaintAction();
        Timer timer = new Timer(1000, action);
        timer.start();
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        Color randomGray = Color.getHSBColor( 1.0F, 0.0F, (float)Math.random() );
        g.setColor(randomGray);
        g.fillRect( 0, 0, getWidth(), getHeight() );
        
        for (ArtData item : artDataList)
            item.draw(g);
    }
    
    private int generateRandom(int max) { return (int)(Math.random()*max)+1; }
    
    private Color generateRandomColor() {
        return new Color(generateRandom(255), generateRandom(255), generateRandom(255));
    }
    
    private class RepaintAction implements ActionListener {
        public void actionPerformed(ActionEvent evt) {

            artDataList.clear();
            
            int artType = (int)(3*Math.random());

            switch (artType) {
            case 0:
                for (int i = 0; i < 500; i++) {
                    int x1 = (int)(getWidth() * Math.random());
                    int y1 = (int)(getHeight() * Math.random());
                    int x2 = (int)(getWidth() * Math.random());
                    int y2 = (int)(getHeight() * Math.random());
                    artDataList.add(new ArtDataLine(generateRandomColor(), new Point(x1, y1), new Dimension(x2, y2)));
                }
                break;
            case 1:
                for (int i = 0; i < 200; i++) {
                    int centerX =  (int)(getWidth() * Math.random());
                    int centerY = (int)(getHeight() * Math.random());
                    artDataList.add(new ArtDataOval(generateRandomColor(), new Point(centerX, centerY), new Dimension(100, 100)));
                }
                break;
            case 2:
                for (int i = 0; i < 25; i++) {
                    int centerX =  (int)(getWidth() * Math.random());
                    int centerY = (int)(getHeight() * Math.random());
                    int size = 30 + (int)(170*Math.random());
                    artDataList.add(new ArtDataRect(generateRandomColor(), new Point(centerX, centerY), new Dimension(size, size)));
                }
                break;
            }
            repaint();
        }
        
    }

    private abstract class ArtData {
        
        protected Color color;
        protected Point pos;
        protected Dimension size;
        
        public ArtData(Color color, Point pos, Dimension size) {
            this.color = color;
            this.pos = pos;
            this.size = size;
        }
        
        public abstract void draw(Graphics g);
        
    }
    
    private class ArtDataOval extends ArtData {

        public ArtDataOval(Color color, Point pos, Dimension size) {
            super(color, pos, size);
        }
        
        public void draw(Graphics g) {
            g.setColor(color);
            g.drawOval(pos.x-size.width/2, pos.y-size.height/2, size.width, size.height);
        }
        
    }
            
    private class ArtDataLine extends ArtData {

        public ArtDataLine(Color color, Point pos, Dimension size) {
            super(color, pos, size);
        }
        
        public void draw(Graphics g) {
            g.setColor(color);
            g.drawLine(pos.x, pos.y, size.width, size.height);
        }
        
    }
            
    private class ArtDataRect extends ArtData {

        public ArtDataRect(Color color, Point pos, Dimension size) {
            super(color, pos, size);
        }
        
        public void draw(Graphics g) {
            g.setColor(color);
            g.drawRect(pos.x, pos.y, size.width, size.height);
        }
        
    }
            
    public static void main(String[] args) {
        JFrame wnd = new JFrame("Exercise 7.6");
        wnd.setContentPane(new Exercise_7_6());
        wnd.setSize(400, 400);
        wnd.setLocation(100, 100);
        wnd.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        wnd.setVisible(true);
    }

}
