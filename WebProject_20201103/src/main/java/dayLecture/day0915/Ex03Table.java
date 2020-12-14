package dayLecture.day0915;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ex03Table extends JFrame {
    JTable table;
    String[] title = "이름,나이,혈액형".split(",");
    String[][] data = {{"강호동1", "34세", "O형"}, {"강호동2", "35세", "a형"}, {"강호동3", "36세", "b형"},};

    JLabel lblSelect;

    public Ex03Table(String title) throws HeadlessException {
        super(title);
        this.setBounds(700, 100, 300, 300);
        this.getContentPane().setBackground(Color.white);
        this.setDesign();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void setDesign() {
        this.setLayout(null);
        table = new JTable(data, title);
        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(20, 20, 250, 100);
        this.add(jsp);

        lblSelect = new JLabel("result");
        lblSelect.setBounds(10, 170, 200, 50);
        this.add(lblSelect);

        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                int row = table.getSelectedRow();
                String name = table.getValueAt(row, 0).toString();
                String age = (String) table.getValueAt(row, 1);
                String blood = table.getValueAt(row, 2).toString();
                lblSelect.setText("Name:" + name + ",Age:" + age + ",Blood:" + blood);
                super.mouseClicked(e);
            }
        });
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new Ex03Table("table");
    }

}
