package unit_19;
import java.awt.*;
import javax.swing.*;

class Exam_02_sub extends JFrame{

    private JButton jb = new JButton("hoohoo");
    private JButton jb1 = new JButton("FooBar");
    private FlowLayout fl = new FlowLayout();
    private Container con;

    public Exam_02_sub(){
        super("Test");
        this.init();
        this.start();
        this.setSize(300, 300);
        this.setVisible(true);
        Dimension di =new Dimension();
        System.out.println(jb.getSize(di));
        System.out.println(di);
    }

    private void init() {
        con = this.getContentPane();
        con.setLayout(null);
        jb.reshape(50,50,100,100);
        jb.setBackground(Color.blue);
        //jb.setEnabled(false);
        jb.setForeground(Color.CYAN);
        jb.setFont(new Font(Font.SERIF, Font.BOLD, 20));
        jb.setOpaque(false);
        jb.setToolTipText("hahaha");
        con.add(jb);
        jb1.reshape(60, 60,100,100);
        jb1.setToolTipText("hooha~");
        con.add(jb1);
        jb.setText("AAA");
        jb.updateUI();
    }

    private void start() {
    }

}

public class Exam_02 {
    public static void main(String[] args) {
        Exam_02_sub es = new Exam_02_sub();
    }
}
