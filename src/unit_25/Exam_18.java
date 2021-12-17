package unit_25;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;

class Exam_18_sub extends JFrame {

    private JRootPane jrp;
    private Container con;
    private JLabel jl = new JLabel("test");
    private JButton jbt = new JButton("test 1");


    public Exam_18_sub(){
        super("Test");
        this.init();
        this.start();
        this.setSize(300, 200);
        this.setVisible(true);
    }

    private void init() {
        jrp = this.getRootPane();
        con = jrp.getContentPane();
        con.setLayout(new FlowLayout());
        jl.setToolTipText("hahahahaha");
        jbt.setToolTipText("what's up!");
        con.add(jl);
        con.add(jbt);

    }

    private void start() {}

}

public class Exam_18 {



    public static void main(String[] args) {
        ToolTipManager ttm = ToolTipManager.sharedInstance();
        ttm.setEnabled(true);
        ttm.setInitialDelay(0);
        ttm.setDismissDelay(4000);
        Exam_18_sub runRun = new Exam_18_sub();
    }

}
