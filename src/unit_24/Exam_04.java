package unit_24;

import java.awt.*;
import java.awt.event.*;

class Exam_04_sub extends Frame implements ContainerListener{
    private Panel p = new Panel(new FlowLayout());
    private Button button = new Button("Check");

    public Exam_04_sub(){
        super("Test");
        this.init();
        this.start();
        this.setSize(300, 200);
        this.setVisible(true);

        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){}
        p.add(button);
        this.validate();

        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){}
        p.remove(button);
        this.validate();
    }

    private void init() {
        this.setLayout(new BorderLayout());
        this.add("Center", p );

    }

    private void start() {
        p.addContainerListener(this);
    }

    public void paint(Graphics g){
        Graphics2D g2D = (Graphics2D)g;
    }


    @Override
    public void componentAdded(ContainerEvent e) {
        System.out.println(e.getContainer() + " in " + e.getChild() + " added. ");
    }

    @Override
    public void componentRemoved(ContainerEvent e) {
        System.out.println(e.getContainer() + " in " + e.getChild() + " deleted. ");

    }
}

public class Exam_04 {

    public static void main(String[] args) {
        Exam_04_sub ess = new Exam_04_sub();
    }

}

