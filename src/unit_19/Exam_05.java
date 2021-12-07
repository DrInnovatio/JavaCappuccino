package unit_19;

import java.awt.*;
import javax.swing.*;

class Exam_05_sub extends JFrame{

    private Container con;
    private GridLayout gl = new GridLayout(2,2,5,5);
    private JCheckBox cb1 = new JCheckBox("1");
    private JCheckBox cb2 = new JCheckBox("2");
    private JCheckBox cb3 = new JCheckBox("3");
    private JCheckBox cb4 = new JCheckBox("4");

    private JRadioButton rb1 = new JRadioButton("1");
    private JRadioButton rb2 = new JRadioButton("2");
    private JRadioButton rb3 = new JRadioButton("3");
    private JRadioButton rb4 = new JRadioButton("4");

    private ButtonGroup bg = new ButtonGroup();
    private ButtonGroup bg1 = new ButtonGroup();

    public Exam_05_sub(){
        super("Poter");
        this.init();
        this.start();
        this.setSize(300, 300);
        this.setVisible(true);
    }

    private void init() {
        con = this.getContentPane();
        con.setLayout(gl);

        bg.add(rb1);
        bg.add(rb2);

        bg1.add(rb3);
        bg1.add(rb4);

//        con.add(cb1);
//        con.add(cb2);
//        con.add(cb3);
//        con.add(cb4);
//
//        con.add(rb1);
//        con.add(rb2);
//        con.add(rb3);
//        con.add(rb4);

    }

    private void start() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

public class Exam_05 {
    public static void main(String[] args) {
        Exam_05_sub es = new Exam_05_sub();
    }
}
