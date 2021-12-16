package unit_25;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;

class Exam_01_sub extends JFrame implements ActionListener {

    private JRootPane jrp;
    private JButton jButton = new JButton("Check");
    private JButton jButton1 = new JButton("Cancel");
    private JButton jButton2 = new JButton("Hello");
    private Container container;

    public Exam_01_sub(){
        super("Test");
        this.init();
        this.start();
        this.setUndecorated(true);
        this.setSize(300, 200);
        this.setVisible(true);
        System.out.println("UI Class ID : " + jrp.getUIClassID());
    }

    private void init() {
        jrp = this.getRootPane();
        jrp.setWindowDecorationStyle(JRootPane.COLOR_CHOOSER_DIALOG);
        jrp.setWindowDecorationStyle(JRootPane.FRAME);
        jrp.setDefaultButton(jButton);
        container = jrp.getContentPane();
        container.setLayout(new FlowLayout());
        container.add(jButton);
        container.add(jButton1);
        System.out.println("Class ? " + jrp.isOptimizedDrawingEnabled());
    }

    private void start() {
        jButton.addActionListener(this);
    }

    public void paint(Graphics g){
        Graphics2D g2D = (Graphics2D)g;
    }

    // ActionListener
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == jButton){
            System.exit(0);
        }
    }
}

public class Exam_01 {

    public static void main(String[] args) {
        Exam_01_sub ess = new Exam_01_sub();
    }

}
