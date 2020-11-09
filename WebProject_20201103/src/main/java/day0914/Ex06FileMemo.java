package day0914;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class Ex06FileMemo extends JFrame implements ActionListener {

    JButton btnSave, btnOpen;
    String fileName;
    JTextArea area;

    public Ex06FileMemo(String title) throws HeadlessException {
        super(title);
        // TODO Auto-generated constructor stub
        this.setBounds(700, 100, 1000, 1000);
//		this.getContentPane().setBackground(new Color(211, 255, 208));
        this.getContentPane().setBackground(Color.white);
        this.setDesign();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        Object ob = e.getSource();
        if (ob == btnOpen) {
            FileDialog dlg = new FileDialog(this, "file Open", FileDialog.LOAD);
            dlg.setVisible(true);

            if (dlg.getDirectory() != null) {
                fileName = dlg.getDirectory() + dlg.getFile();
                FileReader fr = null;
                BufferedReader br = null;
                try {
                    fr = new FileReader(fileName);
                    br = new BufferedReader(fr);
                    area.setText("");
                    while (true) {
                        String line = br.readLine();
                        if (line == null || line.length() == 0) {
                            break;
                        }
                        area.append(line + "\n");
                    }
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

                    }
                }
            }
        } else if (ob == btnSave) {
            FileDialog dlg = new FileDialog(this, "fileSave", FileDialog.SAVE);
            dlg.setVisible(true);
            String dir = dlg.getDirectory();
            String file = dlg.getFile();
            if (dir != null) {
                fileName = dir + file;
                String content = area.getText();
                FileWriter fw = null;
                try {
                    fw = new FileWriter(fileName);
                    fw.write(content);
                    area.setText(fileName + "completed Save");
                } catch (IOException e1) {
                    e1.printStackTrace();
                } finally {
                    try {
                        fw.close();
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                }
            }
        }
    }

    public void setDesign() {
        this.setLayout(null);
        btnSave = new JButton("fileSave");
        btnSave.setBounds(50, 30, 100, 30);
        this.add(btnSave);
        btnOpen = new JButton("fileOpen");
        btnOpen.setBounds(170, 30, 100, 30);
        this.add(btnOpen);

        area = new JTextArea();
        JScrollPane jsp = new JScrollPane(area);
//	area.setBounds(10,70,350,250);
        jsp.setBounds(10, 70, 350, 250);
        this.add(jsp);

        btnSave.addActionListener(this);
        btnOpen.addActionListener(this);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new Ex06FileMemo("간단메모");
    }

}
