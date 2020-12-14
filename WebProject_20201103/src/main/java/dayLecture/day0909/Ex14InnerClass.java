package dayLecture.day0909;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex14InnerClass extends JFrame {
    public Ex14InnerClass() {
        super("내부클래스 연습");
        this.setSize(400, 200);
        this.setLocation(500, 100);
        this.setVisible(true);
        this.addWindowListener(new WindowClose());
    }

    class WindowClose extends WindowAdapter {
        @Override
        public void windowClosing(WindowEvent e) {
            System.out.println("windowClosing");
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Ex14InnerClass ex = new Ex14InnerClass();
    }

}
