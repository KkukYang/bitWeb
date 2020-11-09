package day0915;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileWriter;
import java.io.IOException;

public class Ex05File extends JFrame {
    DefaultTableModel model; // input table data
    JTable table; // table
    JTextField txtName, txtJava, txtSpring;// input text
    JButton btnAdd, btnDelete; // button
    final String fileName = "/Users/yang-mac/Desktop/java0901/sungjuk.txt";

    public Ex05File(String title) throws HeadlessException {
        super(title);
        this.setBounds(700, 100, 1000, 1000);
        this.getContentPane().setBackground(new Color(211, 255, 208));
        this.setDesign();
        this.writeData();
        this.setVisible(true);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                FileWriter fw = null;

                try {
                    fw = new FileWriter(fileName);
                    for (int i = 0; i < model.getRowCount(); i++) {
                        String line = "";
                        for (int j = 0; j < model.getColumnCount(); j++) {
                            line += model.getValueAt(i, j).toString() + ",";
                        }
                        line = line.substring(0, line.length() - 1);
                        fw.write(line + "\n");
                    }
                } catch (IOException e1) {
                    e1.printStackTrace();
                } finally {
                    try {
                        fw.close();
                    } catch (IOException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                }

                System.out.println("exit");
                System.exit(0);
            }

        });
    }

    public void setDesign() {

    }

    public void writeData() {

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
