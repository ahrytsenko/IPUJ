
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;

/*
 * This project is a study purpose project.
 * Everyone can use the project at his/her own reason.
 * The project has got no warranties.
 */

/**
 *
 * @author ahrytsenko
 */
public class Die {

    private final Color colorBG;
    private final Color colorFG;
    private final Point pos;
    private final Dimension size;
    private int val;

    public Die(Color cBG, Color cFG, Point pos, Dimension size) {
        colorBG = cBG;
        colorFG = cFG;
        this.pos = pos;
        this.size = size;
        roll();
    }

    public void roll() {
        val = (int)(Math.random()*6 + 1);
    }

    public void draw(Graphics g) {
        int w = size.width/8;
        int h = size.height/8;

        g.setColor(colorBG);
        g.fillRect(pos.x, pos.y, size.width, size.height);
        g.setColor(colorFG);
        g.drawRect(pos.x, pos.y, size.width, size.height);
        if (val > 1) {
            g.fillOval(pos.x+size.width/4, pos.y+size.height/4, w, h);
            g.fillOval(pos.x+size.width/4*3, pos.y+size.height/4*3, w, h);
        }
        if (val > 3) {
            g.fillOval(pos.x+size.width/4*3, pos.y+size.height/4, w, h);
            g.fillOval(pos.x+size.width/4, pos.y+size.height/4*3, w, h);
            g.fillOval(pos.x+size.width/4*3, pos.y+size.height/4*3, w, h);
        }
        if (val == 6) {
            g.fillOval(pos.x+size.width/4, pos.y+size.height/2, w, h);
            g.fillOval(pos.x+size.width/4*3, pos.y+size.height/2, w, h);
        }
        if (val % 2 == 1) {
            g.fillOval(pos.x+size.width/2, pos.y+size.height/2, w, h);
        }
    }

}
