package unit_22;

import java.awt.*;
import java.awt.event.*;

class Exam_05_sub extends Frame implements MouseListener{
    private int[] x = {70, 120, 20};
    private int[] y = {50, 100, 100};

    private final Polygon polygon = new Polygon(x, y, x.length);
    private boolean bbb = false;
    private boolean bbb1 = false;

    public Exam_05_sub(){
        super("Test");
        this.init();
        this.start();
        this.setSize(300, 200);
        this.setVisible(true);
    }

    private void init() {


    }

    private void start() {
        addMouseListener(this);
    }

    public void paint(Graphics g){
        Graphics2D g2D = (Graphics2D)g;
        polygon.addPoint(100, 150);
        polygon.addPoint(170, 120);
        if(!bbb){
            g2D.drawPolygon(polygon);
        }
        else {
            g2D.fillPolygon(polygon);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(polygon.contains(e.getX(), e.getY())){
            System.out.println("you clicked in the shape. ");
            bbb = !bbb;
            repaint();
        }
        else {
            System.out.println("you clicked out of the shape. ");
            bbb1 = !bbb1;
            if(bbb){
                polygon.translate(5, 5);
            }
            else{
                polygon.translate(-5, -5);
                repaint();
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}

public class Exam_05 {

    public static void main(String[] args) {
        Exam_05_sub ess = new Exam_05_sub();
    }

}
