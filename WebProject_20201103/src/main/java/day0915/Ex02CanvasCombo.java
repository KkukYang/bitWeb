package day0915;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex02CanvasCombo extends JFrame implements ActionListener {

    String[] title = "선,원,사각형,이미지,문자열".split(",");
    JComboBox<String> combo;
    SelectDraw draw;
    int idx = 4;
    String imageName = "/Users/yang-mac/Desktop/java0901/image/cuteIcon/c7.png";
    Image image;
    Color fcolor;
    int x, y;

    public Ex02CanvasCombo(String title) throws HeadlessException {
        super(title);
        this.setBounds(700, 100, 1000, 1000);
        this.getContentPane().setBackground(Color.white);
        this.setDesign();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void changeColorAndPosition() {
        int r = (int) (Math.random() * 256);
        int g = (int) (Math.random() * 256);
        int b = (int) (Math.random() * 256);

        x = (int) (Math.random() * 300);
        y = (int) (Math.random() * 400);
        fcolor = new Color(r, g, b);
    }

    class SelectDraw extends Canvas {

        @Override
        public void paint(Graphics gp) {
            // TODO Auto-generated method stub
            super.paint(gp);

            switch (idx) {
                case 0:
                    for (int i = 1; i <= 30; i++) {
                        changeColorAndPosition();
                        gp.setColor(fcolor);
                        gp.drawLine(x, y, x + 200, y);
                    }
                    break;
                case 1:
                    for (int i = 1; i <= 30; i++) {
                        changeColorAndPosition();
                        gp.setColor(fcolor);
                        gp.fillOval(x, y, 50, 50);
                    }
                    break;
                case 2:
                    for (int i = 1; i <= 30; i++) {
                        changeColorAndPosition();
                        gp.setColor(fcolor);
                        gp.fillRect(x, y, 50, 50);
                    }
                    break;
                case 3:
                    image = new ImageIcon(imageName).getImage();
                    for (int i = 1; i <= 5; i++) {
                        changeColorAndPosition();
                        gp.drawImage(image, x, y, 200, 300, this);
                    }
                    break;
                case 4:
                    changeColorAndPosition();
                    gp.setColor(fcolor);
                    gp.setFont(new Font("Comic Sans MS", Font.BOLD, 22));
                    gp.drawString("Happy Day", x, y);
                    break;
            }
        }

    }

    public void setDesign() {
        this.setLayout(null);
        JLabel lbl = new JLabel("Select ComboBox");
        lbl.setBounds(10, 10, 150, 30);
        this.add(lbl);

        combo = new JComboBox<String>(title);
        combo.setSelectedIndex(idx);// init
        combo.setBounds(180, 10, 100, 30);
        this.add(combo);
        combo.addActionListener(this);// event

        // Canvas
        draw = new SelectDraw();
        draw.setBounds(0, 80, 1000, 1000);
        this.add(draw);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        idx = combo.getSelectedIndex();
        draw.repaint();
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new Ex02CanvasCombo("select Graphic");
    }

}
