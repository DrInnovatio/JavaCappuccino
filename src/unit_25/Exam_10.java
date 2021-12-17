package unit_25;

import java.awt.*;
import java.awt.event.*;
import java.text.DateFormatSymbols;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;
import java.text.*;

class Exam_10_sub extends JFrame {

    private JRootPane jrp;
    private Container con;
    private JSpinner js = new JSpinner();
    //private String[] str = {"AAA", "BBB", "CCC"};
    private DateFormatSymbols dfs = new DateFormatSymbols();
    private String[] str = dfs.getWeekdays();
    private SpinnerListModel slm = new SpinnerListModel(str);

    public Exam_10_sub(){
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
        js.setModel(slm);
        con.add("North", js);



    }

    private void start() {

    }



}

public class Exam_10 {

    public static void main(String[] args) {
        Exam_10_sub runRun = new Exam_10_sub();
    }

}
