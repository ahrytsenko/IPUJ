import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author ahrytsenko
 */
public class Exercise_6_4 {

    public static void main(String[] args) {
        JFrame wnd = new JFrame("Exercise 6.4");
        wnd.setContentPane(new DicePanelWithButton());
        wnd.pack();
        wnd.setResizable(false);
        wnd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        wnd.setLocation(200, 200);
        wnd.setVisible(true);
    }
       
}
