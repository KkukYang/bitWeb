package dayLecture.day0914;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex05RadioImage extends JFrame {

    JRadioButton[] rb = new JRadioButton[5];
    DrawImage draw = new DrawImage();
    String[] title = "김태희,딸기,산토리니,이나영,하지원".split(",");

    String imageName1 = "/Users/yang-mac/Desktop/java0901/image/star/31.JPG";
    String imageName2 = "/Users/yang-mac/Desktop/java0901/image/star/4.JPG";
    String imageName3 = "/Users/yang-mac/Desktop/java0901/image/star/26.JPG";
    String imageName4 = "/Users/yang-mac/Desktop/java0901/image/star/23.JPG";
    String imageName5 = "/Users/yang-mac/Desktop/java0901/image/star/24.JPG";

    Image image;

    public Ex05RadioImage(String title) throws HeadlessException {
        super(title);
        // TODO Auto-generated constructor stub
        this.setBounds(700, 100, 1000, 1000);
//	this.getContentPane().setBackground(new Color(211, 255, 208));
        this.getContentPane().setBackground(Color.white);
        this.setDesign();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    class DrawImage extends Canvas {

        @Override
        public void paint(Graphics g) {
            // TODO Auto-generated method stub
            super.paint(g);
            g.drawImage(image, 60, 30, 300, 400, this);
        }

    }

    public void setDesign() {
        this.setLayout(null);
        ;
        ButtonGroup bg = new ButtonGroup();
        int xPos = 20;
        for (int i = 0; i < rb.length; i++) {
            rb[i] = new JRadioButton(title[i], i == 2 ? true : false);
            rb[i].setBounds(xPos, 30, 80, 30);
            rb[i].setOpaque(false);
            this.add(rb[i]);
            bg.add(rb[i]);
            xPos += 80;
            final int idx = i;

            rb[i].addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub
                    switch (idx) {
                        case 0:
                            image = new ImageIcon(imageName1).getImage();
                            break;
                        case 1:
                            image = new ImageIcon(imageName2).getImage();
                            break;
                        case 2:
                            image = new ImageIcon(imageName3).getImage();
                            break;
                        case 3:
                            image = new ImageIcon(imageName4).getImage();
                            break;
                        case 4:
                            image = new ImageIcon(imageName5).getImage();
                            break;
                    }
                    draw.repaint();
                }
            });
        }

        image = new ImageIcon(imageName3).getImage();
        draw.setBounds(0, 100, 500, 500);
        this.add(draw);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new Ex05RadioImage("select image");
    }

}
