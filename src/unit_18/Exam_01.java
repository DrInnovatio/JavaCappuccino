package unit_18;

import java.awt.*;
import java.awt.event.*;

class Exam_01_sub extends Frame {
    public Exam_01_sub(){
        super("Harry");
        this.init();
        this.start();
        this.setSize(300, 200);
        this.setVisible(true);
    }

    public void init(){

    }

    public void start(){
        Exam_01_sub1 ess = new Exam_01_sub1();
        this.addWindowListener(ess);
    }
}


public class Exam_01 {

    public static void main(String[] args) {
        Exam_01_sub exe = new Exam_01_sub();
    }

}

class Exam_01_sub1 extends WindowAdapter{
    //실행 클라스
    public void windowClosing(WindowEvent e){
        System.exit(0);
    }
}

