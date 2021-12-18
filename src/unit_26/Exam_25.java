package unit_26;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;

class Exam_25_sub extends JFrame {

    private JRootPane jrp;
    private Container con;
    private JTree jt = new JTree();
    private JScrollPane jsp = new JScrollPane(jt);

    public Exam_25_sub(){
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
        con.add("North", new JLabel("JTree!!!", JLabel.CENTER));
        JPanel jp = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        jp.add(new JButton("Check"));
        jp.add(new JButton("Cancel"));
        con.add("South", jp);
        jt.addSelectionRow(1);
        jt.expandRow(2);
        jt.setEditable(true);
        jt.setToggleClickCount(3);
        con.add("Center", jsp);
    }

    private void start() {

    }
}

public class Exam_25 {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getLookAndFeel());
        }catch (Exception e){}
        Exam_25_sub runRun = new Exam_25_sub();
    }

}
