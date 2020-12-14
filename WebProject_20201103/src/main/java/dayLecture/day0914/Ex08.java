package dayLecture.day0914;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class Ex08 extends JFrame implements ActionListener {

    JTextField txtName, txtHp;
    JButton btnSave, btnOpen, btnDelete;
    JTextArea area;
    String path = "/Users/yang-mac/Desktop/java0901/info.txt";

    public Ex08(String title) throws HeadlessException {
        super(title);
        this.setBounds(700, 100, 1000, 1000);
        this.getContentPane().setBackground(Color.white);
        this.setDesign();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        Object ob = e.getSource();
        String name, hp;
        name = txtName.getText();
        hp = txtName.getText();
        System.out.println(name + "," + hp);

        if (ob == btnOpen) {
            openFile();
        } else if (ob == btnSave) {
            saveFile();
            openFile();
        } else if (ob == btnDelete) {
            deleteFile();
        }
    }

    public void deleteFile() {
        File file = new File(path);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("파일삭제 성공");


            } else {
                System.out.println("파일삭제 실패");
            }
        } else {
            System.out.println("파일이 존재하지 않습니다.");
        }
    }

    public void saveFile() {
        File file = new File(path);
        FileWriter fw = null;
        boolean isBefore = false;
        try {
            if (!file.exists()) {
                isBefore = true;
                System.out.println("파일이 존재하지 않습니다.");
            }

            fw = new FileWriter(file, true);

            if (isBefore) {
                fw.write(area.getText());
            }

            fw.write(txtName.getText() + "," + txtHp.getText() + "\n");
            System.out.println("파일을 확인하세요");
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

    public void openFile() {
        File file = new File(path);
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(file.getPath());
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

    public void setDesign() {
        this.setLayout(null);
        txtName = new JTextField();
        txtName.setBounds(30, 30, 80, 30);
        this.add(txtName);

        txtHp = new JTextField();
        txtHp.setBounds(130, 30, 80, 30);
        this.add(txtHp);

        btnSave = new JButton("Save");
        btnSave.setBounds(100, 80, 100, 30);
        this.add(btnSave);
        btnOpen = new JButton("Open");
        btnOpen.setBounds(220, 80, 100, 30);
        this.add(btnOpen);
        btnDelete = new JButton("Delete");
        btnDelete.setBounds(340, 80, 100, 30);
        this.add(btnDelete);

        area = new JTextArea();
        JScrollPane jsp = new JScrollPane(area);
        jsp.setBounds(30, 150, 300, 300);
        this.add(jsp);

        btnSave.addActionListener(this);
        btnOpen.addActionListener(this);
        btnDelete.addActionListener(this);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new Ex08("save/open/delete");
    }

}
