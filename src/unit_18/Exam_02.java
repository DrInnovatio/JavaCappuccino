package unit_18;

import java.awt.*;
import java.awt.event.*;

class Exam_02_sub extends Frame {
    public Exam_02_sub(){
        super("Harry");
        this.init();
        this.start();
        this.setSize(300, 200);
        this.setVisible(true);
    }

    public void init(){

    }

    public void start(){
        Exam_02_sub1 ess = new Exam_02_sub1();
        this.addWindowListener(ess);
    }

    public void paint(Graphics g){

    }
}




public class Exam_02 {

    public static void main(String[] args) {
        Exam_02_sub exe = new Exam_02_sub();
    }

}

class Exam_02_sub1 implements WindowListener {

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Window Opened.");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("X clicked.");
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Window closed");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Window iconified.");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Window Deiconified.");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Window activated.");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Window deactivated.");
    }
}
