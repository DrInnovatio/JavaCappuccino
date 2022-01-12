package unit_19;


import java.awt.*;
import javax.swing.*;



class Exam_04_sub extends JFrame{

    private Container con;
    private GridLayout gl = new GridLayout(2,3,5,5);
    private JToggleButton tb = new JToggleButton("1", true);
    private JToggleButton tb1 = new JToggleButton("2", false);
    private JToggleButton tb2 = new JToggleButton("3", false);
    private JToggleButton tb3 = new JToggleButton("4", false);
    private ButtonGroup bg = new ButtonGroup();

    public Exam_04_sub(){
        super("Poter");
        this.init();
        this.start();
        this.setSize(300, 300);
        this.setVisible(true);
    }

    private void init() {
        con = this.getContentPane();
        con.setLayout(gl);
        bg.add(tb);
        bg.add(tb1);
        bg.add(tb2);
        bg.add(tb3);

        con.add(tb);
        con.add(tb1);
        con.add(tb2);
        con.add(tb3);

    }

    private void start() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

public class Exam_04 {
    public static void main(String[] args) {
        Exam_04_sub es = new Exam_04_sub();
    }
}
