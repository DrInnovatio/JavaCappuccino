package unit_22;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.awt.*;
import java.awt.event.*;

class Exam_06_sub extends Frame implements MouseListener, MouseMotionListener{

    private Rectangle rg = new Rectangle(100, 100, 100, 100);
    private Boolean bb = false;
    private int xx, yy;
    public Exam_06_sub(){
        super("Test");
        this.init();
        this.start();
        this.setSize(500, 500);
        this.setVisible(true);
    }

    private void init() {


    }

    private void start() {
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }

    public void paint(Graphics g){
        Graphics2D g2D = (Graphics2D)g;
        g2D.drawRect((int)rg.getX(),(int)rg.getY(), (int)rg.getWidth(), (int)rg.getHeight());
    }


    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        if(rg.contains(e.getX(), e.getY())){
            bb = true;
            xx = e.getX() - 100;
            yy = e.getY() - 100;
            System.out.println("Clicked in the shape.");
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        bb = false;
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
// MouseMotionListener
    @Override
    public void mouseDragged(MouseEvent e) {
        if(bb){
            rg.setLocation(e.getX() - xx, e.getY() - yy);
            repaint();
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}

public class Exam_06 {

    public static void main(String[] args) {
        Exam_06_sub ess = new Exam_06_sub();
    }

}
