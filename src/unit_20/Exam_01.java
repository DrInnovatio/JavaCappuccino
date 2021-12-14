package unit_20;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

class Exam_01_sub extends JFrame implements AncestorListener{

    private Container container;
    private JButton jButton = new JButton("Check");

    public Exam_01_sub(){
        super("Test");
        jButton.addAncestorListener(this);
        this.init();
        this.start();
        this.setSize(300, 200);
        this.setVisible(true);
    }

    private void init() {

        container = this.getContentPane();
        container.setLayout(new FlowLayout());
        container.add(jButton);

        this.setVisible(true);
        try{
            Thread.sleep(2000);
        }catch (InterruptedException ee){}
        container.remove(jButton);
        container.add(jButton);
    }

    private void start() {

    }

    @Override
    public void ancestorAdded(AncestorEvent event) {
        if(event.getSource() == jButton){
            System.out.println("Button added");
            System.out.println("Ancestor = : " + event.getAncestor());
            System.out.println("Parent = : " + event.getAncestorParent());
            System.out.println("Component = : " + event.getComponent());
        }
    }

    @Override
    public void ancestorRemoved(AncestorEvent event) {
        if(event.getSource() == jButton){
            System.out.println("Button removed.");
            container.repaint();
        }
    }

    @Override
    public void ancestorMoved(AncestorEvent event) {

        if(event.getSource() == jButton){
            System.out.println("Button removed.");
        }

    }
}

public class Exam_01 {

    public static void main(String[] args) {
        Exam_01_sub ess = new Exam_01_sub();
    }
    
}
