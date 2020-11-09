package day0909;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex13InnerFrame extends JFrame {

    public Ex13InnerFrame() {
        super("내부클래스 연습");
        this.setSize(400, 200);
        this.setLocation(500, 100);
        this.setVisible(true);

        this.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                // TODO Auto-generated method stub
                System.out.println("closing");
                System.exit(0);
            }

        });
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Ex13InnerFrame ex = new Ex13InnerFrame();
    }

}
