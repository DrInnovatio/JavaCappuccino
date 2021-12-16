package unit_24;

import java.awt.*;
import java.awt.event.*;

class Exam_07_sub extends Frame implements TextListener, WindowFocusListener, WindowStateListener{

    private TextField tf = new TextField(10);
    private TextArea ta = new TextArea(5, 10);
    private String strstr;

    public Exam_07_sub(String str){
        super(str);
        strstr = str;
        this.init();
        this.start();
        this.setSize(300, 200);
        this.setVisible(true);
    }

    private void init() {
        this.setLayout(new FlowLayout());
        this.add(tf);
        this.add(ta);
    }

    private void start() {
        tf.addTextListener(this);
        ta.addTextListener(this);
        this.addWindowFocusListener(this);
        this.addWindowStateListener(this);
    }

    public void paint(Graphics g){
    }

    @Override
    public void textValueChanged(TextEvent e) {
        if(e.getSource() == tf){
            System.out.println("The contents in text filed has changed : " + tf.getText());
        }
        else if(e.getSource() == ta){
            System.out.println("The contents in text filed has changed : " + ta.getText());
        }
        System.out.println("==========");
    }


    //  WindowFocusListener
    @Override
    public void windowGainedFocus(WindowEvent e) {
        System.out.println(strstr + " window is in focus.");
    }

    @Override
    public void windowLostFocus(WindowEvent e) {
        System.out.println(strstr + " window is not in focus.");
    }

    // WindowStateListener
    @Override
    public void windowStateChanged(WindowEvent e) {
        System.out.println("=========");
        System.out.println(strstr + " previous status = " + e.getOldState());
        System.out.println(strstr + " current status = " + e.getNewState());
    }
}

public class Exam_07 {

    public static void main(String[] args) {
        Exam_07_sub ess = new Exam_07_sub("1");
        Exam_07_sub esx = new Exam_07_sub("2");
    }

}

