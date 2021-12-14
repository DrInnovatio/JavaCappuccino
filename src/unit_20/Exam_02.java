package unit_20;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

class Exam_02_sub extends JFrame implements CaretListener, ChangeListener {

private Container container;
private JTextField jTextField = new JTextField("TESTTEST", 10);
private JButton jButton = new JButton("Check");

    public Exam_02_sub() {
        super("Test");
        this.init();
        this.start();
        this.setSize(300, 200);
        this.setVisible(true);

        try{
            Thread.sleep(2000);
        }catch(InterruptedException ee){}
        jTextField.setCaretPosition(jTextField.getText().trim().length());

        try{
            Thread.sleep(2000);
        }catch(InterruptedException ee){}
        jButton.setEnabled(false);
    }

    private void init() {
        container = this.getContentPane();
        container.setLayout(new FlowLayout());
        container.add(jTextField);
        container.add(jButton);
    }

    private void start() {
        jTextField.addCaretListener(this);
        jButton.addChangeListener(this);
    }

    @Override
    public void caretUpdate(CaretEvent e) {
        if(e.getSource() == jTextField){
            System.out.println("The cursor has been moved.");
        }
    }
    @Override
    public void stateChanged(ChangeEvent e){
        if(e.getSource() == jButton){
            System.out.println("The Button became inactivated.");
        }
    }
}

public class Exam_02 {

    public static void main(String[] args) {
        Exam_02_sub eex = new Exam_02_sub();
    }
}

