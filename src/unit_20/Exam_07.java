package unit_20;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

class Exam_07_sub extends JFrame implements PopupMenuListener {

    private Container container;
    private String[] str = {"AAA", "BBB", "CCC", "EEE", "DDD"};
    private JComboBox jComboBox = new JComboBox(str);

    public Exam_07_sub(){
        super("Test");
        this.init();
        this.start();
        this.setSize(300, 200);
        this.setVisible(true);
    }

    private void init() {
        container = this.getContentPane();
        container.setLayout(new FlowLayout());
        jComboBox.setMaximumRowCount(3);
        jComboBox.setEditable(true);
        container.add(jComboBox);

    }

    private void start() {
        jComboBox.addPopupMenuListener(this);
    }


    @Override
    public void popupMenuWillBecomeVisible(PopupMenuEvent e) {
        if(e.getSource() == jComboBox){
            System.out.println("Popup became visible.");
        }
    }

    @Override
    public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {
        if(e.getSource() == jComboBox){
            System.out.println("Popup became hidden.");
        }
    }

    @Override
    public void popupMenuCanceled(PopupMenuEvent e) {

    }
}

public class Exam_07 {

    public static void main(String[] args) {
        Exam_07_sub ess = new Exam_07_sub();
    }

}
