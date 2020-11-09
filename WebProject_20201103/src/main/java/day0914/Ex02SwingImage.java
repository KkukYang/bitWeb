package day0914;

import javax.swing.*;
import java.awt.*;

public class Ex02SwingImage extends JFrame {

    public Ex02SwingImage(String title) throws HeadlessException {
        super(title);
        // TODO Auto-generated constructor stub
        this.setBounds(700, 100, 1000, 1000);
        this.getContentPane().setBackground(new Color(211, 255, 208));
        this.setDesign();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics g) {
        // TODO Auto-generated method stub
        super.paint(g);
        System.out.println("paint");
        g.setColor(Color.magenta);
        g.drawOval(50, 50, 100, 150);
        g.fillOval(200, 50, 100, 150);

        g.setColor(Color.green);
        g.drawRect(50, 200, 100, 100);
        g.fillRect(200, 200, 100, 100);

        Image image1 = Toolkit.getDefaultToolkit().getImage("/Users/yang-mac/Desktop/java0901/image/shoppingMall/9.jpg");
        Image image2 = new ImageIcon("/Users/yang-mac/Desktop/java0901/image/star/1.JPG").getImage();

        g.drawImage(image1, 30, 350, 150, 150, this);
        g.drawImage(image2, 300, 500, 150, 150, this);
    }

    public void setDesign() {

    }

    public static void main(String args[]) {
        new Ex02SwingImage("output Image");
    }
}
