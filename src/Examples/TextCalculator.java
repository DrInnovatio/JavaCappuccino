package Examples;

import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class TextCalculatorSub extends Frame implements ActionListener{

    private GridLayout gl = new GridLayout(5,1,2,2);

    private Label lb = new Label("Num 1 = ", Label.RIGHT);
    private Label lb1 = new Label("Num 2 = ", Label.RIGHT);
    private Label lb2 = new Label("RESULT = ", Label.RIGHT);

    private TextField tf = new TextField();
    private TextField tf1 = new TextField();
    private TextField tf2 = new TextField();

    private Button bt = new Button("+");
    private Button bt1 = new Button("-");
    private Button bt2 = new Button("*");
    private Button bt3 = new Button("/");
    private Button bt4 = new Button("Quit");

    public TextCalculatorSub(String str){
        super(str);
        this.init();
        this.start();
        this.setSize(200, 150);

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension di = toolkit.getScreenSize();
        Dimension di1 = this.getSize();

        this.setLocation((int)(di.getWidth() / 2 - di1.getWidth() / 2), (int)(di.getHeight() / 2 - di1.getHeight() / 2));
        this.setVisible(true);
    }

    public void init(){
        this.setLayout(gl);
        Panel p = new Panel(new BorderLayout());
        p.add("West", lb);
        p.add("Center", tf);
        this.add(p);
        Panel p1 = new Panel(new BorderLayout());
        p1.add("West", lb1);
        p1.add("Center", tf1);
        this.add(p1);
        Panel p2 = new Panel(new GridLayout(1, 4));
        p2.add(bt);
        p2.add(bt1);
        p2.add(bt2);
        p2.add(bt3);
        this.add(p2);
        Panel p3 = new Panel(new BorderLayout());
        p3.add("West", lb2);
        p3.add("Center", tf2);
        this.add(p3);
        Panel p4 = new Panel (new FlowLayout(FlowLayout.RIGHT));
        p4.add(bt4);
        this.add(p4);
    }

    public void start(){

        bt.addActionListener(this);
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        bt4.addActionListener(this);
    }

    public void paint(Graphics g){

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == bt){
            int x = 0;
            try{
                x = Integer.parseInt(tf.getText().trim());
            }catch (NumberFormatException ee){
                x = 0;
            }

            int y = 0;
            try{
                y = Integer.parseInt(tf1.getText().trim());
            }catch (NumberFormatException ee){
                y = 0;
            }
            tf2.setText(String.valueOf(x + y));
        }
        else if(e.getSource() == bt1) {
            int x = 0;
            try{
                x = Integer.parseInt(tf.getText().trim());
            }catch (NumberFormatException ee){
                x = 0;
            }

            int y = 0;
            try{
                y = Integer.parseInt(tf1.getText().trim());
            }catch (NumberFormatException ee){
                y = 0;
            }
            tf2.setText(String.valueOf(x - y));
        }
        else if(e.getSource() == bt2) {
            int x = 0;
            try{
                x = Integer.parseInt(tf.getText().trim());
            }catch (NumberFormatException ee){
                x = 0;
            }

            int y = 0;
            try{
                y = Integer.parseInt(tf1.getText().trim());
            }catch (NumberFormatException ee){
                y = 0;
            }
            tf2.setText(String.valueOf(x * y));
        }
        else if(e.getSource() == bt3) {
            int x = 0;
            try{
                x = Integer.parseInt(tf.getText().trim());
            }catch (NumberFormatException ee){
                x = 0;
            }

            int y = 0;
            try{
                y = Integer.parseInt(tf1.getText().trim());
            }catch (NumberFormatException ee){
                y = 0;
            }
            try{
                tf2.setText(String.valueOf(x / y));
            } catch (ArithmeticException ee){
                tf2.setText("0 is not available.");
            }
        }
        else if(e.getSource() == bt4){
            System.exit(0);
        }

    }
}

public class TextCalculator {
    public static void main(String[] args) {
        TextCalculatorSub exe = new TextCalculatorSub("Apple");
    }
}
