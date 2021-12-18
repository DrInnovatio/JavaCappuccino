package unit_26;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;

class Exam_01_sub extends JFrame implements ListDataListener {

    private JRootPane jrp;
    private Container con;
    private DefaultListModel dlm = new DefaultListModel();
    private JList jl = new JList(dlm);
    private JScrollPane jsp = new JScrollPane(jl);

    public Exam_01_sub(){
        super("Test");
        this.init();
        this.start();
        this.setSize(300, 200);
        this.setVisible(true);

        try{
            Thread.sleep(2000);
        }catch (InterruptedException event){}
        dlm.set(2, "Google");

    }

    private void init() {
        jrp = this.getRootPane();
        con = jrp.getContentPane();
        con.setLayout(new BorderLayout());
        con.add("North", new JLabel("ListData Event!!", JLabel.CENTER));
        con.add("South", new JButton("Check"));
        dlm.addElement("AAA");
        dlm.addElement("AAA");
        dlm.addElement("AAA");
        dlm.addElement("AAA");
        dlm.addElement("AAA");
        dlm.addElement("AAA");
        dlm.addElement("AAA");
        con.add("Center", jsp);

    }

    private void start() {
        dlm.addListDataListener(this);
    }


    // ListDataListener
    @Override
    public void intervalAdded(ListDataEvent e) {

    }

    @Override
    public void intervalRemoved(ListDataEvent e) {

    }

    @Override
    public void contentsChanged(ListDataEvent e) {
        if(e.getSource() == dlm){
            System.out.println(e.getIndex0() + "  was changed.");
        }
    }
}

public class Exam_01 {

    public static void main(String[] args) {
        Exam_01_sub runRun = new Exam_01_sub();
    }

}
