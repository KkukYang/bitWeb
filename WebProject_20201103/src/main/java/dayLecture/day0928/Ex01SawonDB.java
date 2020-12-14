package dayLecture.day0928;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Ex01SawonDB extends JFrame implements ActionListener {
    JTable table;
    DefaultTableModel model;
    JLabel lblTitle;

    List<SawonDto> list = new ArrayList<>();
    SawonDao dao = new SawonDao();

    JComboBox<String> cbSearch;
    JTextField txtSearch;
    JButton btnSearch;

    JButton btnAdd, btnDel, btnUpdate;

    AddSawon addFrame = new AddSawon("사원추가");
    UpdateSawon updateFrame = new UpdateSawon("정보수정");
//    String[] ddi = "원숭이,닭,개,돼지,쥐,소,호랑이,토끼,용,뱀,말,양".split(",");

//    int selectRow = -1;

    public Ex01SawonDB(String title) throws HeadlessException {
        super(title);
        this.setBounds(700, 100, 1000, 600);
        this.getContentPane().setBackground(new Color(211, 255, 208));
        this.setDesign();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void setDesign() {
        this.setLayout(null);

        String[] title = "번호,이름,띠,성별,부서,급여,세금,입사일,주민번호".split(",");
        model = new DefaultTableModel(title, 0);
        table = new JTable(model);
        JScrollPane sp = new JScrollPane(table);
        sp.setBounds(10, 120, 980, 400);
        this.add(sp);

        lblTitle = new JLabel("전체 사원 명단", JLabel.CENTER);
        lblTitle.setFont(new Font("", Font.BOLD, 20));
        lblTitle.setBorder(new LineBorder(Color.DARK_GRAY, 3));
        lblTitle.setBounds(120, 80, 300, 35);
        this.add(lblTitle);

        list = dao.getSearchList();
        this.writeTable();

        String[] s = "전체,이름검색,부서검색".split(",");
        cbSearch = new JComboBox<String>(s);
        cbSearch.setBounds(510, 80, 100, 30);
        this.add(cbSearch);

        txtSearch = new JTextField();
        txtSearch.setBounds(615, 80, 80, 30);
        this.add(txtSearch);

        btnSearch = new JButton("검색");
        btnSearch.setBounds(700, 80, 70, 30);
        this.add(btnSearch);

        btnSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int idx = cbSearch.getSelectedIndex();
                String col = (idx == 0) ? "all" : (idx == 1) ? "name" : "buseo";
                String search = txtSearch.getText();
                String title = (idx == 0) ? "전체 사원 명단" : (idx == 1) ? "이름 \"" + search + "\" 검색결과"
                        : "부서 \"" + search + "\" 검색결과";
                lblTitle.setText(title);
                list = dao.getSearchList(col, search);
                writeTable();
                txtSearch.setText("");
            }
        });

        btnAdd = new JButton("사원추가");
        btnAdd.setBounds(20, 20, 100, 30);
        this.add(btnAdd);

        btnDel = new JButton("사원삭제");
        btnDel.setBounds(140, 20, 100, 30);
        this.add(btnDel);

        btnUpdate = new JButton("사원수정");
        btnUpdate.setBounds(260, 20, 100, 30);
        this.add(btnUpdate);

        btnAdd.addActionListener(this);
        btnDel.addActionListener(this);
        btnUpdate.addActionListener(this);

        //insert , update frame button event setting.
        addFrame.btnInsert.addActionListener(this);
        updateFrame.btnUpdate.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object ob = e.getSource();

        if (ob == btnAdd) {
            addFrame.setVisible(true);
        } else if (ob == btnDel) {
            int idx = table.getSelectedRow();
            System.out.println("selectRow : " + idx);
            if (idx == -1) {
                JOptionPane.showMessageDialog(Ex01SawonDB.this, "select row for delete.");
                return;
            }

            String num = table.getValueAt(idx, 0).toString();
            dao.sawonDelete(num);

            list = dao.getSearchList();
            this.writeTable();
        } else if (ob == btnUpdate) {
            //Bring row index Number from selected cell.
            int idx = table.getSelectedRow();
            System.out.println("selectRow : " + idx);
            if (idx == -1) {
                JOptionPane.showMessageDialog(Ex01SawonDB.this, "select row for update.");
                return;
            }

            SawonDto dto = list.get(idx);

            //미리 채워넣기 하려고.
            updateFrame.num = Integer.parseInt(dto.getNum());
            updateFrame.txtName.setText(dto.getName());
            updateFrame.txtJumin.setText(dto.getJuminno());
            updateFrame.txtPay.setText(String.valueOf(dto.getPay()));
            updateFrame.lblPayTax.setText(String.valueOf(dto.getPaytax()));
            updateFrame.cbBuseo.setSelectedItem(dto.getBuseo());
            updateFrame.txtIpsa.setText(dto.getIpsaday());

            updateFrame.setVisible(true);

        } else if (ob == addFrame.btnInsert) {
            /*
            이름      널?       유형
            ------- -------- ------------
            NUM     NOT NULL NUMBER(5)
            NAME             VARCHAR2(30)
            BUSEO            VARCHAR2(20)
            PAY              NUMBER(10)
            PAYTAX           NUMBER(10)
            IPSADAY          DATE
            JUMINNO          VARCHAR2(30)
            */
            SawonDto dto = new SawonDto();
            dto.setName(addFrame.txtName.getText());
            dto.setBuseo(addFrame.cbBuseo.getSelectedItem().toString());
            dto.setPay(Integer.parseInt(addFrame.txtPay.getText()));
            dto.setPaytax(Integer.parseInt(addFrame.lblPayTax.getText()));
            dto.setIpsaday(addFrame.txtIpsa.getText());
            dto.setJuminno(addFrame.txtJumin.getText());
            dao.sawonInsert(dto);

            addFrame.txtName.setText("");
            addFrame.txtPay.setText("");
            addFrame.lblPayTax.setText("");
            addFrame.txtIpsa.setText("");
            addFrame.txtJumin.setText("");

            addFrame.setVisible(false);

            list = dao.getSearchList();
            this.writeTable();
        } else if (ob == updateFrame.btnUpdate) {
            SawonDto dto = new SawonDto();
            dto.setNum(String.valueOf(updateFrame.num));
            dto.setName(updateFrame.txtName.getText());
            dto.setBuseo(updateFrame.cbBuseo.getSelectedItem().toString());
            dto.setPay(Integer.parseInt(updateFrame.txtPay.getText()));
            dto.setPaytax(Integer.parseInt(updateFrame.lblPayTax.getText()));
            dto.setIpsaday(updateFrame.txtIpsa.getText());
            dto.setJuminno(updateFrame.txtJumin.getText());

            dao.sawonUpdate(dto);

            updateFrame.txtName.setText("");
            updateFrame.txtPay.setText("");
            updateFrame.lblPayTax.setText("");
            updateFrame.txtIpsa.setText("");
            updateFrame.txtJumin.setText("");

            updateFrame.setVisible(false);

            list = dao.getSearchList();
            this.writeTable();
        }
    }

    public void writeTable() {
        //현재 list에 담겨져 있는것만 출력.
        model.setRowCount(0);

        NumberFormat nf = NumberFormat.getCurrencyInstance();
        for (SawonDto dto : list) {
            Vector<String> data = new Vector<String>();
            data.add(dto.getNum());
            data.add(dto.getName());
            data.add(dto.getDdi());
            data.add(dto.getGender());
            data.add(dto.getBuseo());
            data.add(nf.format(dto.getPay()));
            data.add(nf.format(dto.getPaytax()));
            data.add(dto.getIpsaday());

            String jumin = dto.getJuminno().substring(0, 8) + "******";
            data.add(jumin);

            model.addRow(data);
        }
    }

    public static void main(String[] args) {
        Ex01SawonDB ex = new Ex01SawonDB("사원관리");
    }
}
