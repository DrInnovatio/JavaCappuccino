package unit_25;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;

class Exam_03_sub extends JFrame implements MouseListener{

    private JRootPane jrp;
    private Container con;
    private BorderLayout bl = new BorderLayout();

    private JButton bt = new JButton("A");
    private JButton bt1 = new JButton("B");
    private JButton bt2 = new JButton("C");
    private JButton bt3 = new JButton("D");

    private JPanel jp = new JPanel(null);
    private ImageIcon ii = new ImageIcon("aaa.gif");
    private JLabel lb = new JLabel(ii);

    //private final JPanel jp = new JPanel();

    public Exam_03_sub(){
        super("Test");
        this.init();
        this.start();
        this.setSize(400, 400);
        this.setVisible(true);
    }

    private void init() {
        jrp = this.getRootPane();
        con = jrp.getContentPane();
        con.setLayout(bl);
        con.add("North", bt);
        con.add("Center", bt1);
        con.add("South", bt2);
        lb.setBounds(0,0,200,100);
        jp.add(lb);
        bt3.setBounds(200, 100, 80, 60);
        jp.add(bt3);
        jp.setOpaque(false);
        jrp.setGlassPane(jp);
        jrp.setVisible(true);
    }

    private void start() {

    }

    public void paint(Graphics g){
        Graphics2D g2D = (Graphics2D)g;
    }

    //MouseListener

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if(e.getSource() == bt || e.getSource() == bt1 || e.getSource() == bt2){
            if(e.getSource() == bt){
                lb.setBounds(e.getX(), e.getY(), 50, 50);
            }
            else if(e.getSource() == bt1){
                lb.setBounds(e.getX(), e.getY() + bt.getHeight() , 50, 50);
            }
            else if(e.getSource() == bt2){
                lb.setBounds(e.getX(), e.getY() + bt.getHeight() + bt1.getHeight(), 50, 50);
            }
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}

public class Exam_03 {

    public static void main(String[] args) {
        Exam_03_sub runRun = new Exam_03_sub();
    }

}

