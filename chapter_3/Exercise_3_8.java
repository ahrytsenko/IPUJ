/*
 * This project is a study purpose project.
 * Everyone can use the project at his/her own reason.
 * The project has got no warranties.
 */

/*
Exercise 3.8:
Write a GUI program that draws a checkerboard. Base your solution on the sample 
program SimpleAnimationStarter.java, even though you are creating only a static 
picture rather than an animation. You will draw the checkerboard in 
the drawFrame() subroutine. You should read the comments in the file to discover 
other changes that you might need to make.

Assume that the size of the drawing area is 400-by-400 pixels. A checkerboard 
contains 8 rows and 8 columns of squares. If the size of the drawing area is 400, 
that means that each square can be 50-by-50 pixels. The squares are red and black 
(or whatever other colors you choose). Here is a tricky way to determine 
whether a given square should be red or black: The rows and columns can be thought 
of as numbered from 0 to 7. If the row number of the square and the column number 
of the square are either both even or both odd, then the square is red. 
Otherwise, it is black. Note that a square is just a rectangle 
in which the height is equal to the width, 
so you can use the subroutine g.fillRect() to draw the squares
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author ahrytsenko
 */
public class Exercise_3_8 extends JPanel implements ActionListener {

    /**
     * Draws one frame of an animation. This subroutine is called re
     * second and is responsible for redrawing the entire drawing area.  The
     * parameter g is used for drawing. The frameNumber starts at zero and
     * increases by 1 each time this subroutine is called.  The parameters width
     * and height give the size of the drawing area, in pixels.  
     * The sizes and positions of the rectangles that are drawn depend
     * on the frame number, giving the illusion of motion.
     */
    public void drawFrame(Graphics g, int frameNumber, int width, int height) {
        
        int x, y = 0;
        int w = width/8, h = height/8;
        
        for (int i = 0; i < 8; i++) {
            x = 0;
            for (int j = 0; j < 8; j++) {
                if (((i % 2) + (j % 2)) % 2 == 0) {
                    g.setColor(Color.RED);
                }
                else {
                    g.setColor(Color.BLACK);
                }
                g.fillRect(x, y, w, h);
                x += w;
            }
            y += h;
        }
    }
    
    //------ Implementation details: DO NOT EXPECT TO UNDERSTAND THIS ------
    
    
    public static void main(String[] args) {
        
        /* NOTE:  The string in the following statement goes in the title bar
         * of the window.
         */
        JFrame window = new JFrame("Exercise_3_8");
        
        /*
         * NOTE: If you change the name of this class, you must change
         * the name of the class in the next line to match!
         */
        Exercise_3_8 drawingArea = new Exercise_3_8();
        
        drawingArea.setBackground(Color.WHITE);
        window.setContentPane(drawingArea);

        /* NOTE:  In the next line, the numbers 600 and 450 give the
         * initial width and height of the drawing array.  You can change
         * these numbers to get a different size.
         */
        drawingArea.setPreferredSize(new Dimension(400,400));

        window.pack();
        window.setLocation(100,50);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        /*
         * Note:  In the following line, you can change true to
         * false.  This will prevent the user from resizing the window,
         * so you can be sure that the size of the drawing area will
         * not change.  It can be easier to draw the frames if you know
         * the size.
         */
        window.setResizable(false);
        
        /* NOTE:  In the next line, the number 20 gives the time between
         * calls to drawFrame().  The time is given in milliseconds, where
         * one second equals 1000 milliseconds.  You can increase this number
         * to get a slower animation.  You can decrease it somewhat to get a
         * faster animation, but the speed is limited by the time it takes
         * for the computer to draw each frame. 
         */
        Timer frameTimer = new Timer(20, drawingArea);

        window.setVisible(true);
        frameTimer.start();

    } // end main

    private int frameNum;
    
    @Override
    public void actionPerformed(ActionEvent evt) {
        frameNum++;
        repaint();
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawFrame(g, frameNum, getWidth(), getHeight());
    }
    
}
