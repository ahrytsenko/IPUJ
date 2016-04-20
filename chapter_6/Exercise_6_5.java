public class Exercise_6_5 extends JPanel implements MouseListener {

    private selX, selY;

    public Exercise_6_5() {
        super();
        addMouseListener(this);
    }

    public paintComponent(Graphics g) {
        int rows = 8, cols = 8;
        int w = getWidth()/cols;
        int h = getHeight()/rows;
        Graphics2D g2 = (Graphics2D)g;

        super.paintComponent(g);
        
        g2.setStroke( new BasicStroke(1) );
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if ((i + j) % 2 == 0) 
                    g.setColor(Color.RED);
                else
                    g.setColor(Color.BLACK);
                g.fillRect(w*j, h*i, w, h);
            }
        }
        g2.setStroke( new BasicStroke(3) );
        g2.setStroke( new BasicStroke(1) );
    }



    public void mousePressed(MouseAction e) { }
    public void mouseReleased(MouseAction e) { }
    public void mouseClicked(MouseAction e) { }
    public void mouseEntered(MouseAction e) { }
    public void mouseExited(MouseAction e) { }

    public static void main(String[] args) {
        JFrame wnd = new JFrame("Exercise_6_5");
        wnd.setLocation(100, 100);
        wnd.setSize(320, 320);
        wnd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        wnd.setContentPane(new Exercise_6_5());
        wnd.setVisible(true);
    }

}
