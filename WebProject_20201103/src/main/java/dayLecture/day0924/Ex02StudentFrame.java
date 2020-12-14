package dayLecture.day0924;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Ex02StudentFrame extends JFrame implements ActionListener {

    JButton btnInsert, btnUpdate, btnShowAllPhoto;
    AddStudent addFrame = new AddStudent("정보추가");
    UpdateStudent updateFrame = new UpdateStudent("정보수정");
    AllPhotoStudent allPhotoFrame = new AllPhotoStudent("모든 사진");
    StudentDao dao = new StudentDao();

    List lstNames;
    java.util.List<StudentDto> list = new ArrayList<StudentDto>();

    DrawPhoto drawPhoto = new DrawPhoto();
    JLabel lblName, lblHp, lblAddr, lblAge, lblWriteDay;
    Image photoImage;

    public Ex02StudentFrame(String title) throws HeadlessException {
        super(title);
        this.setBounds(700, 100, 700, 700);
        this.getContentPane().setBackground(new Color(211, 255, 208));
        this.setDesign();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void setDesign() {
        this.setLayout(null);

        lblName = new JLabel("name : xxxx");
        lblName.setBounds(180, 270, 200, 30);
        this.add(lblName);

        lblHp = new JLabel("hp : xxxx");
        lblHp.setBounds(180, 300, 200, 30);
        this.add(lblHp);

        lblAddr = new JLabel("addr : xxxx");
        lblAddr.setBounds(180, 330, 200, 30);
        this.add(lblAddr);

        lblAge = new JLabel("age : xxxx");
        lblAge.setBounds(180, 360, 200, 30);
        this.add(lblAge);

        lblWriteDay = new JLabel("WriteDay : xxxxxxxxxx", JLabel.CENTER);
        lblWriteDay.setBounds(150, 50, 250, 30);
        lblWriteDay.setBorder(new LineBorder(Color.gray, 2));
        this.add(lblWriteDay);

        btnInsert = new JButton("학생정보 추가");
        btnInsert.setBounds(10, 10, 130, 25);
        this.add(btnInsert);
        btnInsert.addActionListener(this);
        addFrame.btnAdd.addActionListener(this);

        btnUpdate = new JButton("학생정보수정");
        btnUpdate.setBounds(160, 10, 130, 25);
        this.add(btnUpdate);
        btnUpdate.addActionListener(this);
        updateFrame.btnUpdate.addActionListener(this);

        btnShowAllPhoto = new JButton("모든사진");
        btnShowAllPhoto.setBounds(310, 10, 130, 25);
        this.add(btnShowAllPhoto);
        btnShowAllPhoto.addActionListener(this);

        lstNames = new List();
        JScrollPane jsp = new JScrollPane(lstNames);
        jsp.setBounds(10, 100, 130, 300);
        this.add(jsp);
        this.writeNames();

        photoImage = new ImageIcon("/Users/yang-mac/Desktop/java0901/image/cuteIcon/c3.png").getImage();
        drawPhoto.setBounds(0, 0, 1000, 1000);
        this.add(drawPhoto);

        lstNames.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                // TODO Auto-generated method stub
                int idx = lstNames.getSelectedIndex();
                StudentDto dto = list.get(idx);
                photoImage = new ImageIcon(dto.getPhoto()).getImage();
                drawPhoto.repaint();

                lblName.setText("NAME : " + dto.getName());
                lblHp.setText("HP : " + dto.getHp());
                lblAddr.setText("ADDR : " + dto.getAddr());

                Calendar cal = Calendar.getInstance();
                int currYear = cal.get(Calendar.YEAR);
                int age = currYear - dto.getBirthyear();
                lblAge.setText("AGE : " + String.valueOf(age));

                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
                lblWriteDay.setText("WRITEDAY : " + sdf.format(dto.getWriteday()));

            }
        });

    }

    public void writeNames() {
        lstNames.removeAll();
        list = dao.getAlldatas();
        for (StudentDto dto : list) {
            lstNames.add(dto.getName());
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        Object ob = e.getSource();

        if (ob == btnInsert) {
            addFrame.setVisible(true);
        } else if (ob == btnShowAllPhoto) {
            allPhotoFrame.list = dao.getAlldatas();
            allPhotoFrame.setVisible(true);
        } else if (ob == addFrame.btnAdd) {
            String name = addFrame.txtName.getText();
            String photo = addFrame.lblPhoto.getText();
            String hp = addFrame.txtHp.getText();
            String addr = addFrame.txtAddr.getText();
            String birth = addFrame.cbBirth.getSelectedItem().toString();

            if (name.length() == 0 || photo.length() == 0 || hp.length() == 0 || addr.length() == 0) {
                JOptionPane.showMessageDialog(this, "please fill out all contents.");
                return;
            }

            StudentDto dto = new StudentDto();
            dto.setName(name);
            dto.setAddr(addr);
            dto.setHp(hp);
            dto.setPhoto(photo);
            dto.setBirthyear(Integer.parseInt(birth));

            dao.studentInsert(dto);

            addFrame.txtName.setText("");
            addFrame.txtHp.setText("");
            addFrame.txtAddr.setText("");
            addFrame.lblPhoto.setText("");

            addFrame.setVisible(false);

            list = dao.getAlldatas();
            writeNames();
        } else if (ob == btnUpdate) {
            int idx = lstNames.getSelectedIndex();
            if (idx == -1) {
                JOptionPane.showMessageDialog(this, "select name to update.");
                return;
            }

            StudentDto dto = list.get(idx);

            updateFrame.num = dto.getNum();
            updateFrame.txtName.setText(dto.getName());
            updateFrame.txtHp.setText(dto.getHp());
            updateFrame.txtAddr.setText(dto.getAddr());
            updateFrame.lblPhoto.setText(dto.getPhoto());
            updateFrame.cbBirth.setSelectedItem(dto.getBirthyear());

            updateFrame.setVisible(true);
        } else if (ob == updateFrame.btnUpdate) {
            StudentDto dto = new StudentDto();

            dto.setNum(updateFrame.num);
            dto.setName(updateFrame.txtName.getText());
            dto.setHp(updateFrame.txtHp.getText());
            dto.setAddr(updateFrame.txtAddr.getText());
            dto.setPhoto(updateFrame.lblPhoto.getText());
            dto.setBirthyear(Integer.parseInt(updateFrame.cbBirth.getSelectedItem().toString()));

            dao.studentUpdate(dto);

            updateFrame.setVisible(false);
            this.writeNames();

        }
    }

    class DrawPhoto extends Canvas {

        @Override
        public void paint(Graphics g) {
            // TODO Auto-generated method stub
            super.paint(g);
            g.drawImage(photoImage, 180, 100, 200, 200, this);
        }

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Date date = new Date();
        Calendar time = Calendar.getInstance();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        System.out.println(sdf.format(date));
        System.out.println(sdf.format(time.getTime()));
        System.out.println(sdf.format(System.currentTimeMillis()));

        System.out.println();
        Ex02StudentFrame ex = new Ex02StudentFrame("ex");
    }

}
