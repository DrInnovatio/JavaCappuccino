package unit_18;

import java.awt.*;
import java.awt.event.*;

class Exam_03_sub extends Frame {
    public Exam_03_sub(){
        super("Harry");
        this.init();
        this.start();
        this.setSize(300, 200);
        this.setVisible(true);
    }

    public void init(){

    }

    public void start(){
        this.addWindowListener(new WindowAdapter() {

            @Override
            public void windowOpened(WindowEvent e) {
                super.windowOpened(e);
            }

            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }

            @Override
            public void windowClosed(WindowEvent e) {
                super.windowClosed(e);
            }

            @Override
            public void windowIconified(WindowEvent e) {
                System.out.println("Iconified");
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                super.windowDeiconified(e);
            }

            @Override
            public void windowActivated(WindowEvent e) {
                super.windowActivated(e);
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                super.windowDeactivated(e);
            }

            @Override
            public void windowStateChanged(WindowEvent e) {
                super.windowStateChanged(e);
            }

            @Override
            public void windowGainedFocus(WindowEvent e) {
                super.windowGainedFocus(e);
            }

            @Override
            public void windowLostFocus(WindowEvent e) {
                super.windowLostFocus(e);
            }
        });
    }
}




public class Exam_03 {

    public static void main(String[] args) {
        Exam_03_sub exe = new Exam_03_sub();
    }

}
