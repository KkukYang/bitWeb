package day0916;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class Ex01ScrollColor extends JFrame {

    JLabel lblRed, lblGreen, lblBlue, lblColor;
    JScrollBar sbRed, sbGreen, sbBlue;
    int red = 223, green = 196, blue = 219;

    public Ex01ScrollColor(String title) throws HeadlessException {
        super(title);
        this.setBounds(700, 100, 1000, 1000);
        this.getContentPane().setBackground(new Color(211, 255, 208));
        this.setDesign();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void setDesign() {
        this.setLayout(null);
        JLabel lbl1 = new JLabel("Red");
        lbl1.setBounds(10, 20, 40, 20);
        this.add(lbl1);
        JLabel lbl2 = new JLabel("Green");
        lbl2.setBounds(10, 100, 40, 20);
        this.add(lbl2);
        JLabel lbl3 = new JLabel("Blue");
        lbl3.setBounds(10, 180, 40, 20);
        this.add(lbl3);

        sbRed = new JScrollBar(JScrollBar.HORIZONTAL, red, 1, 0, 256);
        sbRed.setBounds(70, 20, 200, 20);
        this.add(sbRed);
        sbGreen = new JScrollBar(JScrollBar.HORIZONTAL, green, 1, 0, 256);
        sbGreen.setBounds(70, 100, 200, 20);
        this.add(sbGreen);
        sbBlue = new JScrollBar(JScrollBar.HORIZONTAL, blue, 1, 0, 256);
        sbBlue.setBounds(70, 180, 200, 20);
        this.add(sbBlue);

        lblRed = new JLabel(String.valueOf(red), JLabel.CENTER);
        lblRed.setBounds(280, 20, 40, 20);
        lblRed.setBorder(new LineBorder(Color.red));
        this.add(lblRed);
        lblGreen = new JLabel(String.valueOf(green), JLabel.CENTER);
        lblGreen.setBounds(280, 100, 40, 20);
        lblGreen.setBorder(new LineBorder(Color.green));
        this.add(lblGreen);
        lblBlue = new JLabel(String.valueOf(blue), JLabel.CENTER);
        lblBlue.setBounds(280, 180, 40, 20);
        lblBlue.setBorder(new LineBorder(Color.blue));
        this.add(lblBlue);

        lblColor = new JLabel();
        lblColor.setOpaque(true);
        lblColor.setBackground(new Color(red, green, blue));
        lblColor.setBounds(340, 20, 130, 180);
        this.add(lblColor);

        sbRed.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                // TODO Auto-generated method stub
                red = sbRed.getValue();
                lblRed.setText(String.valueOf(red));
                Color color = new Color(red, green, blue);
                lblColor.setBackground(color);
            }
        });
        sbGreen.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                // TODO Auto-generated method stub
                green = sbGreen.getValue();
                lblGreen.setText(String.valueOf(green));
                Color color = new Color(red, green, blue);
                lblColor.setBackground(color);
            }
        });
        sbBlue.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                // TODO Auto-generated method stub
                blue = sbBlue.getValue();
                lblBlue.setText(String.valueOf(blue));
                Color color = new Color(red, green, blue);
                lblColor.setBackground(color);
            }
        });

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new Ex01ScrollColor("color table");
    }

}
