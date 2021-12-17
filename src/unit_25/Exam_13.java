package unit_25;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;

class Exam_13_sub extends JFrame {
    private JRootPane jrp;
    private Container con;
    private JEditorPane jep;
    private JScrollPane jsp;

    public Exam_13_sub() throws IOException {
        super("Test");
        this.init();
        this.start();
        this.setSize(300, 200);
        this.setVisible(true);
    }

    private void init() throws IOException {
        jrp = this.getRootPane();
        con = jrp.getContentPane();
        con.setLayout(new BorderLayout(5,5));
        con.add("North", new JLabel("EditorPane!!", JLabel.CENTER));
        con.add("South", new JButton("Check"));
//        try{
//            jep = new JEditorPane("https://www.naver.com/");
//        }catch(IOException ee){}


        jsp = new JScrollPane(jep);
        con.add("Center", jsp);

    }

    private void start() {

    }
}

public class Exam_13 {

    public static void main(String[] args) throws IOException {
        Exam_13_sub runRun = new Exam_13_sub();
    }

}
