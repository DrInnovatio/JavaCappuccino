package unit_23;

import java.awt.*;
import java.awt.event.*;

class Exam_07_sub extends Frame implements Runnable {

    private Image background;
    private Image[] animation = new Image[5];
    private Thread animator;
    private int x;
    private MediaTracker mediaTracker;
    public Exam_07_sub(){
        super("Test");
        this.init();
        this.start();
        this.setSize(500, 500);
        this.setVisible(true);
    }
 // image path : "C:/dev/workspace/javase_prj1/src/day_05_09/img1.jpg"
    private void init() {
        background = Toolkit.getDefaultToolkit().getImage("../img/bg.jpg");
        for(int i = 0; i < 5; i++){
            animation[i] = Toolkit.getDefaultToolkit().getImage("bbb"+i+".jpg");
        }
        mediaTracker = new MediaTracker(this);
        mediaTracker.addImage(background, 0);

        for(int i = 0; i < 5; i++){
            mediaTracker.addImage(animation[i], 1, 200, 300);
        }

    }

    private void start() {
        animator  = new Thread();
        animator.start();
    }

    // avoiding image presentation error.
    public void update(Graphics g){
        paint(g);
    }

    public void paint(Graphics g){
        Graphics2D g2D = (Graphics2D)g;
        if(mediaTracker.statusAll(false) == MediaTracker.ERRORED){
            g.setColor(Color.blue);
            g.fillRect(0,0,400,500);
            return;
        }
        g2D.drawImage(background, 0, 0, this);
        if(mediaTracker.statusID(1, false) == MediaTracker.COMPLETE){
            g2D.drawImage(animation[x], 100, 100, 200, 300, this);

        }
    }

    @Override
    public void run() {
        try{
            mediaTracker.waitForID(0);
        } catch (InterruptedException e) {
            e.printStackTrace();
            return;
        }
        while(animator != null){
            try{
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                synchronized (this){
                    x++;
                    if(x >= animation.length){
                        x = 0;
                    }
                }
                repaint();
            }
        }
    }
}

public class Exam_07 {

    public static void main(String[] args) {
        Exam_07_sub ess = new Exam_07_sub();
    }

}
