package unit_25;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;

class Exam_07_sub extends JFrame {

    private JRootPane jrp;
    private Container con;
    private JScrollBar jsb = new JScrollBar(SwingConstants.HORIZONTAL, 50, 10, 0, 100);

    public Exam_07_sub(){
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
        jsb.setBlockIncrement(30);
        //jsb.setEnabled(false);
        con.add("North", jsb);
    }

    private void start() {
    }

    public void paint(Graphics g){
        Graphics2D g2D = (Graphics2D)g;
    }
}

public class Exam_07 {

    public static void main(String[] args) {
        Exam_07_sub runRun = new Exam_07_sub();
    }

}
