package unit_20;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

class Exam_04_sub extends JFrame implements ListSelectionListener  {

    private Container container;
    private String[] str = {"AAA", "BBB", "CCC", "DDD", "EEE"};
    private JList jList = new JList(str);
    private JScrollPane jScrollPane = new JScrollPane(jList);

    public Exam_04_sub(){
        super("Test");
        this.init();
        this.start();
        this.setSize(300, 200);
        this.setVisible(true);
    }

    private void init() {
        container = this.getContentPane();
        container.setLayout(new FlowLayout());
        jList.setVisibleRowCount(3);
        container.add(jScrollPane);

    }

    private void start() {
        jList.addListSelectionListener(this);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        if(e.getSource() == jList){
            System.out.println("the first value = : " + e.getFirstIndex());
            System.out.println("the last value = : " + e.getLastIndex());
            System.out.println("Adjusting = : " + e.getValueIsAdjusting());
            System.out.println("toString = : " + e.toString());
        }
    }
}

public class Exam_04 {

    public static void main(String[] args) {
        Exam_04_sub ess = new Exam_04_sub();
    }

}
