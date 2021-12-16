package unit_24;

import java.awt.*;
import java.awt.event.*;

class Exam_05_sub extends Frame implements HierarchyBoundsListener, HierarchyListener{

    private Button button = new Button("Check");

    public Exam_05_sub(){
        super("Test");
        this.init();
        this.start();
        this.setSize(300, 200);
        this.setVisible(true);
    }

    private void init() {
        this.setLayout(new FlowLayout());
        this.add(button);
    }

    private void start() {
        button.addHierarchyBoundsListener(this);
        button.addHierarchyListener(this);
    }

    public void paint(Graphics g){
    }

    // HierarchyBoundsListener
    @Override
    public void ancestorMoved(HierarchyEvent e) {
        System.out.println("The ancestor has moved.");
    }

    @Override
    public void ancestorResized(HierarchyEvent e) {
        System.out.println("The ancestor's size has changed.");
    }

    @Override
    public void hierarchyChanged(HierarchyEvent e) {
        System.out.println();
        System.out.println("Changed = : " + e.getChanged());
        System.out.println("Changed Parents  = : " + e.getChangedParent());
        System.out.println("Flags  = : " + e.getChangeFlags());
        System.out.println("Component  = : " + e.getComponent());
        System.out.println("Changed Parents  = : " + e.getChangedParent());
    }
}

public class Exam_05 {

    public static void main(String[] args) {
        Exam_05_sub ess = new Exam_05_sub();
    }

}
