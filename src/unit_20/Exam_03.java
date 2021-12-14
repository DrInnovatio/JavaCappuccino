package unit_20;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

class Exam_03_sub extends JFrame implements InternalFrameListener{

    private Container container;
    private JLabel label = new JLabel("Internal Frame");
    private JButton jButton = new JButton("1");
    private JButton jButton1 = new JButton("1");
    private JPanel jPanel = new JPanel(null);
    private JInternalFrame jInternalFrame = new JInternalFrame("Test", true, true, true);

    public Exam_03_sub(){
        super("Test");
        this.init();
        this.start();
        this.setSize(300, 200);
        this.setVisible(true);
    }

    private void init() {
        container = this.getContentPane();
        container.setLayout(new BorderLayout());
        container.add("North", label);
        container.add("West", jButton);
        container.add("South", jButton1);
        jInternalFrame.setSize(100, 80);
        jInternalFrame.setVisible(true);
        jPanel.add(jInternalFrame);
        container.add("Center", jPanel);

    }

    private void start() {
        jInternalFrame.addInternalFrameListener(this);
    }

    @Override
    public void internalFrameOpened(InternalFrameEvent e) {
        System.out.println("Opened");
    }

    @Override
    public void internalFrameClosing(InternalFrameEvent e) {
        System.out.println("X button hit.");
    }

    @Override
    public void internalFrameClosed(InternalFrameEvent e) {
        System.out.println("It ended.");
    }

    @Override
    public void internalFrameIconified(InternalFrameEvent e) {
        System.out.println("Activated");
    }

    @Override
    public void internalFrameDeiconified(InternalFrameEvent e) {
        System.out.println("becoming an Icon");
    }

    @Override
    public void internalFrameActivated(InternalFrameEvent e) {
        System.out.println("Inactivated");
    }

    @Override
    public void internalFrameDeactivated(InternalFrameEvent e) {
        System.out.println("uniconified.");
    }
}

public class Exam_03 {

    public static void main(String[] args) {
        Exam_03_sub ess = new Exam_03_sub();
    }

}
