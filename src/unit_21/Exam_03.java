package unit_21;

import java.awt.*;
import javax.swing.*;
//import javax.swing.event.*;
//import javax.tools.Tool;

class Exam_03_sub extends JFrame {
    private PrintJob pj;
    private JobAttributes jobAttributes = new JobAttributes();
    private PageAttributes pageAttributes = new PageAttributes();


    public Exam_03_sub(){
        super("Test");
        this.init();
        this.start();
        this.setSize(300, 200);
        this.setVisible(true);
    }

    private void init() {
        Toolkit tk = Toolkit.getDefaultToolkit();
        pj = tk.getPrintJob(this, "My printing", jobAttributes, pageAttributes );
        if(pj != null){
            Graphics gg = pj.getGraphics();
            gg.drawString("Hello", 100, 100);
            gg.drawRect(120, 120, 50, 50);
            gg.dispose();
            pj.end();
        }
        else {
            System.out.println("Printing canceled.");
        }

    }

    private void start() {

    }

    public void paint(Graphics g){

    }


}

public class Exam_03 {

    public static void main(String[] args) {
        Exam_03_sub ess = new Exam_03_sub();
    }

}
