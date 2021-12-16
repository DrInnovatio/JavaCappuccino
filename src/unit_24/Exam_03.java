package unit_24;

import java.awt.*;
import java.awt.event.*;

class Exam_03_sub extends Frame implements ComponentListener {


    public Exam_03_sub(){
        super("Test");
        this.init();
        this.start();
        this.setSize(300, 200);
        this.setVisible(true);

        try{
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }this.setVisible(false);

        try{
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }this.setVisible(true);
    }

    private void init() {
    }

    private void start() {
        this.addComponentListener(this);
    }

    public void paint(Graphics g){
        Graphics2D g2D = (Graphics2D)g;
    }


    @Override
    public void componentResized(ComponentEvent e) {
        System.out.println("Resized");
    }

    @Override
    public void componentMoved(ComponentEvent e) {
        System.out.println("Moved");
    }

    @Override
    public void componentShown(ComponentEvent e) {
        System.out.println("Shown");
    }

    @Override
    public void componentHidden(ComponentEvent e) {
        System.out.println("Hidden");
    }
}

public class Exam_03 {

    public static void main(String[] args) {
        Exam_03_sub ess = new Exam_03_sub();
    }

}
