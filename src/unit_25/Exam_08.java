package unit_25;

        import java.awt.*;
        import java.awt.event.*;
        import javax.swing.*;
        import javax.swing.border.*;
        import javax.swing.event.*;
        import javax.swing.plaf.basic.DefaultMenuLayout;

class Exam_08_sub extends JFrame {

    private JRootPane jrp;
    private JMenuBar jmb = new JMenuBar();
    private JMenu file = new JMenu("File");
    private JMenu edit = new JMenu("Edit");
    private JSeparator js = new JSeparator((SwingConstants.VERTICAL));
    private JMenu help = new JMenu("Help");
    private JMenuItem fnew = new JMenuItem("New");
    private JSeparator js1 = new JSeparator(SwingConstants.HORIZONTAL);
    private JMenuItem fexit = new JMenuItem("Exit");
    private Container con;
    private JToolBar jtb = new JToolBar(SwingConstants.HORIZONTAL);
    private JButton bt = new JButton("new");
    private JButton bt1 = new JButton("exit");
    private JToolBar.Separator jtbs = new JToolBar.Separator();


    public Exam_08_sub(){
        super("Test");
        this.init();
        this.start();
        this.setSize(300, 200);
        this.setVisible(true);
    }

    private void init() {
        jrp = this.getRootPane();
        jrp.setJMenuBar(jmb);
        jmb.add(file);
        file.add(fnew);
        file.add(js1);
        file.add(fexit);
        jmb.add(edit);
        jmb.add(js);
        jmb.add(help);
        con = jrp.getContentPane();
        con.setLayout(new BorderLayout());
        jtb.add(bt);
        jtbs.setSeparatorSize(new Dimension(30, 20));
        jtb.add(jtbs);
        jtb.add(bt1);
        con.add("North", jtb);

    }

    private void start() {

    }




}

public class Exam_08 {

    public static void main(String[] args) {
        Exam_08_sub runRun = new Exam_08_sub();
    }

}
