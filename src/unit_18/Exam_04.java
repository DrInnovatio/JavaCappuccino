package unit_18;

import java.awt.*;
import java.awt.event.*;


class Exam_04_sub extends Frame implements ActionListener, WindowListener {

    private FlowLayout fl = new FlowLayout();
    private Button bt = new Button("Select");
    private Button bt1 = new Button("Cancel ");
    private List list = new List(3, false);
    private MenuBar mb = new MenuBar();
    private Menu file = new Menu("FILE");
    private MenuItem fexit = new MenuItem("Finish");
    private TextField tf =  new TextField(10);

    public Exam_04_sub(){
        super("Google");
        this.init();
        this.start();
        this.setSize(300, 200);
        this.setVisible(true);
    }

    public void init(){
        this.setMenuBar(mb);
        mb.add(file);
        file.add(fexit);
        this.setLayout(fl);
        this.add(bt);
        this.add(bt1);

        list.add("AAA");
        list.add("BBB");
        list.add("CCC");
        list.add("DDD");

        this.add(list);
        this.add(tf);
    }

    public void start(){
        this.addWindowListener(this);
        bt.addActionListener(this);
        bt1.addActionListener(this);
        list.addActionListener(this);
        fexit.addActionListener(this);
        tf.addActionListener(this);

    }

    public void paint(Graphics g){

    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == bt){
            System.out.println("Select clicked");
        }
        else if(e.getSource() == bt1){
            System.out.println("Cancel clicked");
        }else if(e.getSource() == list){
            String str = (String)list.getSelectedItem();
            System.out.println("The member chosen : " + str);
        }else if(e.getSource() == fexit){
            System.exit(0);
        }else if(e.getSource() == tf){
            String str = (String)tf.getText().trim();
            System.out.println("the Statement : " + str);
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}

public class Exam_04 {

    public static void main(String[] args) {
        Exam_04_sub exe = new Exam_04_sub();
    }
}
