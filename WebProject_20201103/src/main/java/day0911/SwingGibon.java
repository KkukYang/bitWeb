package day0911;

import javax.swing.*;
import java.awt.*;

public class SwingGibon extends JFrame {
    Icon icon1 = new ImageIcon("/Users/yang-mac/Desktop/java0901/image/swingimage/img10.gif");
    Icon icon2 = new ImageIcon("/Users/yang-mac/Desktop/java0901/image/swingimage/ame9.gif");
    Icon icon3 = new ImageIcon("/Users/yang-mac/Desktop/java0901/image/swingimage/ame9.gif");
    JButton btn1, btn2;

    public SwingGibon(String title) {
        super(title);
        // TODO Auto-generated constructor stub
        this.setBounds(700, 100, 300, 300);
        this.getContentPane().setBackground(new Color(211, 255, 208));
        this.setDesign();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void setDesign() {
        btn1 = new JButton("My Button");
        this.add("North", btn1);

        btn2 = new JButton("My Button2");
        this.add(btn2, BorderLayout.SOUTH);

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Ex04Button ex = new Ex04Button("button study");
    }

}
