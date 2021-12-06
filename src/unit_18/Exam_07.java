package unit_18;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

class Exam_07_sub extends Frame implements MouseMotionListener, MouseListener {
    private int x = 0;
    private int y = 0;
    private int x1, y1, x2, y2;
    public Exam_07_sub(){
        super("Test");
        this.init();
        this.start();
        this.setSize(300, 200);
        this.setVisible(true);
    }

    public void init(){

    }

    public void start(){
        this.addMouseMotionListener(this);
        this.addMouseListener(this);
    }

    public void paint(Graphics g){
        g.drawString("x = : " + x + "   " + "y = : " + y, 50, 50);
        g.drawLine(x1, y1, x2, y2);
    }

    //MouseMotion => MouseEvent
    @Override
    public void mouseDragged(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        repaint();
        //System.out.println("x = : " + x + "   " + "y = : " + y);
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    // MouseListener


    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        x1 = e.getX();
        y1 = e.getY();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        x2 = e.getX();
        y2 = e.getY();
        repaint();
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}

public class Exam_07 {

    public static void main(String[] args) {
        Exam_07_sub es = new Exam_07_sub();
    }
}
