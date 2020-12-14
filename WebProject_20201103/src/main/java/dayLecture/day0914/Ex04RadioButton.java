package dayLecture.day0914;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex04RadioButton extends JFrame {

    JRadioButton[] rb = new JRadioButton[5];
    String[] title = "1,2,3,4,5".split(",");
    JLabel lblmessage;
    RadioClick rdClick;
    Color[] fcolor = {Color.red, Color.blue, Color.magenta, Color.cyan, Color.yellow};

    JRadioButton[] rbSize = new JRadioButton[3];
    String[] sizeTitle = "Small,Medium,Big".split(",");
    int size = 15;

    public Ex04RadioButton(String title) throws HeadlessException {
        super(title);
        // TODO Auto-generated constructor stub
        this.setBounds(700, 100, 1000, 1000);
//	this.getContentPane().setBackground(new Color(211, 255, 208));
        this.getContentPane().setBackground(Color.white);
        this.setDesign();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void setDesign() {
        this.setLayout(null);
        int xPos = 30;
        ButtonGroup bg = new ButtonGroup();
        for (int i = 0; i < rb.length; i++) {
            rb[i] = new JRadioButton(title[i]);
            rb[i].setBounds(xPos, 50, 80, 30);
            rb[i].setOpaque(false);
            rb[i].addActionListener(new RadioClick());
            this.add(rb[i]);
            bg.add(rb[i]);
            xPos += 80;
        }

        ButtonGroup bg2 = new ButtonGroup();
        int xPos2 = 30;
        for (int i = 0; i < rbSize.length; i++) {
            rbSize[i] = new JRadioButton(sizeTitle[i], i == 1 ? true : false); // 0번인덱스 true로 지정.
            rbSize[i].setBounds(xPos2, 90, 120, 30);
            rbSize[i].addActionListener(new RadioClick2());
            rbSize[i].setOpaque(false);
            this.add(rbSize[i]);
            bg2.add(rbSize[i]);
            xPos2 += 130;
        }

        lblmessage = new JLabel("Have a Nice Day!!", JLabel.CENTER);
        lblmessage.setBorder(new LineBorder(Color.pink, 5));
        lblmessage.setForeground(fcolor[1]);
        lblmessage.setBounds(40, 150, 400, 60);
        this.add(lblmessage);

    }

    class RadioClick implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            Object ob = e.getSource();
            for (int i = 0; i < rb.length; i++) {
                if (ob == rb[i]) {
                    lblmessage.setForeground(fcolor[i]);
                }
            }
        }

    }

    class RadioClick2 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            Object ob = e.getSource();
            if (ob == rbSize[0]) {
                size = 10;
            } else if (ob == rbSize[1]) {
                size = 20;
            } else if (ob == rbSize[2]) {
                size = 30;
            }
            lblmessage.setFont(new Font("Comic Sans MS", Font.BOLD, size));
        }

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new Ex04RadioButton("RadioButotn");
    }

}
