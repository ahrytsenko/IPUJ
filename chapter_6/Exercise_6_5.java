public class Exercise_6_5 extends JPanel implements MouseListener {

    public Exercise_6_5() {
        super();
        addMouseListener(this);
    }

    public paintComponent(Graphics g) {
        super.paintComponent(g);
    }

    public void mousePressed(MouseAction e) { }
    public void mouseReleased(MouseAction e) { }
    public void mouseClicked(MouseAction e) { }
    public void mouseEntered(MouseAction e) { }
    public void mouseExited(MouseAction e) { }

    public static void main(String[] args) {
        JFrame wnd = new JFrame();
        wnd.setLocation(100, 100);
        wnd.setSize(320, 320);
        wnd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        wnd.setVisible(true);
    }

}
