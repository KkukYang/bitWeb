package dayLecture.day0928;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class UpdateSawon extends JFrame {
    JTextField txtName, txtJumin, txtIpsa, txtPay;
    JComboBox<String> cbBuseo;
    JButton btnUpdate;
    JLabel lblPayTax;

    int num = -1;
//    SawonDto dto = null;

    public UpdateSawon(String title) throws HeadlessException {
        super(title);
        this.setBounds(900, 100, 500, 350);
        this.getContentPane().setBackground(new Color(62, 144, 55));
        this.setDesign();

//        this.setVisible(true);
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void setDesign() {
        this.setLayout(null);

        JLabel lbl1 = new JLabel("Name");
        lbl1.setBounds(30, 20, 50, 30);
        this.add(lbl1);

        JLabel lbl2 = new JLabel("Buseo");
        lbl2.setBounds(30, 60, 50, 30);
        this.add(lbl2);

        JLabel lbl3 = new JLabel("Jumin No");
        lbl3.setBounds(30, 100, 80, 30);
        this.add(lbl3);

        JLabel lbl4 = new JLabel("Ipsaday");
        lbl4.setBounds(30, 140, 80, 30);
        this.add(lbl4);

        JLabel lbl5 = new JLabel("Pay");
        lbl5.setBounds(30, 180, 100, 30);
        this.add(lbl5);

        JLabel lbl6 = new JLabel("Paytax");
        lbl6.setBounds(30, 220, 100, 30);
        this.add(lbl6);

        txtName = new JTextField();
        txtName.setBounds(150, 20, 200, 30);
        this.add(txtName);

        String[] buseo = "교육부,홍보수,관리부".split(",");
        cbBuseo = new JComboBox<String>(buseo);
        cbBuseo.setBounds(150, 60, 200, 30);
        this.add(cbBuseo);

        txtJumin = new JTextField();
        txtJumin.setBounds(150, 100, 200, 25);
        this.add(txtJumin);

        txtIpsa = new JTextField();
        txtIpsa.setBounds(150, 140, 200, 25);
        this.add(txtIpsa);

        txtPay = new JTextField();
        txtPay.setBounds(150, 180, 200, 25);
        this.add(txtPay);

        //When i enter the pay, the value is automatically entered in payTax after calculation.
        txtPay.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                String pay = txtPay.getText();
                try {
                    int tax = (int) (Integer.parseInt(pay) * 0.03);
                    lblPayTax.setText(String.valueOf(tax));
                } catch (NumberFormatException e1) {
                    txtPay.setText("");
                    lblPayTax.setText("0");
//                    e1.printStackTrace();
                }
            }
        });

        lblPayTax = new JLabel("0");
        lblPayTax.setBorder(new LineBorder(Color.black));
        lblPayTax.setBounds(150, 220, 200, 25);
        this.add(lblPayTax);

        btnUpdate = new JButton("Update");
        btnUpdate.setBounds(60, 260, 150, 30);
        this.add(btnUpdate);
    }

//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        UpdateSawon add = new UpdateSawon("add");
//    }

}
