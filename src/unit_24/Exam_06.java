package unit_24;

import java.awt.*;
import java.awt.event.*;

class Exam_06_sub extends Frame implements MouseWheelListener {


    public Exam_06_sub(){
        super("Test");
        this.init();
        this.start();
        this.setSize(300, 200);
        this.setVisible(true);
    }

    private void init() {


    }

    private void start() {
        this.addMouseWheelListener(this);
    }

    public void paint(Graphics g){
    }

    // MouseWheelListener Methods
    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {
        System.out.println("Scroll Amount = : " + e.getScrollAmount());
        System.out.println("Scroll Type = : " + e.getScrollAmount());
        System.out.println("Block = : " + MouseWheelEvent.WHEEL_BLOCK_SCROLL);
        System.out.println("Unit = : " + MouseWheelEvent.WHEEL_UNIT_SCROLL);
        System.out.println("UnitsToScroll = : " + e.getUnitsToScroll());
        System.out.println("Rotation = : " + e.getWheelRotation());
        System.out.println("=========");
    }
}

public class Exam_06 {

    public static void main(String[] args) {
        Exam_06_sub ess = new Exam_06_sub();
    }

}
