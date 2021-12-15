package unit_22;

import java.awt.*;
import javax.swing.*;

class Exam_01_sub extends JFrame {


    public Exam_01_sub(){
        super("Test");
        this.init();
        this.start();
        this.setSize(500, 500);
        this.setVisible(true);
    }

    private void init() {


    }

    private void start() {

    }

    public void paint(Graphics g){
        /**
        double rad = Math.PI / 180;
        Graphics2D g2D = (Graphics2D)g;
        g2D.fillRect(100, 100, 100, 100);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            g2D.copyArea(100, 100, 100, 100, 150, 0);

            try{
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            g2D.clearRect(250, 100, 100, 100);
            g2D.rotate(20 * rad);
            g2D.drawRect(250, 100, 100, 100);
         **/
        Graphics2D g2D = (Graphics2D)g;
        g2D.fillRect(100, 100, 100, 100);

        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        g2D.translate(50, 50);
        g2D.setColor(Color.yellow);
        g2D.fillRect(100, 100, 100, 100);
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        g2D.translate(-50, -50);
        g2D.setColor(Color.blue);
        g2D.fillRect(100, 100, 100, 100);
    }

}

public class Exam_01 {

    public static void main(String[] args) {
        Exam_01_sub ess = new Exam_01_sub();
    }
}
