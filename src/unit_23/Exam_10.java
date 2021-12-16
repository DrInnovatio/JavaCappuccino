// DisplayMode
// DisplayMode
package unit_23;

import sun.java2d.windows.GDIBlitLoops;
import java.awt.*;
import java.awt.event.*;

class Exam_10_sub extends Frame {

    private GraphicsEnvironment ge;
    private GraphicsDevice[] gdimsi;
    private GraphicsDevice gd;
    private DisplayMode dm;

    public Exam_10_sub() throws InterruptedException {
        super("Test");
        this.init();
        this.start();
        this.setSize(300, 200);
        this.setVisible(true);
        ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        gdimsi = ge.getScreenDevices();
        gd = gdimsi[0];

        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){}

        if(gd.isFullScreenSupported()){
            gd.setFullScreenWindow(this);
            validate();
        }
        else {
            this.setSize(300, 200);
            this.setVisible(true);
        }
        try{
            Thread.sleep(4000);
        }catch (InterruptedException e){}

        if(gd.isDisplayChangeSupported()){
            dm = new DisplayMode(1024, 768, 16, 60);
            gd.setDisplayMode(dm);
        }
        else {
            System.out.println("The screen is not adjustable.");
        }
        try{
            Thread.sleep(4000);
        }catch (InterruptedException e){}

        if(gd.isDisplayChangeSupported()){
            dm = new DisplayMode(800, 600, 16, 60);
            gd.setDisplayMode(dm);
        }else {
            System.out.println("The screen is not adjustable.");
        }

    }

    private void init() {


    }

    private void start() {

    }

    public void paint(Graphics g){
        Graphics2D g2D = (Graphics2D)g;
    }


}

public class Exam_10 {

    public static void main(String[] args) throws InterruptedException {
        Exam_10_sub ess = new Exam_10_sub();
    }

}
