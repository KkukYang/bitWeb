package dayLecture.day0911;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex08ButtonArray extends JFrame implements ActionListener {
    JButton[] btn = new JButton[7];
    JLabel lblColor;
    String[] btnTitle = {"Red", "Blue", "Green", "Magenta", "Yellow", "Orange", "Pink"};
    Color[] color = {Color.red, Color.blue, Color.green, Color.magenta, Color.yellow, Color.orange, Color.pink};

    public Ex08ButtonArray(String title) throws HeadlessException {
        super(title);
        // TODO Auto-generated constructor stub
        this.setBounds(700, 100, 400, 400);
        this.getContentPane().setBackground(new Color(211, 255, 208));
        this.setDesign();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void setDesign() {
        int yPos = 20;
        this.setLayout(null);

        for (int i = 0; i < btn.length; i++) {
            btn[i] = new JButton(btnTitle[i]);
            btn[i].setBounds(20, yPos, 100, 30);
            btn[i].setForeground(color[i]);
            this.add(btn[i]);
            yPos += 40;
            final int idx = i;

            btn[i].addActionListener(this);
        }

        lblColor = new JLabel();
        lblColor.setBounds(150, 20, 210, 270);
        lblColor.setBorder(new LineBorder(Color.DARK_GRAY));
        lblColor.setOpaque(true);
        this.add(lblColor);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        Object ob = e.getSource();
        for (int i = 0; i < btn.length; i++) {
            if (ob == btn[i]) {
                lblColor.setBackground(color[i]);
            }
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new Ex08ButtonArray("button Array");
    }

}
