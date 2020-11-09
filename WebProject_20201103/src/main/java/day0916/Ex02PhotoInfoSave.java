package day0916;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class Ex02PhotoInfoSave extends JFrame implements ActionListener {
    MyPhoto myPhoto;
    JButton btnPhoto, btnSave, btnOpen;
    JTextField txtName, txtAge;
    JComboBox<String> comboBlood;
    Image photoImage;
    String imageName;

    public Ex02PhotoInfoSave(String title) throws HeadlessException {
        super(title);
        this.setBounds(700, 100, 1000, 1000);
        this.getContentPane().setBackground(new Color(211, 255, 208));
        this.setDesign();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    class MyPhoto extends Canvas {

        @Override
        public void paint(Graphics g) {
            // TODO Auto-generated method stub
            super.paint(g);
            g.drawImage(photoImage, 10, 2, 110, 130, this);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        Object ob = e.getSource();
        if (ob == btnPhoto) {
            FileDialog dlg = new FileDialog(this, "load Photo", FileDialog.LOAD);
            dlg.setVisible(true);
            if (dlg.getDirectory() != null) {
                imageName = dlg.getDirectory() + dlg.getFile();
                photoImage = new ImageIcon(imageName).getImage();
                myPhoto.repaint();
            }
        } else if (ob == btnSave) {
            String name = txtName.getText().trim();
            String blood = comboBlood.getSelectedItem().toString();
            String age = txtAge.getText();

            if (name.length() == 0) {
                JOptionPane.showMessageDialog(this, "input name");
                txtName.requestFocus();
                return;
            }
            if (age.length() == 0) {
                JOptionPane.showMessageDialog(this, "input age");
                txtAge.requestFocus();
                return;
            }

            FileWriter fw = null;
            try {
                fw = new FileWriter("/Users/yang-mac/Desktop/java0901/" + name + ".txt");
                fw.write(imageName + "\n");
                fw.write(name + "\n");
                fw.write(blood + "\n");
                fw.write(age + "\n");
            } catch (IOException e1) {
                e1.printStackTrace();
            } finally {
                try {
                    fw.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
            photoImage = new ImageIcon("/Users/yang-mac/Desktop/java0901/image/cuteIcon/c1.png").getImage();
            myPhoto.repaint();
            txtName.setText("");
            txtAge.setText("");
            comboBlood.setSelectedIndex(0);

        } else if (ob == btnOpen) {
            FileReader fr = null;
            BufferedReader br = null;
            FileDialog dlg = new FileDialog(this, "open file", FileDialog.LOAD);
            dlg.setVisible(true);
            if (dlg.getDirectory() != null) {
                String fileName = dlg.getDirectory() + dlg.getFile();
                try {
                    fr = new FileReader(fileName);
                    br = new BufferedReader(fr);
                    imageName = br.readLine();
                    photoImage = new ImageIcon(imageName).getImage();
                    myPhoto.repaint();

                    String name = br.readLine();
                    txtName.setText(name);

                    String blood = br.readLine();
                    comboBlood.setSelectedItem(blood);

                    String age = br.readLine();
                    txtAge.setText(age);

                } catch (FileNotFoundException e1) {
                    e1.printStackTrace();
                } catch (IOException e1) {
                    e1.printStackTrace();
                } finally {
                    try {
                        if (br != null)
                            br.close();
                        if (fr != null)
                            fr.close();
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                }

            }
        }
    }

    public void setDesign() {
        this.setLayout(null);
        btnPhoto = new JButton("load photo");
        btnPhoto.setBounds(20, 20, 120, 25);
        this.add(btnPhoto);
        btnPhoto.addActionListener(this);

        photoImage = new ImageIcon("/Users/yang-mac/Desktop/java0901/image/cuteIcon/c1.png").getImage();
        myPhoto = new MyPhoto();
        myPhoto.setBounds(20, 50, 120, 150);
        this.add(myPhoto);

        JLabel lbl1 = new JLabel("name");
        lbl1.setBounds(190, 30, 50, 25);
        this.add(lbl1);

        JLabel lbl2 = new JLabel("blood");
        lbl2.setBounds(190, 80, 50, 25);
        this.add(lbl2);

        JLabel lbl3 = new JLabel("age");
        lbl3.setBounds(190, 130, 50, 25);
        this.add(lbl3);

        txtName = new JTextField();
        txtName.setBounds(260, 30, 60, 25);
        this.add(txtName);

        String[] blood = "A,B,O,AB".split(",");
        comboBlood = new JComboBox<String>(blood);
        comboBlood.setBounds(260, 80, 80, 25);
        this.add(comboBlood);

        txtAge = new JTextField();
        txtAge.setBounds(260, 130, 60, 25);
        this.add(txtAge);

        btnSave = new JButton("Save");
        btnSave.setBounds(50, 230, 130, 50);
        btnSave.setBackground(Color.red);
        btnSave.setForeground(Color.yellow);
//	btnSave.setBorderPainted(false);
//	btnSave.setOpaque(true);
        btnSave.addActionListener(this);
        this.add(btnSave);

        btnOpen = new JButton("Load");
        btnOpen.setBounds(200, 230, 130, 50);
        btnOpen.setBackground(Color.orange);
        btnOpen.setForeground(Color.blue);
        btnOpen.addActionListener(this);
        this.add(btnOpen);

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new Ex02PhotoInfoSave("manage costomer");
    }

}
