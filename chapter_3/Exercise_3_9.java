/*
 * This project is a study purpose project.
 * Everyone can use the project at his/her own reason.
 * The project has got no warranties.
 */

/*
Exercise 3.9:
Often, some element of an animation repeats over and over, every so many frames. 
Sometimes, the repetition is "cyclic," meaning that at the end it jumps back to the start. 
Sometimes the repetition is "oscillating," like a back-and-forth motion 
where the second half is the same as the first half played in reverse.

Write an animation that demonstrates both cyclic and oscillating motions at various speeds. 
For cyclic motion, you can use a square that moves across the drawing area, 
then jumps back to the start, and then repeats the same motion over and over. 
For oscillating motion, you can do something similar, 
but the square should move back and forth between the two edges of the drawing area; 
that is, it moves left-to-right during the first half of the animation 
and then backwards from right-to-left during the second half. 
To write the program, you can start with a copy of the sample program SimpleAnimationStarter.java, 
as in the previous exercise.

A cyclic motion has to repeat every N frames for some value of N. 
What you draw in some frame of the animation depends on the frameNumber. 
The frameNumber just keeps increasing forever. 
To implement cyclic motion, what you really want is a "cyclic frame number" 
that takes on the values 0, 1, 2, ..., (N-1), 0, 1, 2, ..., (N-1), 0, 1, 2, .... 
You can derive the value that you need from frameNumber simply by saying

cyclicFrameNumber = frameNumber % N;
Then, you just have to base what you draw on cyclicFrameNumber instead of on frameNumber. 
Similarly, for an oscillating animation, you need an "oscillation frame number" 
that takes on the values 0, 1, 2, ... (N-1), N, (N-1), (N-2), ... 2, 1, 0, 1, 2, 
and so on, repeating the back and forth motion forever. 
You can compute the value that you need with

oscilationFrameNumber = frameNumber % (2*N);
if (oscillationFrameNumber > N)
   oscillationFrameNumber = (2*N) - oscillationFrameNumber;
Here is a screen shot from my version of the program. 
I use six squares. The top three do cyclic motion at various speeds, 
while the bottom three do oscillating motion. 
I drew black lines across the drawing area to separate the squares 
and to give them "channels" to move in.
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author ahrytsenko
 */
public class Exercise_3_9 extends JPanel implements ActionListener {

    public static final int _WIDTH_ = 600;
    public static final int _HEIGHT_ = 300;
    public static final String _TITLE_ = "Exercise_3_9";
    
    public static final int framesPerSecond = 50;
    public static final int stripesCount = 6;
    public static final Color[] stripesColor = {
        Color.RED, Color.GREEN, Color.BLUE,
        Color.CYAN, Color.MAGENTA, Color.YELLOW};
    public static int[][] stripesParams = {{15, 2, 0}, {15, 2, 0}, {15, 6, 0}, {15, 6, 0}, {15, 15, 0}, {15, 15, 0}};
    public static int stripesSpeed = 15;

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
        
        int y = 0;
        int x = 0;
        int h = height / stripesCount;
        
        // Draw empty field and lanes
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, width, height);
        g.setColor(Color.BLACK);
        g.drawRect(0, 0, width, height);
        for (int i = 0; i < stripesCount; i++) {
            g.drawLine(x, y, x+width, y);
            y += h;
        }
        
        // Draw stripes
        y = 0;
        for (int i = 0; i < stripes.Count; i++) {
            g.setColor(stripesColor[i]);
            g.fillRect(stripesParams[i][2], y, stripesParams[i][0], h);
            y += h;
            if (frameNumber % stripesParams[i][1] == 0) {
                stripesParams[i][2] = (stripesParams[i][2] + stripesSpeed) % width;
            }
        }
        
    }
    
    //------ Implementation details: DO NOT EXPECT TO UNDERSTAND THIS ------
    
    
    public static void main(String[] args) {
        
        /* NOTE:  The string in the following statement goes in the title bar
         * of the window.
         */
        JFrame window = new JFrame(_TITLE_);
        
        /*
         * NOTE: If you change the name of this class, you must change
         * the name of the class in the next line to match!
         */
        Exercise_3_9 drawingArea = new Exercise_3_9();
        
        drawingArea.setBackground(Color.WHITE);
        window.setContentPane(drawingArea);

        /* NOTE:  In the next line, the numbers 600 and 450 give the
         * initial width and height of the drawing array.  You can change
         * these numbers to get a different size.
         */
        drawingArea.setPreferredSize(new Dimension(_WIDTH_, _HEIGHT_));

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
