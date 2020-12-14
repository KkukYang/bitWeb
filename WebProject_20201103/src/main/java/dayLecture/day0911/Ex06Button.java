package dayLecture.day0911;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex06Button extends JFrame implements ActionListener {

    JButton btn1, btn2, btn3;


    public Ex06Button(String title) throws HeadlessException {
        super(title);
        // TODO Auto-generated constructor stub
        this.setBounds(700, 100, 300, 300);
//	this.getContentPane().setBackground(Color.orange);
//	this.getContentPane().setBackground(new Color(211,255,208));
        this.setDesign();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void setDesign() {
        this.setLayout(null);
        btn1 = new JButton("button1");
        btn1.setBounds(30, 20, 100, 30);
        this.add(btn1);

        btn2 = new JButton("button2");
        btn2.setBounds(30, 70, 100, 30);
        this.add(btn2);

        btn3 = new JButton("button3");
        btn3.setBounds(30, 120, 100, 30);
        this.add(btn3);

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        Object ob = e.getSource();
        if (ob == btn1) {
            System.out.println("button1");
            this.getContentPane().setBackground(Color.magenta);
        } else if (ob == btn2) {
            System.out.println("button2");
            this.getContentPane().setBackground(Color.blue);
        } else {
            System.out.println("button3");
            this.getContentPane().setBackground(Color.orange);
        }

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new Ex06Button("button");
    }

}
