package unit_22;

import java.awt.*;
import java.awt.event.*;


class Exam_02_sub extends Frame {

    private Font font = new Font("Serif", Font.BOLD, 60); //fontFamilyName, fontStyle, fontSize
    private Button button = new Button("Hello");
    public Exam_02_sub(){
        super("Test");
        this.init();
        this.start();
        this.setSize(400, 300);
        this.setVisible(true);
        System.out.println("Family = " + font.getFamily());
        System.out.println("FontName = " + font.getFontName());
        System.out.println("Name = " + font.getName());
        System.out.println("PSName = " + font.getPSName());
        System.out.println("Size = " + font.getSize());
        System.out.println("Size2D = " + font.getSize2D());
        System.out.println("Style = " + font.getStyle());
    }

    private void init() {
        /**
        this.setLayout(new FlowLayout());
        button.setFont(font);
        this.add(button);
         **/

    }

    private void start() {

    }

    public void paint(Graphics g){
        Graphics2D g2D = (Graphics2D)g;
        /**
        font = font.deriveFont(10.0f);
        g2D.setFont(font);
        g2D.drawString("What's up!!", 100, 100);

        g2D.setFont(font);
        g2D.drawString("Hello", 100, 100);
        for(char ch = 120; ch < 130; ch++){
            if(font.canDisplay(ch)){
                g2D.drawString(ch + "(" + (int)ch + ") is available.",  50, 100);
            }
            else {
                g2D.drawString(ch + "(" + (int)ch + ") is NOT available.",  50, 100);
            }
            try{
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            g2D.clearRect(0,0,300,200);
        }

        g2D.setFont(Font.decode("Serif-BOLD-90")); //familyname-style-size
        g2D.drawString("Hello", 50, 200);
         **/


    }


}

public class Exam_02 {

    public static void main(String[] args) {
        Exam_02_sub ess = new Exam_02_sub();
    }

}
