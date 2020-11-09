package day0925;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

public class MyShopping extends JFrame implements ActionListener {

    JButton btnInsert, btnUpdate, btnDelete;
    AddShop addFrame = new AddShop("add shop");
    UpdateShop updateFrame = new UpdateShop("update shop");
    ShoppingDao dao = new ShoppingDao();

    //테이블 때문에 사용.
    List lstShop;
    java.util.List<ShoppingDto> list = new ArrayList<>();

    JLabel lblNum, lblSangpum, lblPhoto, lblSu, lblDan, lblColor, lblIpgoday;
    Image photoImage;
    DrawPhoto drawPhoto;

    public MyShopping(String title) throws HeadlessException {
        super(title);
        this.setBounds(700, 100, 1000, 1000);
        this.getContentPane().setBackground(new Color(211, 255, 208));
        this.setDesign();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void setDesign() {
        this.setLayout(null);
        Point pntLabelPivot = new Point(180, 270);
        Point pntButtonPivot = new Point(10, 10);

        btnInsert = new JButton("AddShop");
        btnInsert.setBounds(pntButtonPivot.x, pntButtonPivot.y, 150, 30);
        btnInsert.addActionListener(this);

        addFrame.btnAdd.addActionListener(this);
        this.add(btnInsert);

        btnUpdate = new JButton("UpdateShop");
        btnUpdate.setBounds(pntButtonPivot.x + 170, pntButtonPivot.y, 150, 30);
        btnUpdate.addActionListener(this);

        updateFrame.btnUpdate.addActionListener(this);
        this.add(btnUpdate);

//        btnDelete = new JButton("DeleteShop");
//        btnDelete.setBounds(pntButtonPivot.x + 170 * 2, pntButtonPivot.y, 150, 30);
//        btnDelete.addActionListener(this);
//        this.add(btnDelete);

        lblSangpum = new JLabel("sangpum : xxxx");
        lblSangpum.setBounds(pntLabelPivot.x, pntLabelPivot.y, 200, 30);
        this.add(lblSangpum);

        lblPhoto = new JLabel("photo : xxxx");
        lblPhoto.setBounds(pntLabelPivot.x, pntLabelPivot.y += 40, 200, 30);
        this.add(lblPhoto);

        lblSu = new JLabel("su : xxxx");
        lblSu.setBounds(pntLabelPivot.x, pntLabelPivot.y += 40, 200, 30);
        this.add(lblSu);

        lblDan = new JLabel("dan : xxxx");
        lblDan.setBounds(pntLabelPivot.x, pntLabelPivot.y += 40, 200, 30);
        this.add(lblDan);

        lblColor = new JLabel("color : xxxx");
        lblColor.setBounds(pntLabelPivot.x, pntLabelPivot.y += 40, 200, 30);
        this.add(lblColor);

        lblIpgoday = new JLabel("ipgoday : xxxx");
        lblIpgoday.setBounds(pntLabelPivot.x, pntLabelPivot.y += 40, 200, 30);
        this.add(lblIpgoday);

        lstShop = new List();
        JScrollPane jsp = new JScrollPane(lstShop);
        jsp.setBounds(10, 270, 130, 300);
        this.add(jsp);
        this.writeShop();

        lstShop.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                int idx = lstShop.getSelectedIndex();
                ShoppingDto dto = list.get(idx);
                photoImage = new ImageIcon(dto.getPhoto()).getImage();
                drawPhoto.repaint();

                lblSangpum.setText("sangpum : " + dto.getSangpum());
//                lblPhoto.
            }
        });
    }

    private void writeShop() {
        lstShop.removeAll();
        list = dao.getAllDatas();
        for (ShoppingDto dto : list) {
            lstShop.add(dto.getSangpum());
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object ob = e.getSource();
        if (ob == btnInsert) {
            addFrame.setVisible(true);
        } else if (ob == btnUpdate) {
            int idx = lstShop.getSelectedIndex();
            if (idx == -1) {
                JOptionPane.showMessageDialog(this, "select name to update.");
                return;
            }

            ShoppingDto dto = list.get(idx);

            updateFrame.txtSangpum.setText(dto.getSangpum());
            updateFrame.lblPhoto.setText(dto.getPhoto());
            updateFrame.txtSu.setText(String.valueOf(dto.getSu()));
            updateFrame.txtDan.setText(String.valueOf(dto.getDan()));
            updateFrame.cbColor.setSelectedItem(dto.getPhoto());

            updateFrame.setVisible(true);

        } else if (ob == btnDelete) {

        } else if (ob == addFrame.btnAdd) {
            String sangpum = addFrame.txtSangpum.getText();
            String photo = addFrame.lblPhoto.getText();
            String su = addFrame.txtSu.getText();
            String dan = addFrame.txtDan.getText();
            String color = addFrame.cbColor.getSelectedItem().toString();

            if (sangpum.length() == 0 || photo.length() == 0 || su.length() == 0 || dan.length() == 0 || color.length() == 0) {
                JOptionPane.showMessageDialog(this, "please fill out all contents.");
                return;
            }

            ShoppingDto dto = new ShoppingDto();
            dto.setSangpum(sangpum);
            dto.setPhoto(photo);
            dto.setSu(Integer.parseInt(su));
            dto.setDan(Integer.parseInt(dan));
            dto.setColor(color);

            dao.shoppingInsert(dto);

            addFrame.txtSangpum.setText("");
            addFrame.lblPhoto.setText("");
            addFrame.txtSu.setText("");
            addFrame.txtDan.setText("");

            addFrame.setVisible(false);
            list = dao.getAllDatas();
            this.writeShop();
        } else if (ob == updateFrame.btnUpdate) {

            String sangpum = updateFrame.txtSangpum.getText();
            String photo = updateFrame.lblPhoto.getText();
            String su = updateFrame.txtSu.getText();
            String dan = updateFrame.txtDan.getText();
            String color = updateFrame.cbColor.getSelectedItem().toString();

            if (sangpum.length() == 0 || photo.length() == 0 || su.length() == 0 || dan.length() == 0 || color.length() == 0) {
                JOptionPane.showMessageDialog(this, "please fill out all contents.");
                return;
            }

            ShoppingDto dto = new ShoppingDto();
            dto.setSangpum(sangpum);
            dto.setPhoto(photo);
            dto.setSu(Integer.parseInt(su));
            dto.setDan(Integer.parseInt(dan));
            dto.setColor(color);

            dao.shoppingUpdate(dto);

            updateFrame.txtSangpum.setText("");
            updateFrame.lblPhoto.setText("");
            updateFrame.txtSu.setText("");
            updateFrame.txtDan.setText("");

            updateFrame.setVisible(false);

            list = dao.getAllDatas();
            this.writeShop();
        }
    }

    class DrawPhoto extends Canvas {
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            g.drawImage(photoImage, 180, 100, 200, 200, this);
        }
    }

    public static void main(String args[]) {
        MyShopping myShopping = new MyShopping("myShopping");

    }
}
