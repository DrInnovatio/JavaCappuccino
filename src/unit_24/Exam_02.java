package unit_24;


import java.awt.*;
import java.awt.event.*;

class Exam_02_sub extends Frame implements AdjustmentListener, ActionListener {

    private BorderLayout borderLayout = new BorderLayout();

    private Label label = new Label("RED  : ", Label.RIGHT);
    private Label label1 = new Label("Green  : ", Label.RIGHT);
    private Label label2 = new Label("Blue  : ", Label.RIGHT);

    private Scrollbar sb = new Scrollbar(Scrollbar.HORIZONTAL, 0, 5, 0, 260);
    private Scrollbar sb1 = new Scrollbar(Scrollbar.HORIZONTAL, 0, 5, 0, 260);
    private Scrollbar sb2 = new Scrollbar(Scrollbar.HORIZONTAL, 0, 5, 0, 260);

    private TextField textField = new TextField("0",5);
    private TextField textField1 = new TextField("0",5);
    private TextField textField2 = new TextField("0",5);

    private Label lblb = new Label();
    private Button button = new Button("Apply");

    public Exam_02_sub(){
        super("Test");
        this.init();
        this.start();
        //this.pack();
        this.setSize(400, 200);
        this.setVisible(true);
    }

    private void init() {
        this.setLayout(borderLayout);

        Panel panel = new Panel(new GridLayout(3, 1 ));
        panel.add(label);
        panel.add(label1);
        panel.add(label2);
        this.add("West", panel);

        Panel panel1 = new Panel(new GridLayout(3, 1));
        sb.setUnitIncrement(5);
        sb.setBlockIncrement(20);
        sb1.setUnitIncrement(5);
        sb1.setBlockIncrement(20);
        sb2.setUnitIncrement(5);
        sb2.setBlockIncrement(20);
        panel1.add(sb);
        panel1.add(sb1);
        panel1.add(sb2);
        this.add("Center", panel1);

        Panel panel2 = new Panel(new GridLayout(3, 1));
        textField.setEnabled(false);
        textField1.setEnabled(false);
        textField2.setEnabled(false);
        panel2.add(textField);
        panel2.add(textField1);
        panel2.add(textField2);
        this.add("East", panel2);

        Panel panel3 = new Panel(new BorderLayout());
        lblb.setBackground(new Color(0,0,0));
        panel3.add("Center", lblb);
        panel3.add("East", button);
        this.add("South", panel3);
    }

    private void start() {
        sb.addAdjustmentListener(this);
        sb1.addAdjustmentListener(this);
        sb2.addAdjustmentListener(this);
        button.addActionListener(this);
    }

    public void paint(Graphics g){
        Graphics2D g2D = (Graphics2D)g;
    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
        if(e.getSource() == sb){
            textField.setText(String.valueOf(sb.getValue()));
        }
        else if(e.getSource() == sb1){
            textField1.setText(String.valueOf(sb1.getValue()));

        }
        else if(e.getSource() == sb2){
            textField2.setText(String.valueOf(sb2.getValue()));
        }
        lblb.setBackground(new Color(sb.getValue(), sb1.getValue(), sb2.getValue()));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            lblb.setBackground(new Color(sb.getValue(), sb1.getValue(), sb2.getValue()));
        }
    }
}

public class Exam_02 {

    public static void main(String[] args) {
        Exam_02_sub ess = new Exam_02_sub();
    }

}
