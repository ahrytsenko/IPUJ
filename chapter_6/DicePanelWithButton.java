
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
public class DicePanelWithButton extends JPanel {
    
    private Die[] dice = new Die[2];
    private Timer timer;

    public DicePanelWithButton() {
        super();

        setLayout(new BorderLayout(10, 10));
        dice[0] = new Die(Color.WHITE, Color.BLACK, new Point(10, 10), new Dimension(35, 35));
        dice[1] = new Die(Color.WHITE, Color.BLACK, new Point(55, 55), new Dimension(35, 35));

        JPanel dicePanel = new JPanel() {
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                dice[0].draw(g);
                dice[1].draw(g);
            }
        };
        dicePanel.setPreferredSize(new Dimension(100, 100));
        add(dicePanel, BorderLayout.CENTER);

        JButton btnRoll = new JButton("Roll!");
        btnRoll.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { roll(); }
        });
        add(btnRoll, BorderLayout.SOUTH);
    }
    
    public void roll() {
        if (timer != null) return;
        
        timer = new Timer(20, new ActionListener() {
            int frame = 1;
            @Override
            public void actionPerformed(ActionEvent e) {
                frame++;
                dice[0].roll();
                dice[1].roll();
                repaint();
                if (frame == 20) {
                    timer.stop();
                    timer = null;
                }
            }
        });
        timer.start();
    }
}
