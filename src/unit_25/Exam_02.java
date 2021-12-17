package unit_25;

import javax.swing.*;
import java.awt.*;

class Exam_02_sub extends JFrame {

    private final BorderLayout bl = new BorderLayout();
    private final JLayeredPane jlp = new JLayeredPane();
    private final JPanel jp = new JPanel();
    private final JPanel jp1 = new JPanel();
    private final JPanel jp2 = new JPanel();
    //private ImageIcon ii = new ImageIcon("aaa.gif");
    //private JLabel lb = new JLabel(ii);
    private final JButton bt = new JButton("1");
    private final JButton bt1 = new JButton("2");
    private final JButton bt2 = new JButton("3");

    public Exam_02_sub(){
        super("Test");
        this.init();
        this.start();
        this.setSize(500, 500);
        this.setVisible(true);
    }

    public void init() {
        JRootPane jrp = this.getRootPane();

        Container container = jrp.getContentPane();
        container.setLayout(bl);

        jp.add(bt);
        jp.add(bt1);
        jp.add(bt2);

        jp.setBackground(Color.red);
        jp1.setBackground(Color.green);
        jp2.setBackground(Color.blue);
        
        jp.setBounds(50,50,100,100);
        jp1.setBounds(75,75,100,100);
        jp2.setBounds(100,100,100,100);
        //lb.setBounds(45,45,50,50);

        jlp.add(jp, new Integer(0));
        jlp.add(jp1, new Integer(1));
        jlp.add(jp2, new Integer(2));
        //jlp.add(lb, new Integer(0));

        container.add("Center", jlp);

    }

    public void start() {

    }

    public void paint(Graphics g){
        Graphics2D g2D = (Graphics2D)g;
    }
}

public class Exam_02 {

    public static void main(String[] args) {
        Exam_02_sub ess = new Exam_02_sub();
    }
}
