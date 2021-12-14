package unit_20;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

class Exam_05_sub extends JFrame implements MenuDragMouseListener {

    private JMenuBar jMenuBar = new JMenuBar();
    private JMenu file = new JMenu("FILE");
    private JMenu help = new JMenu("HELP");
    private JMenuItem fnew = new JMenuItem("New File");
    private JMenuItem fopen = new JMenuItem("Open");
    private JMenuItem fsave = new JMenuItem("Save");
    private JMenuItem fexit = new JMenuItem("Quit");

    public Exam_05_sub(){
        super("Test");
        this.init();
        this.start();
        this.setSize(400, 300);
        this.setVisible(true);
    }

    private void init() {
        this.setJMenuBar(jMenuBar);
        jMenuBar.add(file);
        jMenuBar.add(help);
        file.add(fnew);
        file.addSeparator();
        file.add(fopen);
        file.add(fsave);
        file.add(fexit);
    }

    private void start() {
        fsave.addMenuDragMouseListener(this);
    }


    @Override
    public void menuDragMouseEntered(MenuDragMouseEvent e) {
        if(e.getSource() == fsave){
            System.out.println("Entered");
            MenuElement[]me = e.getPath();
            for(int i = 0; i < me.length; i++){
                System.out.println(me[i].getComponent());
            }
        }
    }

    @Override
    public void menuDragMouseExited(MenuDragMouseEvent e) {
        if(e.getSource() == fsave){
            System.out.println("Exited");
        }
    }

    @Override
    public void menuDragMouseDragged(MenuDragMouseEvent e) {
//        if(e.getSource() == fsave){
//            System.out.println("Dragged");
//        }
    }

    @Override
    public void menuDragMouseReleased(MenuDragMouseEvent e) {
        if(e.getSource() == fsave){
            System.out.println("Released");
    }
}

}
public class Exam_05 {

    public static void main(String[] args) {
        Exam_05_sub ess = new Exam_05_sub();
    }

}
