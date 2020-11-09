package day0909;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ex12InnerFrame extends JFrame {
    public Ex12InnerFrame() {
        super("inner class study");
        this.setLocation(600, 100);
        this.setSize(400, 200);
        this.setVisible(true);

        this.addWindowListener(new WindowListener() {

            @Override
            public void windowOpened(WindowEvent e) {
                // TODO Auto-generated method stub
                System.out.println("windowOpened");
            }

            @Override
            public void windowClosing(WindowEvent e) {
                // TODO Auto-generated method stub
                System.out.println("windowClosing");
            }

            @Override
            public void windowClosed(WindowEvent e) {
                // TODO Auto-generated method stub
                System.out.println("windowClosed");
            }

            @Override
            public void windowIconified(WindowEvent e) {
                // TODO Auto-generated method stub
                System.out.println("windowIconified");
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                // TODO Auto-generated method stub
                System.out.println("windowDeiconified");
            }

            @Override
            public void windowActivated(WindowEvent e) {
                // TODO Auto-generated method stub
                System.out.println("windowActivated");
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                // TODO Auto-generated method stub
                System.out.println("windowDeactivated");
            }

        });
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Ex12InnerFrame ex = new Ex12InnerFrame();
    }

}
