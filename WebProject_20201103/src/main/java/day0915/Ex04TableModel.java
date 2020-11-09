package day0915;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;
import java.util.Vector;

public class Ex04TableModel extends JFrame {

    DefaultTableModel model;    //input table data
    JTable table;        //table
    JTextField txtName, txtJava, txtSpring;//input text
    JButton btnAdd, btnDelete;    //button

    String[] title = "Name,Java,Spring,Total,Average".split(",");
    final String fileName = "/Users/yang-mac/Desktop/java0901/sungjuk.txt";

    public Ex04TableModel(String title) throws HeadlessException {
        super(title);
        this.setBounds(700, 100, 1000, 1000);
        this.getContentPane().setBackground(new Color(211, 255, 208));
        this.setDesign();
        this.writeData();
        this.setVisible(true);
//	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //WindowListener 딸린 함수가 많아서 모두 정의 해야하지만 WindowAdapter는 필요한것만.
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // TODO Auto-generated method stub
                // file save
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
                super.windowClosing(e);
            }
        });


    }

    public void writeData() {
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(fileName);
            br = new BufferedReader(fr);
            while (true) {
                String line = br.readLine();
                if (line == null) {
                    break;
                }
                String[] data = line.split(",");
                model.addRow(data);
            }

        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(this, "nothing to load");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
                if (fr != null)
                    fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }

    public void setDesign() {
        this.setLayout(null);
        JLabel lbl1 = new JLabel("Name");
        lbl1.setBounds(10, 20, 50, 30);
        this.add(lbl1);

        txtName = new JTextField();
        txtName.setBounds(60, 20, 60, 30);
        this.add(txtName);

        JLabel lbl2 = new JLabel("Java");
        lbl2.setBounds(130, 20, 50, 30);
        this.add(lbl2);

        txtJava = new JTextField();
        txtJava.setBounds(160, 20, 60, 30);
        this.add(txtJava);

        JLabel lbl3 = new JLabel("Spring");
        lbl3.setBounds(230, 20, 50, 30);
        this.add(lbl3);

        txtSpring = new JTextField();
        txtSpring.setBounds(280, 20, 60, 30);
        this.add(txtSpring);

        btnAdd = new JButton("AddData");
        btnAdd.setBounds(30, 60, 100, 30);
        this.add(btnAdd);

        btnDelete = new JButton("DeleteData");
        btnDelete.setBounds(200, 60, 100, 30);
        this.add(btnDelete);

        model = new DefaultTableModel(title, 0);
        table = new JTable(model);
        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(20, 120, 350, 150);
        this.add(jsp);

        btnAdd.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                String name = txtName.getText();
                String java = txtJava.getText();
                String spring = txtSpring.getText();

                try {
                    int tot = Integer.parseInt(java) + Integer.parseInt(spring);
                    double avg = tot / 2.0;
                    // 전체데이터를 String 배열타입으로 만들기.
//		    String[] data = { name, java, spring, String.valueOf(tot), String.valueOf(avg) };

                    // vector type
                    Vector<String> data = new Vector<String>();
                    data.add(name);
                    data.add(java);
                    data.add(spring);
                    data.add(String.valueOf(tot));
                    data.add(String.valueOf(avg));
                    model.addRow(data);

                    txtName.setText("");
                    txtJava.setText("");
                    txtSpring.setText("");
                } catch (NumberFormatException e1) {
                    e1.printStackTrace();
                    JOptionPane.showMessageDialog(Ex04TableModel.this, "There is String in the score");
                    return;
                }

            }
        });

        btnDelete.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                int selectRow = table.getSelectedRow();
                System.out.println(selectRow);
                if (selectRow == -1) {
                    JOptionPane.showMessageDialog(Ex04TableModel.this, "select row for delete");
                } else {
                    model.removeRow(selectRow);
                }
            }
        });
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new Ex04TableModel("table data management");
    }

}
