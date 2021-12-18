package unit_25;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;

class Exam_20_sub extends JFrame {

    private JRootPane jrp;
    private Container con;
    private JTextArea jta = new JTextArea(5, 20);
    private ActionMap am;
    private InputMap im;

    public Exam_20_sub(){
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
        am = jta.getActionMap();
        im = jta.getInputMap();
        Object[] aa = am.allKeys();
        Object[] bb = im.allKeys();

        for(int i = 0; i < aa.length; i ++){
            System.out.println("Action " + i + " : " + aa[i]);
        }
        System.out.println("+++++++");
        for(int i = 0; i < bb.length; i++){
            System.out.println("Input " + i + " : " + bb[i]);
        }
        con.add(jta);
    }

    private void start() {

    }



}

public class Exam_20 {

    public static void main(String[] args) {
        Exam_20_sub runRun = new Exam_20_sub();
    }

}
