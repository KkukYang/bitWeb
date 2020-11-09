package day0925;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpdateShop extends JFrame {
    JLabel lblPhoto;
    JButton btnUpdate, btnPhoto;
    JTextField txtSangpum, txtSu, txtDan;

    String[] strColor = "red,orange,yellow,green,blue,navy,purple,black,white".split(",");
    JComboBox<String> cbColor;

    public UpdateShop(String title) throws HeadlessException {
        super(title);
        this.setBounds(700, 100, 500, 500);
        this.getContentPane().setBackground(new Color(211, 255, 208));
        this.setDesign();
    }

    private void setDesign() {
        this.setLayout(null);

        btnUpdate = new JButton("UpdateShop");
        btnUpdate.setBounds(10, 10, 200, 30);
        this.add(btnUpdate);

        JLabel lbl2 = new JLabel("sangpum");
        lbl2.setBounds(30, 60, 100, 25);
        this.add(lbl2);

        JLabel lbl3 = new JLabel("su");
        lbl3.setBounds(30, 140, 100, 25);
        this.add(lbl3);

        JLabel lbl4 = new JLabel("dan");
        lbl4.setBounds(30, 180, 100, 25);
        this.add(lbl4);

        JLabel lbl5 = new JLabel("color");
        lbl5.setBounds(30, 220, 100, 25);
        this.add(lbl5);

        txtSangpum = new JTextField();
        txtSangpum.setBounds(130, 60, 100, 25);
        this.add(txtSangpum);

        btnPhoto = new JButton("Photo");
        btnPhoto.setBounds(30, 100, 70, 25);
        this.add(btnPhoto);

        btnPhoto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FileDialog dlg = new FileDialog(UpdateShop.this, "load photo", FileDialog.LOAD);
                dlg.setVisible(true);

                if (dlg.getDirectory() == null) {
                    return;
                }

                String fileName = dlg.getDirectory() + dlg.getFile();
                lblPhoto.setText(fileName);
            }
        });

        lblPhoto = new JLabel();
        lblPhoto.setBounds(130, 100, 200, 25);
        lblPhoto.setBorder(new LineBorder(Color.gray));
        this.add(lblPhoto);

        txtSu = new JTextField();
        txtSu.setBounds(130, 140, 70, 25);
        this.add(txtSu);

        txtDan = new JTextField();
        txtDan.setBounds(130, 180, 70, 25);
        this.add(txtDan);

        cbColor = new JComboBox<String>();
        for (String _color : strColor) {
            cbColor.addItem(_color);
        }
        cbColor.setBounds(130, 220, 100, 25);
        this.add(cbColor);


    }


}
