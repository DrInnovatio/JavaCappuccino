package unit_21;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.*;
import javax.swing.event.*;

class Exam_01_sub extends JFrame implements ActionListener {

    private MenuBar menuBar = new MenuBar();
    private Menu file = new Menu("File");
    private MenuShortcut menuShortcut = new MenuShortcut(KeyEvent.VK_E, true);
    private MenuItem fexit = new MenuItem("Exit");

    public Exam_01_sub(){
        super("Test");
        this.setBackground(SystemColor.menu);
        this.init();
        this.start();
        this.setSize(300, 200);
        this.setVisible(true);

        Insets insets = this.getInsets();

        System.out.println("blank = " + insets.toString());
        System.out.println("Top = " + insets.top);
        System.out.println("left = " + insets.left);
        System.out.println("right = " + insets.right);
        System.out.println("bottom = " + insets.bottom);
    }

    private void init() {
        this.setMenuBar(menuBar);
        menuBar.add(file);
        file.add(fexit);
        fexit.setShortcut(menuShortcut);
    }

    private void start() {
        fexit.addActionListener(this);
    }

    public void paint(Graphics g){

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == fexit){
            System.out.println(0);
        }
    }
}

public class Exam_01 {

    public static void main(String[] args) {
        Exam_01_sub ess = new Exam_01_sub();
    }

}
