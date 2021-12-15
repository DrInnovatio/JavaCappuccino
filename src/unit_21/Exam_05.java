package unit_21;

import java.awt.*;
import java.awt.event.KeyEvent;
import javax.swing.*;
import javax.swing.event.*;

class Exam_05_sub extends JFrame {
    private Robot robot;
    private TextArea textArea = new TextArea();

    public Exam_05_sub(){
        super("Test");
        this.init();
        this.start();
        this.setSize(300, 200);
        this.setVisible(true);
        robot.delay(2000);
        System.out.println("Hello Robot");
        System.out.println("autoDelay : " + robot.getAutoDelay() );
        System.out.println("Color(30, 15) = : " + robot.getPixelColor(30, 15));
        System.out.println("Color(150, 150) = : " + robot.getPixelColor(150, 150));

        robot.mouseMove(500, 500);
        robot.keyPress(KeyEvent.VK_A);
        robot.keyPress(KeyEvent.VK_B);
        robot.keyPress(KeyEvent.VK_C);
        robot.keyPress(KeyEvent.VK_D);
        robot.keyPress(KeyEvent.VK_E);
        robot.delay(1000);
        robot.keyRelease(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_B);
        robot.keyRelease(KeyEvent.VK_C);
        robot.keyRelease(KeyEvent.VK_D);
        robot.keyRelease(KeyEvent.VK_E);
        robot.keyRelease(KeyEvent.VK_E);

    }

    private void init() {
        this.setLayout(new BorderLayout() );
        try{
            robot = new Robot();
        }catch(AWTException ee){}
        robot.waitForIdle();
        this.add("Center", textArea);
        textArea.requestFocus();
    }

    private void start() {

    }


}

public class Exam_05 {

    public static void main(String[] args) {
        Exam_05_sub ess = new Exam_05_sub();
    }

}
