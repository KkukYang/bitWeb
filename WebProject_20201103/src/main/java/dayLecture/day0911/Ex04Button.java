package dayLecture.day0911;

import javax.swing.*;
import java.awt.*;

public class Ex04Button extends JFrame {
    Icon icon1 = new ImageIcon("/Users/yang-mac/Desktop/java0901/image/swingimage/img10.gif");
    Icon icon2 = new ImageIcon("/Users/yang-mac/Desktop/java0901/image/swingimage/ame9.gif");
    Icon icon3 = new ImageIcon("/Users/yang-mac/Desktop/java0901/image/swingimage/an07.gif");
    JButton btn1, btn2;

    public Ex04Button(String title) {
        super(title);
        // TODO Auto-generated constructor stub
        this.setBounds(700, 100, 300, 300);
        this.getContentPane().setBackground(Color.pink);
        this.setDesign();
        this.setVisible(true);
        ;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void setDesign() {
        btn1 = new JButton("My Button");
        this.add("North", btn1);

        btn2 = new JButton(icon1);
        btn2.setRolloverIcon(icon3);
        this.add(btn2, BorderLayout.SOUTH);

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Ex04Button ex = new Ex04Button("button study");
    }
}
