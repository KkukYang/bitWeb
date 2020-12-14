package dayLecture.day0914;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex01Button extends JFrame implements ActionListener {
    JTextField txtNum1, txtNum2;
    JButton[] btn = new JButton[4];
    String[] title = {"+", "-", "*", "/"};
    JLabel lblResult;

    public Ex01Button(String title) throws HeadlessException {
        super(title);
        // TODO Auto-generated constructor stub
        this.setBounds(700, 100, 300, 300);
        this.getContentPane().setBackground(new Color(211, 255, 208));
        this.setDesign();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object ob = e.getSource();
        String n1, n2;
        n1 = txtNum1.getText();
        n2 = txtNum2.getText();
        System.out.println(n1 + "," + n2);
        try {
            int num1 = Integer.parseInt(n1);
            int num2 = Integer.parseInt(n2);
            String msg = "";
            if (ob == btn[0]) {
                msg = num1 + " + " + num2 + "=" + (num1 + num2);
            } else if (ob == btn[1]) {
                msg = num1 + " - " + num2 + "=" + (num1 - num2);
            } else if (ob == btn[2]) {
                msg = num1 + " * " + num2 + "=" + (num1 * num2);
            } else if (ob == btn[3]) {
                msg = num1 + " / " + num2 + "=" + ((double) num1 / num2);
            }
            lblResult.setText(msg);
            txtNum1.setText("");
            txtNum2.setText("");

        } catch (NumberFormatException e1) {
            JOptionPane.showMessageDialog(this, "input Number : " + e1.getMessage());
        }
    }

    public void setDesign() {
        this.setLayout(null);
        txtNum1 = new JTextField();
        txtNum1.setBounds(30, 30, 80, 30);
        this.add(txtNum1);

        txtNum2 = new JTextField();
        txtNum2.setBounds(130, 30, 80, 30);
        this.add(txtNum2);

        int xPos = 10;
        for (int i = 0; i < btn.length; i++) {
            btn[i] = new JButton(title[i]);
            btn[i].setBounds(xPos, 80, 60, 30);
            this.add(btn[i]);
            xPos += 70;
            btn[i].addActionListener(this);
        }

        lblResult = new JLabel();
        lblResult.setBorder(new TitledBorder("Result"));
        lblResult.setBounds(30, 150, 230, 60);
        this.add(lblResult);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new Ex01Button("asdf");
    }

}
