package unit_18;
import java.awt.*;
import java.awt.event.*;

class Exam_10_sub extends Frame implements KeyListener{

    private FlowLayout fl = new FlowLayout();
    private TextField tf = new TextField(10);
    private Label lb = new Label("-", Label.CENTER);
    private TextField tf1 = new TextField(10);

    public Exam_10_sub(){
        super("FaceBook");
        this.init();
        this.start();
        this.setSize(300, 200);
        this.setVisible(true);
    }

    public void init(){
        this.setLayout(fl);
        this.add(tf);
        this.add(lb);
        this.add(tf1);
    }

    public void start(){
        tf.addKeyListener(this);
    }

    public void paint(Graphics g) {

    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        String str = tf.getText().trim();
        if(str.length() == 6){
            tf1.requestFocus();;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        String str = tf.getText().trim();
        if(str.length() == 6){
            tf1.requestFocus();
        }
    }
}

public class Exam_10 {

    public static void main(String[] args) {
        Exam_10_sub es = new Exam_10_sub();
    }
}
