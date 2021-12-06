package unit_18;

import java.awt.*;
import java.awt.event.*;

class Exam_09_sub extends Frame implements ItemListener {
    private FlowLayout fl = new FlowLayout();
    private Choice ch = new Choice();
    private List list = new List(3, false);

    public Exam_09_sub(){
        super("Harry");
        this.init();
        this.start();
        this.setSize(500, 500);
        this.setVisible(true);
    }

    public void init(){
        this.setLayout(fl);
        ch.add("AAA");
        ch.add("BBB");
        ch.add("CCC");
        this.add(ch);
        list.add("HHH");
        list.add("PPP");
        list.add("CCC");
        this.add(list);
    }

    public void start(){
        ch.addItemListener(this);
        list.addItemListener(this);
    }

    public void paint(Graphics g){

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getSource() == ch){
            String str = ch.getSelectedItem();
            System.out.println("String gained : " + str);
        }
        else if(e.getSource() == list){
            String str = list.getSelectedItem();
            System.out.println("String from the list : " + str);
        }
    }
}

public class Exam_09 {

    public static void main(String[] args) {
        Exam_09_sub es = new Exam_09_sub();
    }
}
