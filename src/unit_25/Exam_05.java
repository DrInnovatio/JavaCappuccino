package unit_25;

import java.awt.*;
import java.awt.event.*;
import java.util.Vector;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;
import java.util.*;

class Exam_05_sub extends JFrame implements ActionListener, Runnable{

    private JRootPane jrp;
    private Container con;
    private BorderLayout bl = new BorderLayout();
    private JButton bt = new JButton("Start");
    private Vector vc = new Vector();
    private JList li = new JList(vc);
    private JProgressBar jpb = new JProgressBar(SwingConstants.HORIZONTAL, 0, 100);
    private int fileLength = 4568;
    private Thread tt;

    public Exam_05_sub(){
        super("Test");
        this.init();
        this.start();
        this.setSize(300, 200);
        this.setVisible(true);
    }

    private void init() {
        jrp = this.getRootPane();
        con = jrp.getContentPane();
        con.setLayout(bl);
        JPanel jp = new JPanel(new BorderLayout(10, 10));
        jp.add("West", bt);
        //jpb.setBorderPainted(true); // true is default.
        jpb.setIndeterminate(true);
        //jpb.setString("50%");
        //jpb.setStringPainted(true);
        //jpb.setValue(34);
        jp.add("Center", jpb);
        con.add("North", jp);
        con.add("Center", li);

    }

    private void start() {
        bt.addActionListener(this);
    }

    public void run(){
        bt.setEnabled(false);
        vc.clear();
        int xx = 0;
        for(int i = 0; i <= fileLength; i++){
            jpb.setString((i * 100) / fileLength + "%");
            jpb.setValue((i * 100) / fileLength );
            if(xx != (i * 100) / fileLength){
                xx = (i * 100) / fileLength;
                vc.add(new String(xx + "% Total : " + fileLength + " byte" + i + "byte sent."));
                li.setListData(vc);
            }

            li.updateUI();
            try{
                Thread.sleep(10);
            } catch (InterruptedException e) {
//                e.printStackTrace();
            }
            bt.setEnabled(true);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == bt){
            tt = new Thread(this);
        }
    }

//    public void paint(Graphics g){
//        Graphics2D g2D = (Graphics2D)g;
//    }
}

public class Exam_05 {

    public static void main(String[] args) {
        Exam_05_sub runRun = new Exam_05_sub();
    }

}
