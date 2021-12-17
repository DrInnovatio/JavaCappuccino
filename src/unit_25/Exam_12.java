package unit_25;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;

class Exam_12_sub extends JFrame {

    private JRootPane jrp;
    private Container con;
    //private JSplitPane jsp = new JSplitPane(JSplitPane.VERTICAL_SPLIT, new Button("Up button"), new Button("bottom button"));
    private JSplitPane jsp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, true, new Button("Left"), new Button("Right"));

    public Exam_12_sub(){
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
        jsp.setRightComponent(new JButton("Right 1"));
        jsp.setContinuousLayout(true);
        jsp.setDividerLocation(150);
        //jsp.setDividerSize(4);
        jsp.setOneTouchExpandable(true);
        con.add("Center",jsp);
        con.add("North", new JLabel("Test"));
        con.add("South", new JButton("Yes"));
    }

    private void start() {

    }



}

public class Exam_12 {

    public static void main(String[] args) {
        Exam_12_sub runRun = new Exam_12_sub();
    }

}
