package dayLecture.day0911;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex05Button extends JFrame {
    Icon icon1 = new ImageIcon("/Users/yang-mac/Desktop/java0901/image/swingimage/img10.gif");
    Icon icon2 = new ImageIcon("/Users/yang-mac/Desktop/java0901/image/swingimage/LEFT.GIF");
    Icon icon3 = new ImageIcon("/Users/yang-mac/Desktop/java0901/image/swingimage/RIGHT.GIF");
    JButton btn1, btn2;
    JLabel lblMsg;

    public Ex05Button(String title) {
        super(title);
        // TODO Auto-generated constructor stub
        this.setBounds(700, 100, 300, 300);
        this.getContentPane().setBackground(Color.pink);
        this.setDesign();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void setDesign() {

        this.setLayout(null);
        btn1 = new JButton(icon2);
        btn1.setBounds(30, 50, 100, 100);
        this.add(btn1);
        btn2 = new JButton(icon3);
        btn2.setBounds(140, 50, 100, 100);
        this.add(btn2);

        //create Label
        lblMsg = new JLabel("Result", icon1, JLabel.CENTER);
        lblMsg.setBounds(20, 170, 250, 60);
//	lblMsg.setBorder(new TitledBorder("Result Area"));
        lblMsg.setBorder(new LineBorder(Color.red, 2));

        //opaque mode
        lblMsg.setOpaque(true);
        lblMsg.setBackground(Color.green);
        lblMsg.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 20));
        this.add(lblMsg);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                lblMsg.setText("Left Button Clicked!!");
            }
        });
        //버튼2 이벤트 (내부클래스)
        btn2.addActionListener(new MyButton());
    }

    class MyButton implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            lblMsg.setText("Right Button Clicked!!");
        }

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new Ex05Button("button");
    }

}
