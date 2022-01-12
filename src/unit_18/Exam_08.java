package unit_18;

import java.awt.*;
import java.awt.event.*;

class Exam_08_sub extends Frame implements FocusListener{

    private BorderLayout bl = new BorderLayout();
    private Label lb = new Label("Name = : ", Label.RIGHT);
    private Label lb1 = new Label("ID number :  ", Label.RIGHT);
    private TextField tf = new TextField();
    private TextField tf1 = new TextField();
    private TextField tf2 = new TextField();
    private Button bt = new Button("Checked");
    private Button bt1 = new Button("Cancel");

    public Exam_08_sub(){
        super("Amazon");
        this.init();
        this.start();
        this.setSize(300, 200);
        this.setVisible(true);
    }

    public void init(){
        this.setLayout(bl);
        Panel p =new Panel(new GridLayout(2,1));
        p.add(tf);
        Panel p1 = new Panel(new GridLayout(1,2,5,5));
        p1.add(tf1);
        p1.add(tf2);
        p.add(p1);
        this.add("Center", p);
        Panel p2 = new Panel(new GridLayout(2,1));
        p2.add(lb);
        p2.add(lb1);
        this.add("West", p2);
        Panel p3 = new Panel(new FlowLayout(FlowLayout.RIGHT));
        p3.add(bt);
        p3.add(bt1);
        this.add("South", p3);
    }

    public void start(){
        tf1.addFocusListener(this);
        tf2.addFocusListener(this);
    }


    public void paint(Graphics g){

    }

    @Override
    public void focusGained(FocusEvent e) {
        if(e.getSource() == tf1){
            int x = tf.getText().trim().length();
            if(x == 0){
                tf.requestFocus();
            }
        }
        else if(e.getSource() == tf2){
            int x = tf1.getText().trim().length();
            if(x != 6){
                tf1.setText("");
                tf1.requestFocus();
            }
        }
    }

    @Override
    public void focusLost(FocusEvent e) {

    }
}


public class Exam_08 {

    public static void main(String[] args) {
        Exam_08_sub es = new Exam_08_sub();
    }
}
