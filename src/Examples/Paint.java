package Examples;

import java.awt.*;
import java.awt.event.*;
import java.util.Vector;

class PaintInfo {
    public int x,y,x1,y1,dist;
}

class PaintSub extends Frame implements MouseListener, MouseMotionListener {

    private BorderLayout bl = new BorderLayout();
    private CheckboxGroup cg = new CheckboxGroup();
    private Checkbox cb = new Checkbox("Pencil", cg, true);
    private Checkbox cb1 = new Checkbox("StraightLine", cg, false);
    private Checkbox cb2 = new Checkbox("Rectangular", cg, false);
    private Checkbox cb3 = new Checkbox("Circle", cg, false);

    private int x,y,x1,y1;
    private Vector vc = new Vector();

    public PaintSub(String str){
        super(str);
        this.init();
        this.start();
        this.setSize(500, 500);

        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension di = tk.getScreenSize();
        Dimension di1 = this.getSize();
        this.setLocation((int)(di.getWidth() / 2 - di1.getWidth() / 2), (int)(di.getHeight() / 2 - di1.getHeight() / 2) );
        this.setVisible(true);
    }

    private void init() {
        this.setLayout(bl);
        Panel p = new Panel(new GridLayout(1,4,5,5));
        p.add(cb);
        p.add(cb1);
        p.add(cb2);
        p.add(cb3);
        this.add("South", p);
    }

    private void start() {
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }
/**
    public void update(Graphics g){
         paint(g);
    }
**/
    public void paint(Graphics g) {
        for (int i = 0; i < vc.size(); i++) {
            PaintInfo ei = (PaintInfo)vc.elementAt(i);
            if (ei.dist == 0) {
                g.drawLine(ei.x, ei.y, ei.x1, ei.y1);
            } else if (ei.dist == 1) {
                g.drawLine(ei.x, ei.y, ei.x1, ei.y1);
            } else if (ei.dist == 2) {
                g.drawRect(ei.x, ei.y, ei.x1 - ei.x, ei.y1 - ei.y);
            } else if (ei.dist == 3) {
                g.drawOval(ei.x, ei.y, ei.x1 - ei.x, ei.y1 - ei.y);
            }
        }
        if(cb1.getState()){
            g.drawLine(x, y, x1, y1);
        }
        else if(cb2.getState()){
            g.drawRect(x,y,x1 - x, y1 - y);
        }
        else if(cb3.getState()){
            g.drawOval(x,y,x1 - x, y1 - y);
        }
    }


    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        x = e.getX();
        y = e.getY();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        x1 = e.getX();
        y1 = e.getY();
        PaintInfo ei = new PaintInfo();
        ei.x = x;
        ei.y = y;
        ei.x1 = x1;
        ei.y1 = y1;
        if(cb.getState())
            ei.dist = 0;
        else if(cb1.getState())
            ei.dist = 1;
        else if(cb2.getState())
            ei.dist = 2;
        else if(cb3.getState())
            ei.dist = 3;
        vc.addElement(ei);
        repaint();
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

//MouseMotionListener
    @Override
    public void mouseDragged(MouseEvent e) {
        if(cb.getState()) {
            x1 = e.getX();
            y1 = e.getY();
            PaintInfo ei = new PaintInfo();
            ei.x = x;
            ei.y = y;
            ei.x1 = x1;
            ei.y1 = y1;
            ei.dist = 0;
            vc.addElement(ei);
            x = x1;
            y = y1;
            repaint();
        }
        else{
            x1 = e.getX();
            y1 = e.getY();
            repaint();
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}

public class Paint {

    public static void main(String[] args) {
        PaintSub es = new PaintSub("Paint");
    }
}
