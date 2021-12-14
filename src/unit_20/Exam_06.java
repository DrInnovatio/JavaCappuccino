package unit_20;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

class Exam_06_sub extends JFrame implements MenuListener{

    private JMenuBar jMenuBar = new JMenuBar();
    private JMenu file = new JMenu("File");
    private JMenu help = new JMenu("Help");

    public Exam_06_sub(){
        super("Test");
        this.init();
        this.start();
        this.setSize(300, 200);
        this.setVisible(true);
    }

    private void init() {
        this.setJMenuBar(jMenuBar);
        file.setMnemonic('F');
        help.setMnemonic('H');
        jMenuBar.add(file);
        jMenuBar.add(help);

    }

    private void start() {
        file.addMenuListener(this);
    }


    @Override
    public void menuSelected(MenuEvent e) {
        if(e.getSource() == file){
            System.out.println("Selected");
        }
    }

    @Override
    public void menuDeselected(MenuEvent e) {
        if(e.getSource() == file){
            System.out.println("Deselected");
        }
    }

    @Override
    public void menuCanceled(MenuEvent e) {

    }
}

public class Exam_06 {

    public static void main(String[] args) {
        Exam_06_sub ess = new Exam_06_sub();
    }

}
