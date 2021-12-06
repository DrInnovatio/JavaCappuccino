package Examples;

import javax.tools.Tool;
import java.awt.*;
import java.awt.event.*;


class Exam_03_sub extends Frame implements ActionListener{

    private GridLayout gl = new GridLayout(2,3,5,5);
    private String [] aa;
    private Button[] bt = new Button[6];

    public Exam_03_sub(String str, String[] str1){
        super(str);
        aa = str1;
        this.init();
        this.start();
        this.setSize(500, 200);

        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension di = tk.getScreenSize();
        Dimension di1 = this.getSize();

        this.setLocation((int)(di.getWidth() / 2 - di1.getWidth() / 2), (int)(di.getHeight() / 2 - di1.getHeight() / 2));
        this.setVisible(true);
    }

    private void init() {
        this.setLayout(gl);
        for(int i = 0; i < 6; i++){
            bt[i] = new Button(aa[i]);
            this.add(bt[i]);
        }
    }

    private void start() {
        for(int i = 0; i < 6; i++){
            bt[i].addActionListener(this);
        }
    }

    public void paint(Graphics g){

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Button temp = (Button)e.getSource();
        String strTemp = temp.getLabel();
        Runtime runtime = Runtime.getRuntime();
        try{
            runtime.exec("explorer.exe" + strTemp);
        }catch(java.io.IOException ee){}
    }
}

public class Exam_03 {

    public static void main(String[] args) {
        System.out.println("Parameters : " + args.length);
    }
}
