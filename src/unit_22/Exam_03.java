package unit_22;

import java.awt.*;
import java.awt.event.*;


class Exam_03_sub extends Frame {

    private Font f = new Font("Serif", Font.BOLD, 20);
    private FontMetrics fm;
    public Exam_03_sub(){
        super("Test");
        this.init();
        this.start();
        this.setSize(300, 200);
        this.setVisible(true);
    }

    private void init() {


    }

    private void start() {

    }

    public void paint(Graphics g){
        Graphics2D g2D = (Graphics2D)g;
        g2D.setFont(f);
        fm = g2D.getFontMetrics();
        // System.out.println("FontMatrics = :  " + fm);
        //byte[] bb = {65, 66, 67, 68};
        char[] cc = {65, 66, 67, 68};
        //fm.bytesWidth(bb, 0, 3);
        System.out.println("ABCD width = : " + fm.charsWidth(cc, 0, 3));

    }


}

public class Exam_03 {

    public static void main(String[] args) {
        Exam_03_sub ess = new Exam_03_sub();
    }

}
