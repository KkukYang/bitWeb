package day0929;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class Ex07Server extends JFrame implements Runnable {
    JTextArea area;
    ServerSocket serverSocket;
    Vector<ChatClient> list = new Vector<ChatClient>();

    public Ex07Server(String title) throws HeadlessException {
        super(title);
        this.setBounds(700, 100, 700, 700);
        this.getContentPane().setBackground(new Color(111, 135, 177));
        this.setDesign();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void run() {
        System.out.println("run 1");

        try {
            serverSocket = new ServerSocket(7000);
            area.append("서버 소켓 생성 성공\n");
        } catch (Exception ex) {
            ex.printStackTrace();
            area.append("서버 소켓 생성 실패\n");
        }

        while (true) {
            try {
                Socket socket = serverSocket.accept();
                InetAddress inet = socket.getInetAddress();
                area.append("접속한 ip:" + inet.getHostAddress() + "\n");

                ChatClient client = new ChatClient(socket);
                list.add(client);
                client.start();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    class ChatClient extends Thread {

        String nickName;
        Socket socket;
        BufferedReader br;
        PrintWriter pw;

        public ChatClient(Socket socket) {
            this.socket = socket;
            try {
                br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                pw = new PrintWriter(socket.getOutputStream());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        @Override
        public void run() {
            super.run();
            System.out.println("run 2");
            while (true) {
                try {
                    String msg = br.readLine();
                    if (msg == null) {
                        break;
                    }
                    String[] data = msg.split("\\|");
                    if (data[0].equals("1")) {
                        nickName = data[1];
                        String sendMessage = nickName + " 님이 입장하였습니다.\n";
                        area.append(sendMessage + "\n");
                        for (ChatClient cc : list) {
                            cc.pw.write(sendMessage);
                            cc.pw.flush();
                        }
                    } else if (data[0].equals("2")) {
                        String sendMessage = nickName + ">>" + data[1] + "\n";
                        area.append(sendMessage + "\n");
                        for (ChatClient cc : list) {
                            cc.pw.write(sendMessage);
                            cc.pw.flush();
                        }
                    } else if (data[0].equals("9")) {

                        for (int i = 0; i < list.size(); i++) {
                            ChatClient cc = list.get(i);
                            if (nickName.equals(cc.nickName)) {
                                list.remove(i);
                                break;
                            }
                        }

                        nickName = data[1];
                        String sendMessage = nickName + " 님이 퇴장 하였습니다.\n";
                        area.append(sendMessage + "\n");
                        for (ChatClient cc : list) {
                            cc.pw.write(sendMessage);
                            cc.pw.flush();
                        }
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    public void setDesign() {
//        this.setLayout(null);
        area = new JTextArea();
        JScrollPane sp = new JScrollPane(area);
        this.add(area);
    }

    public static void main(String[] args) {
        Ex07Server server = new Ex07Server("server");
        Thread th = new Thread(server);
        th.start();
    }
}
