package dayLecture.day0915;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Ex01Choice extends JFrame {

    Choice choice;
    JComboBox<String> combo;
    String[] title = "빨강,검정,노랑,파랑,퍼플,시안".split(",");
    JLabel lblMessage;
    Color[] color = {Color.red, Color.black, Color.yellow, Color.blue, Color.pink, Color.cyan};

    public Ex01Choice(String title) throws HeadlessException {
        super(title);
        this.setBounds(1500, 100, 300, 500);
        this.getContentPane().setBackground(Color.white);
        this.setDesign();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void setDesign() {
        this.setLayout(null);
        choice = new Choice();
        for (String t : title) {
            choice.add(t);
        }
        choice.select(5);
        choice.setBounds(20, 20, 80, 30);
        this.add(choice);

        combo = new JComboBox<String>(title);
        combo.setBounds(130, 20, 100, 30);
        this.add(combo);

        lblMessage = new JLabel("Choice & JComboBox", JLabel.CENTER);
        lblMessage.setBorder(new LineBorder(Color.gray));
        lblMessage.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        lblMessage.setBounds(20, 150, 250, 50);
        this.add(lblMessage);

        choice.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                // TODO Auto-generated method stub
                int idx = choice.getSelectedIndex();
                String item = choice.getSelectedItem();
                lblMessage.setForeground(color[idx]);
                System.out.println(item);
            }
        });

//	combo.addItemListener(new ItemListener() {
//	    
//	    @Override
//	    public void itemStateChanged(ItemEvent e) {
//		// TODO Auto-generated method stub
//		int idx = combo.getSelectedIndex();
//		lblMessage.setForeground(color[idx]);
//		System.out.println(idx);//2번 출력.
//	    }
//	});

        combo.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                int idx = combo.getSelectedIndex();
                lblMessage.setForeground(color[idx]);
                System.out.println(idx);
            }
        });
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new Ex01Choice("choice");
    }

}
