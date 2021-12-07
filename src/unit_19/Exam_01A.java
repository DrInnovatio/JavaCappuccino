package unit_19;

import java.awt.*;
import javax.swing.*;

class ExamA_01_sub extends JFrame{

    private Container con;
    private JLabel jl = new JLabel("Amazon");
    private ImageIcon imageIcon, imageIcon1;

    public ExamA_01_sub(){
        super("Facebook");
        this.init();
        this.start();
        //this.setIconImage(imageIcon.getImage());
        this.setSize(500, 500);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension di = tk.getScreenSize();
        Dimension di1 = this.getSize();
        this.setLocation((int)(di.getWidth() / 2 - di1.getWidth() / 2), (int)(di.getHeight() / 2 - di1.getHeight() / 2) );
        this.setVisible(true);


    }
    public void init() {
        imageIcon = new ImageIcon("rose.gif");
        imageIcon1 = new ImageIcon("rose.gif");
        con = this.getContentPane();
        con.add("Center", jl);
        con.add("South", new JButton("Test1", imageIcon));
    }

    public void start() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class ExamA_01 {
    public static void main(String[] args) {
        ExamA_01_sub es = new ExamA_01_sub();
    }
}
