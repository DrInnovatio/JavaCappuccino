package unit_18;

import javafx.scene.layout.Pane;

import java.awt.*;
import java.awt.event.*;

class Exam_11_sub extends Frame implements ActionListener, FocusListener, KeyListener{

    private BorderLayout bl = new BorderLayout();
    private Label lb = new Label("Name : " + Label.RIGHT);
    private Label lb1 = new Label("ID number : " + Label.RIGHT);

    private TextField tf = new TextField();
    private TextField tf1 = new TextField();
    private TextField tf2 = new TextField();

    private Button bt = new Button("Check");
    private Button bt1 = new Button("Cancel");


    public Exam_11_sub(){
        super("Check the ID number");
        this.init();
        this.start();
        this.setSize(400, 300);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension di = tk.getScreenSize();
        Dimension di1 = this.getSize();
        this.setLocation((int)(di.getWidth() / 2 - di1.getWidth() / 2), (int)(di.getHeight() / 2 - di1.getHeight() / 2) );
        this.setVisible(true);
    }

    // Building the form.
    private void init() {
        this.setLayout(bl);
        Panel p = new Panel(new GridLayout(2,1 ));
        p.add(lb);
        p.add(lb1);
        this.add("West", p);
        Panel p1 = new Panel(new GridLayout(2,1 ));
        p1.add(tf);
        Panel p2 = new Panel(new GridLayout(1, 2, 5,5));
        p2.add(tf1);
        p2.add(tf2);
        p1.add(p2);
        this.add("Center", p1);
        Panel p3 = new Panel(new FlowLayout(FlowLayout.RIGHT));
        p3.add(bt);
        p3.add(bt1);
        this.add("South", p3);

    }

    private void start() {
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        tf1.addFocusListener(this);
        tf2.addFocusListener(this );
        tf1.addKeyListener(this);
        bt.addActionListener(this);
        tf2.addActionListener(this);
        bt1.addActionListener(this);
    }

    public void paint(Graphics g){

    }

    // Implemented Method
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == bt1){
            tf.setText("");
            tf1.setText("");
            tf2.setText("");
            tf.requestFocus();
        }
        else if(e.getSource() == bt || e.getSource() == tf2){
            //check the ID number
            int[] aa = new int[13];
            String str = tf1.getText().trim() + tf2.getText().trim();

            for(int i = 0; i < 13; i++){
                aa[i] = str.charAt(i) - 48;
            }
            float hap = 0.0f;
            float temp = 0.0f;
            float temp1 = 0.0f;
            float cre = 2.0f;
            for(int i = 0; i < 12; i++){
                if(cre == 10.0f){
                    cre = 2.0f;
                }
                hap += (aa[i] * cre);
                cre += 1.0f;
            }

            temp = 11.0f * (int)(hap / 11.0f) + 11.0f - hap;
            temp1 = temp - 10.0f * (int)(temp/10.0f);
            if(temp1 == aa[12]){
                System.out.println("Coprrect");
            }else {
                System.out.println("Wrong numbers.");
            }

        }
    }

    @Override
    public void focusGained(FocusEvent e) {
        if(e.getSource() == tf1){
            String str = tf.getText().trim();
            if(str.length() == 0){
                tf.requestFocus();
            }
        }
        else if(e.getSource() == tf2){
            String str = tf1.getText().trim();
            if (str.length() != 6) {
                tf1.setText("");
                tf1.requestFocus();


            }
        }
    }

    @Override
    public void focusLost(FocusEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getSource() == tf1){
            String str = tf1.getText().trim();
            if(str.length() == 6){
                tf2.requestFocus();
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getSource() == tf1){
            String str = tf1.getText().trim();
            if(str.length() == 6){
                tf2.requestFocus();
            }
        }
     }
}

public class Exam_11  {
    public static void main(String[] args) {
        Exam_11_sub es = new Exam_11_sub();
    }
}
