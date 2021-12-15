package unit_22;

import java.awt.*;
import java.awt.event.*;

class Exam_04_sub extends Frame implements MouseListener {
    private Point[] points = new Point[10];
    private static int i = 0;

    public Exam_04_sub(){
        super("Test");
        this.init();
        this.start();
        this.setSize(300, 200);
        this.setVisible(true);
    }

    private void init() {


    }

    private void start() {
        this.addMouseListener(this);
    }

    public void paint(Graphics g){
        Graphics2D g2D = (Graphics2D)g;
        g2D.setFont(Font.decode("Serif-BOLD-20"));

        if(i == 10){
            for(int a = 0; a < 10; a++){
               g2D.drawString("*", points[a].x, points[a].y);
            }
        }
    }


    @Override
    public void mouseClicked(MouseEvent e) {

        if(i == 10){
            repaint();
            this.removeMouseListener(this);
            return;
        }
        points[i] = new Point(e.getX(), e.getY());
        i++;
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

public class Exam_04 {

    public static void main(String[] args) {
        Exam_04_sub ess = new Exam_04_sub();
    }

}
