package dayLecture.day0924;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class AllPhotoStudent extends JFrame {
    public java.util.List<StudentDto> list = new ArrayList<StudentDto>();
    //    java.util.List<Image> imageList = new ArrayList<Image>();
    DrawPhoto drawPhoto = new DrawPhoto();

    public AllPhotoStudent(String title) throws HeadlessException {
        super(title);
        this.setBounds(700, 100, 1000, 1000);
        this.getContentPane().setBackground(new Color(178, 255, 173));
        this.setDesign();
//	this.setVisible(true);
//	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                super.windowOpened(e);
                drawPhoto.repaint();
            }
        });

        this.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                drawPhoto.repaint();
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

    }

    public void setDesign() {
        this.setLayout(null);

        list.clear();
        drawPhoto.setBounds(0, 0, 700, 1000);
        JScrollPane sp = new JScrollPane(drawPhoto);
        sp.setBounds(0, 0, 800, 800);
        this.add(sp);

    }

    class DrawPhoto extends Canvas {
        @Override
        public void paint(Graphics g) {
            super.paint(g);

            for (int i = 0; i < list.size(); i++) {
                Image tempImage;
                tempImage = new ImageIcon(list.get(i).getPhoto()).getImage();
                g.drawImage(tempImage, (i % 3) * 200, (i / 3) * 200, 200, 200, this);
                g.drawRect((i % 3) * 200, (i / 3) * 200, 200, 200);
            }
        }
    }

//    public static void main(String[] args) {
//	// TODO Auto-generated method stub
//	AddStudent add = new AddStudent("add");
//    }

}
