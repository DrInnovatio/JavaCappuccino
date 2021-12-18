package unit_26;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;

class Exam_21_sub extends JFrame {

    private JRootPane jrp;
    private Container con;
    //private JTable jt = new JTable();
    //private JTable jt = new JTable(3,4);
    private String[][] str = {{"1-1", "1-2", "1-3", "1-4"}, {"1-1", "1-2", "1-3", "1-4"}, {"1-1", "1-2", "1-3", "1-4"}};
    private String[] str1 = {"No.1", "No.2", "No.3", "No.4"};
    private JTable jt = new JTable(str, str1);
    private JScrollPane jsp = new JScrollPane(jt);


    public Exam_21_sub(){
        super("Test");
        this.init();
        this.start();
        this.setSize(300, 200);
        this.setVisible(true);
    }

    private void init() {
        jrp = this.getRootPane();
        con = jrp.getContentPane();
        con.setLayout(new BorderLayout(5,5));
        con.add("North", new JLabel("JTable!!!", JLabel.CENTER));
        JPanel jp = new JPanel(new FlowLayout((FlowLayout.RIGHT)));
        jp.add(new JButton("Check"));
        jp.add(new JButton("Cancel"));
        con.add("South", jp);


    }

    private void start() {

    }



}

public class Exam_21 {

    public static void main(String[] args) {
        Exam_21_sub runRun = new Exam_21_sub();
    }

}
