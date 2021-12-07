package unit_19;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Exam_03_sub extends JFrame implements MouseListener{

    private Container con;
    private FlowLayout fl = new FlowLayout();
    private JButton jb = new JButton("String");
    private ImageIcon im = new ImageIcon("rose.gif");
    private JButton jb1 = new JButton(im);
    private JButton jb2 = new JButton("Str&Icon", im);
    private ImageIcon im1 = new ImageIcon("rose.gif");
    private ImageIcon im2 = new ImageIcon("ccc.gif");

    public Exam_03_sub(){
        super("pop");
        this.init();
        this.start();
        this.setSize(700, 300);
        this.setVisible(true);
    }

    private void init() {
        con = this.getContentPane();
        con.setLayout(fl);
        jb.setEnabled(false);
        con.add(jb);
        jb1.setMnemonic('a');
        con.add(jb1);
        jb2.setHorizontalTextPosition(SwingConstants.RIGHT);
        jb2.setVerticalTextPosition(SwingConstants.TOP);
        jb2.setMnemonic('b');
        jb2.setPressedIcon(im1);
        jb2.setRolloverIcon(im2);
        con.add(jb2);
    }

    private void start() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jb.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == jb){
            jb.doClick(0);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

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
        Exam_03_sub es = new Exam_03_sub();
    }
}
