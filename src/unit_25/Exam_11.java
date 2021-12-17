package unit_25;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;
import java.util.*;

class Exam_11_sub extends JFrame {

    private JRootPane jrp;
    private Container con;
    private JSpinner js = new JSpinner();
    private JSpinner js1 = new JSpinner();
    private SpinnerDateModel sdm = new SpinnerDateModel();
    private JTextField tf = new JTextField();
    private SpinnerNumberModel snm = new SpinnerNumberModel(50, 0, 100, 2);

    public Exam_11_sub(){
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
        sdm.setCalendarField(Calendar.MONTH);
        js.setModel(sdm);
        tf = ((JSpinner.DateEditor)js.getEditor()).getTextField();
        tf.setEnabled(false);
        con.add("North", js);
        js1.setModel(snm);
        con.add("South", js1);

    }

    private void start() {

    }
}

public class Exam_11{

    public static void main(String[] args) {
        Exam_11_sub runRun = new Exam_11_sub();
    }

}
