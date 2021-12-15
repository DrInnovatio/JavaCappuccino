package unit_21;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

class Exam_02_sub extends JFrame {

    public GridBagLayout gbl = new GridBagLayout();
    public Button button = new Button("1");
    public Button button1 = new Button("2");
    public Button button2 = new Button("3");
    public Button button3 = new Button("4");
    public Button button4 = new Button("5");


    public Exam_02_sub(){
        super("Test");
        this.init();
        this.start();
        this.setSize(300, 200);
        this.setVisible(true);
    }

    private void init() {
        this.setLayout(gbl);
        GridBagConstraints gbc = new GridBagConstraints(0,0,1,1,1.0,1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0,0,0,0),0,0);
        gbl.setConstraints(button, gbc);
        this.add(button);
        GridBagConstraints gbc1 = new GridBagConstraints(1,0,1,1,1.0,1.0, GridBagConstraints.CENTER,  GridBagConstraints.BOTH, new Insets(0,0,0,0),0,0);
        gbl.setConstraints(button1, gbc1);
        this.add(button1);
        GridBagConstraints gbc2 = new GridBagConstraints(0,1,1,1,1.0,1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0,0,0,0),0,0);
        gbl.setConstraints(button2, gbc2);
        this.add(button2);
        /**
        GridBagConstraints gbc3 = new GridBagConstraints(0,1,1,1,1.0,1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0,0,0,0),0,0);
        gbl.setConstraints(button3, gbc3);
        this.add(button3);
        GridBagConstraints gbc4 = new GridBagConstraints(0,1,1,1,1.0,1.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(0,0,0,0),0,0);
        gbl.setConstraints(button4, gbc4);
        this.add(button4);
         **/
    }

    private void start() {

    }


}

public class Exam_02 {

    public static void main(String[] args) {
        Exam_02_sub ess = new Exam_02_sub();
    }

}
