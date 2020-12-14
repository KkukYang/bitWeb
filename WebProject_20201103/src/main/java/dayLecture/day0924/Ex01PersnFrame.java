package dayLecture.day0924;

import dayLecture.day0923.PersonDao;
import dayLecture.day0923.PersonDto;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Vector;

public class Ex01PersnFrame extends JFrame implements ActionListener {
    PersonDao dao = new PersonDao();
    JButton btnAdd, btnDel, btnUpdate, btnSearch, btnAll;
    JTextField txtBirth, txtName, txtJava, txtSpring, txtHeight;
    JComboBox<String> cbBlood;
    JTable table;
    DefaultTableModel model;

    public Ex01PersnFrame(String title) throws HeadlessException {
        super(title);
        this.setBounds(700, 100, 1000, 1000);
        this.getContentPane().setBackground(new Color(211, 255, 208));
        this.setDesign();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void setDesign() {
        this.setLayout(null);

        JLabel lbl1 = new JLabel("Name");
        lbl1.setBounds(10, 10, 50, 25);
        this.add(lbl1);

        txtName = new JTextField();
        txtName.setBounds(60, 10, 60, 25);
        this.add(txtName);

        JLabel lbl2 = new JLabel("Java");
        lbl2.setBounds(140, 10, 50, 25);
        this.add(lbl2);

        txtJava = new JTextField();
        txtJava.setBounds(190, 10, 60, 25);
        this.add(txtJava);

        JLabel lbl3 = new JLabel("Spring");
        lbl3.setBounds(270, 10, 50, 25);
        this.add(lbl3);

        txtSpring = new JTextField();
        txtSpring.setBounds(330, 10, 60, 25);
        this.add(txtSpring);

        JLabel lbl4 = new JLabel("Blood");
        lbl4.setBounds(10, 50, 50, 25);
        this.add(lbl4);

        String[] blood = "A,B,O,AB".split(",");
        cbBlood = new JComboBox<String>(blood);
        cbBlood.setBounds(60, 50, 60, 25);
        this.add(cbBlood);

        JLabel lbl5 = new JLabel("Height");
        lbl5.setBounds(140, 50, 50, 25);
        this.add(lbl5);

        txtHeight = new JTextField();
        txtHeight.setBounds(190, 50, 60, 25);
        this.add(txtHeight);

        JLabel lbl6 = new JLabel("Birth");
        lbl6.setBounds(270, 50, 60, 25);
        this.add(lbl6);

        txtBirth = new JTextField();
        txtBirth.setBounds(330, 50, 80, 25);
        this.add(txtBirth);

        btnAdd = new JButton("Add");
        btnAdd.setBounds(10, 100, 80, 30);
        this.add(btnAdd);

        btnDel = new JButton("Delete");
        btnDel.setBounds(100, 100, 80, 30);
        this.add(btnDel);

        btnUpdate = new JButton("Update");
        btnUpdate.setBounds(190, 100, 80, 30);
        this.add(btnUpdate);

        btnSearch = new JButton("Search");
        btnSearch.setBounds(280, 100, 80, 30);
        this.add(btnSearch);

        btnAll = new JButton("PrintAll");
        btnAll.setBounds(370, 100, 80, 30);
        this.add(btnAll);

        String[] title = "번호,이름,혈액형,자바,스프링,키,생년월".split(",");
        model = new DefaultTableModel(title, 0);
        table = new JTable(model);
        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(10, 160, 460, 290);
        this.add(jsp);
        writeTable();

        btnAdd.addActionListener(this);
        btnDel.addActionListener(this);
        btnUpdate.addActionListener(this);
        btnSearch.addActionListener(this);
        btnAll.addActionListener(this);

    }

    public void writeTable() {
        List<PersonDto> list = dao.getAllPersons();

        if (model.getRowCount() > 0) {
            System.out.println("table clear.");
            for (int i = 0; i < model.getRowCount(); i++) {
                model.removeRow(i);
            }
        }

        for (PersonDto dto : list) {

            Vector<String> data = new Vector<String>();
            data.add(String.valueOf(dto.getNum()));
            data.add(dto.getName());
            data.add(dto.getBlood());
            data.add(String.valueOf(dto.getJava()));
            data.add(String.valueOf(dto.getSpring()));
            data.add(String.valueOf(dto.getHeight()));
            data.add(String.valueOf(dto.getBirthday()));

            model.addRow(data);
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        Object ob = e.getSource();
        if (ob == btnAdd) {
            String name = txtName.getText();
            String java = txtJava.getText();
            String spring = txtSpring.getText();
            String height = txtHeight.getText();
            String birth = txtBirth.getText();
            String blood = cbBlood.getSelectedItem().toString().toLowerCase();
            if (name.length() == 0 || java.length() == 0 || spring.length() == 0 || height.length() == 0
                    || birth.length() == 0) {
                JOptionPane.showMessageDialog(this, "please fill over all textBox.");
                return;
            }

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date birthday = null;

            try {
                birthday = sdf.parse(birth);
            } catch (ParseException e1) {
                e1.printStackTrace();
            }

            PersonDto dto = new PersonDto();
            dto.setName(name);
            dto.setBlood(blood);
            dto.setJava(Integer.parseInt(java));
            dto.setSpring(Integer.parseInt(spring));
            dto.setHeight(Double.parseDouble(height));
            dto.setBirthday(birthday);

            dao.personInsert(dto);
            this.writeTable();

            txtName.setText("");
            txtJava.setText("");
            txtSpring.setText("");
            txtHeight.setText("");
            txtBirth.setText("");

        } else if (ob == btnDel) {
            String name = JOptionPane.showInputDialog("input name to delete.");
            System.out.println(name);
            int n = dao.personDelete(name);

            if (n == 0) {
                JOptionPane.showMessageDialog(this, name + " is not found.");
            } else {
                JOptionPane.showMessageDialog(this, name + " was deleted.");
                this.writeTable();
            }

        } else if (ob == btnUpdate) {
            String num = JOptionPane.showInputDialog("input number to update.");
            if (num == null) {//cancel button.
                return;
            }

            String name = JOptionPane.showInputDialog("input name to update.");
            String java = JOptionPane.showInputDialog("input java score to update.");
            String spring = JOptionPane.showInputDialog("input spring score to update.");
            String blood = JOptionPane.showInputDialog("input blood to update.");

            PersonDto dto = new PersonDto();
            dto.setNum(Integer.parseInt(num));
            dto.setName(name);
            dto.setBlood(blood);
            dto.setJava(Integer.parseInt(java));
            dto.setSpring(Integer.parseInt(spring));

            int n = dao.personUpdate(dto);

            if (n == 0) {
                JOptionPane.showMessageDialog(this, "not found.");
            } else {
                JOptionPane.showMessageDialog(this, "updated.");
                this.writeTable();
            }
        } else if (ob == btnSearch) {
            String blood = JOptionPane.showInputDialog("input blood to search");
            if (blood == null) {
                return;
            }

            List<PersonDto> list = dao.searchByBlood(blood);
            model.setRowCount(0);
            for (PersonDto dto : list) {
                String[] data = {
                        String.valueOf(dto.getNum())
                        , dto.getName(), dto.getBlood(), String.valueOf(dto.getJava())
                        , String.valueOf(dto.getSpring()), String.valueOf(dto.getHeight())
                        , String.valueOf(dto.getBirthday())
                };

                model.addRow(data);
            }
        } else if (ob == btnAll) {
            writeTable();
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Ex01PersnFrame ex = new Ex01PersnFrame("Person Manager");

    }

}
