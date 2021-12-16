package unit_24;

import com.sun.xml.internal.ws.api.server.Adapter;

import javax.tools.Tool;
import java.awt.*;
import java.awt.event.*;

import static java.awt.AWTEvent.ACTION_EVENT_MASK;

class Exam_01_sub extends Frame implements AWTEventListener {

    private Button button = new Button("Check");
    private Button button1 = new Button("Cancel");

    public Exam_01_sub(){
        super("Test");
        this.init();
        this.start();
        this.setSize(300, 200);
        this.setVisible(true);
    }

    private void init() {
        this.setLayout(new FlowLayout());
        this.add(button);
        this.add(button1);
    }
    // 이벤트 추가는 주로 start() 에서 한다.
    private void start() {
        Toolkit tk = Toolkit.getDefaultToolkit();
        tk.addAWTEventListener(this, AWTEvent.ACTION_EVENT_MASK );
    }

    public void paint(Graphics g){
        Graphics2D g2D = (Graphics2D)g;
    }

// AWTEventListener
    @Override
    public void eventDispatched(AWTEvent event) {
        if(event.getSource() == button){
            System.out.println("Check clicked");
        }else if(event.getSource() == button1){
            System.out.println("Cancel clicked");
        }
    }
}

public class Exam_01 {

    public static void main(String[] args) {
        Exam_01_sub ess = new Exam_01_sub();
    }

}
