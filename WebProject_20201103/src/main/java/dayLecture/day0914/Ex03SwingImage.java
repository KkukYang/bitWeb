package dayLecture.day0914;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex03SwingImage extends JFrame {
    String imageName1 = "/Users/yang-mac/Desktop/java0901/image/star/1.JPG";
    String imageName2 = "/Users/yang-mac/Desktop/java0901/image/star/2.JPG";
    String imageName3 = "/Users/yang-mac/Desktop/java0901/image/star/3.JPG";
    JButton btn1, btn2, btn3;
    Image image;
    MyImage myImage;

    public Ex03SwingImage(String title) throws HeadlessException {
        super(title);
        // TODO Auto-generated constructor stub
        this.setBounds(700, 100, 1000, 1000);
        this.getContentPane().setBackground(new Color(211, 255, 208));
        this.setDesign();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void setDesign() {
        this.setLayout(null);
        btn1 = new JButton("11111");
        btn1.setBounds(20, 20, 100, 30);
        this.add(btn1);

        btn2 = new JButton("22222");
        btn2.setBounds(140, 20, 100, 30);
        this.add(btn2);
        btn3 = new JButton("33333");
        btn3.setBounds(260, 20, 100, 30);
        this.add(btn3);

        image = new ImageIcon(imageName1).getImage();

        myImage = new MyImage();
        myImage.setBounds(0, 60, 500, 500);
        this.add(myImage);

        btn1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                image = new ImageIcon(imageName1).getImage();
                myImage.repaint();
            }
        });
        btn2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                image = new ImageIcon(imageName2).getImage();
                myImage.repaint();
            }
        });
        btn3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                image = new ImageIcon(imageName3).getImage();
                myImage.repaint();
            }
        });

    }

    class MyImage extends Canvas {
        @Override
        public void setBounds(int x, int y, int width, int height) {
            // TODO Auto-generated method stub
            super.setBounds(x, y, width, height);
        }

        @Override
        public void paint(Graphics g) {
            // TODO Auto-generated method stub
            super.paint(g);
            System.out.println("paint");
            g.drawImage(image, 20, 20, 300, 400, this);
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new Ex03SwingImage("changeImage");
    }

}
