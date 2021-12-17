package unit_25;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;

class Exam_09_sub extends JFrame implements ChangeListener{
    private JRootPane jrp;
    private Container con;
    private JSpinner js = new JSpinner();
    private JButton bt = new JButton("Check");
    private JButton bt1 = new JButton("Cancel");
    private JTextArea ta = new JTextArea();
    private JScrollPane jsp = new JScrollPane();
    private JButton bt2 = new JButton("AAAAAAAAAA");

    public Exam_09_sub(){
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
        js.setEditor(bt2);
        con.add("North", js);
        JPanel jp = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        jp.add(bt);
        jp.add(bt1);
        con.add("South", jp);
        ta.setEditable(false);
        con.add("Center", jsp);

    }

    private void start() {
        js.addChangeListener( this);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        if(e.getSource() == js){
           // System.out.println("Spin Button Clicked.");
            Integer i = (Integer)js.getValue();
            Integer ii = (Integer)js.getNextValue();
            Integer iii = (Integer)js.getPreviousValue();
            ta.append("Current " + i + ", next" + ii + " previous " + iii + "\n");
            bt2.setText(String.valueOf(i));
        }
    }
}

public class Exam_09 {

    public static void main(String[] args) {
        Exam_09_sub runRun = new Exam_09_sub();
    }

}
