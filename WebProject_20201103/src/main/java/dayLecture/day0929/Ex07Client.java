package dayLecture.day0929;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Ex07Client extends JFrame implements Runnable, ActionListener {
    JTextField txtName, txtServerIp, txtMsg;
    JTextArea area;
    JButton btnConnect, btnSend;

    Socket socket = null;
    BufferedReader br;
    PrintWriter pw;

    public Ex07Client(String title) throws HeadlessException {
        super(title);
        this.setBounds(700, 100, 700, 700);
        this.getContentPane().setBackground(new Color(211, 255, 208));
        this.setDesign();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);

                System.out.println("시스템 종료");
                try {
                    if (socket != null) {
                        String sendMessage = "9|" + txtName.getText() + "\n";
                        pw.write(sendMessage);
                        pw.flush();

                        socket.close();
                        System.out.println("socket close.");
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

    @Override
    public void run() {
        System.out.println("client run");
        while (true) {
            try {
                String line = br.readLine();
                if (line == null) {
                    break;
                }
                area.append(line + "\n");

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public void setDesign() {
        this.setLayout(null);
        JLabel lbl1 = new JLabel("닉네임");
        lbl1.setBounds(10, 10, 50, 25);
        this.add(lbl1);

        txtName = new JTextField();
        txtName.setBounds(70, 10, 80, 25);
        this.add(txtName);

        JLabel lbl2 = new JLabel("서버");
        lbl2.setBounds(160, 10, 60, 25);
        this.add(lbl2);

        txtServerIp = new JTextField("192.168.0.5");
        txtServerIp.setBounds(220, 10, 90, 25);
        this.add(txtServerIp);

        btnConnect = new JButton("접속");
        btnConnect.setBounds(320, 10, 60, 25);
        this.add(btnConnect);

        btnConnect.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = txtName.getText();
                String ip = txtServerIp.getText();
                Ex07Client.this.setTitle(name);

                try {
                    socket = new Socket(ip, 7000);
                    try {
                        br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                        pw = new PrintWriter(socket.getOutputStream());

                        Thread th = new Thread(Ex07Client.this);
                        th.start();

                        String sendMessage = "1|" + txtName.getText() + "\n";
                        System.out.println(sendMessage);
                        pw.write(sendMessage);
                        pw.flush();

                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        //채팅창과 메시지 입력하는곳 추가하기.
        area = new JTextArea();
        JScrollPane sp = new JScrollPane(area);
        sp.setBounds(10, 50, 360, 350);
        this.add(sp);

        txtMsg = new JTextField();
        txtMsg.setBounds(10, 410, 300, 25);
        this.add(txtMsg);

        btnSend = new JButton("send");
        btnSend.setBounds(310, 410, 70, 25);
        this.add(btnSend);

        txtMsg.addActionListener(this); //입력 후 엔터누르면 발생하는 이벤트.
        btnSend.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object ob = e.getSource();
        if (ob == txtMsg || ob == btnSend) {
            String sendMessage = "2|" + txtMsg.getText() + "\n";
            pw.write(sendMessage);
            pw.flush();

            txtMsg.setText("");
            txtMsg.requestFocus();
        }
    }

    public static void main(String[] args) {
        Ex07Client ex = new Ex07Client("client");
    }
}
