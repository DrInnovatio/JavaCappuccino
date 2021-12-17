package unit_25;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;

class Exam_15_sub extends JFrame {
    private JRootPane jrp;
    private Container con;
    private JInternalFrame jif = new JInternalFrame("Test", true, true, true);


    public Exam_15_sub() {
        super("Test");
        this.init();
        this.start();
        this.setSize(300, 200);
        this.setVisible(true);
    }

    private void init() {
        jrp = this.getRootPane();
        con = jrp.getContentPane();
        con.setLayout(null);
        jif.setBounds(30, 30, 200, 140);
        jif.setVisible(true);
        con.add(jif);
    }

    private void start() {

    }
}

public class Exam_15 {

    public static void main(String[] args) {
        UIManager.LookAndFeelInfo[] laf = UIManager.getInstalledLookAndFeels();
        for(int i = 0; i < laf.length; i++){
            System.out.println("==========");
            System.out.println("ClassName = " + laf[i].getClassName());
            System.out.println("Name = " + laf[i].getName());
            System.out.println("toString = " + laf[i].toString());
            System.out.println("===========");
        }

        Exam_15_sub runRun = new Exam_15_sub();
    }

}
