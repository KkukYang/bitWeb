package day0929;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex03ThreadCircle extends JFrame implements ActionListener {
    JButton btnStart, btnStop;
    boolean bStart = false;

    CircleDraw draw = new CircleDraw();

    public Ex03ThreadCircle(String title) throws HeadlessException {
        super(title);
        this.setBounds(700, 100, 700, 700);
        this.getContentPane().setBackground(new Color(255, 255, 255));
        this.setDesign();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void setDesign() {
        this.setLayout(null);

        btnStart = new JButton("Start");
        btnStart.setBounds(100, 20, 100, 30);
        btnStart.addActionListener(this);
        this.add(btnStart);

        btnStop = new JButton("Stop");
        btnStop.setBounds(300, 20, 100, 30);
        btnStop.addActionListener(this);
        this.add(btnStop);

        draw.setBounds(0, 60, 500, 400);
        this.add(draw);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object ob = e.getSource();

        Thread th = new Thread(draw);
        if (ob == btnStart) {
            bStart = true;
        } else if (ob == btnStop) {
            bStart = false;
        }
        th.start();
    }

    public class CircleDraw extends Canvas implements Runnable {
        int x, y;
        int red, green, blue;

        @Override
        public void run() {
            while (bStart) {
                x = (int) (Math.random() * 500);
                y = (int) (Math.random() * 500) + 50;
                red = (int) (Math.random() * 256);
                green = (int) (Math.random() * 256);
                blue = (int) (Math.random() * 256);

                this.paint(getGraphics());  //이전 원 안지워지도록.

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }

        @Override
        public void paint(Graphics g) {
            if (bStart) {
                g.setColor(new Color(red, green, blue));
                g.fillOval(x, y, 60, 60);

            }
        }
    }

    public static void main(String[] args) {
        Ex03ThreadCircle ex = new Ex03ThreadCircle("Thread Study");
    }
}
