package unit_18;
import java.awt.*;
import java.awt.event.*;

class Exam_06_sub extends Frame implements MouseListener{

    private Button bt = new Button("Click me");
    public Exam_06_sub(){
        super("Google");
        this.init();
        this.start();
        this.setSize(300, 200);
        this.setVisible(true);
    }

    public void init(){
        this.setLayout(null);
        bt.setBounds(50,50,80,30);
        this.add(bt);
    }

    public void start(){
        bt.addMouseListener(this);
    }

    public void paint(Graphics g){

    }

    // implemented methods

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Entered the specific position.");
        bt.setLocation((int)(Math.random() * 200), (int)(Math.random() * 100) );
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Out of the specific position.");
    }
}


public class Exam_06 {

    public static void main(String[] args) {
        Exam_06_sub es = new Exam_06_sub();
    }




}
