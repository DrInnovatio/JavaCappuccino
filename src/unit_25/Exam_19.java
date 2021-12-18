package unit_25;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;

class Exam_19_sub extends JFrame implements ActionListener {

    private JRootPane jrp;
    private Container con;
    private JButton jbt = new JButton();
    private Action ac;

    public Exam_19_sub(){
        super("Test");
        this.init();
        this.start();
        this.setSize(300, 200);
        this.setVisible(true);
    }

    private void init() {

        jrp = this.getRootPane();
        con = jrp.getContentPane();
        con.setLayout(new FlowLayout());
//        jbt.setText("Hello");
//        jbt.setMnemonic('H');
        ac = new ac("Test", new Integer(KeyEvent.VK_T));
        jbt.setAction(ac);
        con.add(jbt);


    }

    private void start() {
    }

    class ac extends AbstractAction {
        public ac(String str, Integer key){
            super(str);
            putValue(MNEMONIC_KEY, key);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("how are you?");

        }
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == jbt){
            System.out.println("g'day");
        }
    }
}

public class Exam_19 {

    public static void main(String[] args) {
        Exam_19_sub runRun = new Exam_19_sub();
    }

}
