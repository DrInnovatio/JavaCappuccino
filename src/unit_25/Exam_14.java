package unit_25;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;

class Exam_14_sub extends JFrame {

    private JRootPane jrp;
    private Container con;
    private JScrollPane jsp = new JScrollPane();
    private JLabel j1 = new JLabel("Column Header !", JLabel.CENTER);
    private JViewport jv = new JViewport();
    private JLabel jl1 = new JLabel("1", JLabel.CENTER);
    private JViewport jv1 = new JViewport();


    public Exam_14_sub(){
        super("Test");
        this.init();
        this.start();
        this.setSize(300, 200);
        this.setVisible(true);
    }

    private void init() {
        jrp = this.getRootPane();
        con = jrp.getContentPane();
        con.setLayout(new BorderLayout());
        con.add("North", new JLabel("JViewport", JLabel.CENTER));
        con.add("South", new JButton("Check"));
        jv.setView(j1);
        jv1.setBackground(Color.red);
        jv1.setView(jl1);
        jsp.setColumnHeaderView(jv);
        jsp.setRowHeaderView(jv1);
        con.add("Center", jsp);


    }

    private void start() {

    }



}

public class Exam_14 {

    public static void main(String[] args) {
        Exam_14_sub runRun = new Exam_14_sub();
    }

}
