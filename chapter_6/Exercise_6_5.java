public class Exercise_6_5 extends JPanel implements MouseListener {

    private final int ROWS = 8;
    private final int COLS = 8;
    private int selectedSquare = -1;

    public Exercise_6_5() {
        super();
        addMouseListener(this);
    }

    public paintComponent(Graphics g) {
        int w = getWidth()/COLS;
        int h = getHeight()/ROWS;

        super.paintComponent(g);
        
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                if ((i + j) % 2 == 0) 
                    g.setColor(Color.RED);
                else
                    g.setColor(Color.BLACK);
                g.fillRect(w*j, h*i, w, h);
            }
        }
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
