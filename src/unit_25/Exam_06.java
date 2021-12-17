package unit_25;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;

class Exam_06_sub extends JFrame {
    private JRootPane jrp;
    private Container con;
    private JSlider js = new JSlider(SwingConstants.HORIZONTAL, 0, 30, 15);

    public Exam_06_sub(){
        super("Test");
        this.init();
        this.start();
        this.setSize(300, 200);
        this.setVisible(true);

        //System.out.println("Extent = " + js.getExtent());
        System.out.println("Extent = " + js.getInverted());
        try{
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //js.setExtent(15);
        js.setInverted(true);

    }

    private void init() {
        jrp = this.getRootPane();
        con = jrp.getContentPane();
        con.setLayout(new FlowLayout());
        js.setMajorTickSpacing(10);
        js.setMinorTickSpacing(1);
        js.setPaintTicks(true);
        js.setPaintLabels(true);
        js.setSnapToTicks(true);
        con.add(js);

    }

    private void start() {

    }


}

public class Exam_06 {

    public static void main(String[] args) {
        Exam_06_sub runRun = new Exam_06_sub();
    }

}
