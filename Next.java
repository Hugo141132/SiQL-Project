package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Next extends JFrame implements ActionListener{
    String name;
    JButton start, back;
    
    Next(String name){
        this.name = name;
        getContentPane().setBackground(new Color(0xFFEDCA));
        setLayout(null);
        
        JLabel heading = new JLabel("Welcome "+name+" to SiQL");
        heading.setBounds(50, 20, 700, 55);
        heading.setFont(new Font("Ink Free", Font.BOLD, 40));
        heading.setForeground(Color.ORANGE);
        add(heading);
        
        JLabel rules = new JLabel();
        rules.setBounds(50, 90, 700, 200);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 18));
        rules.setText(
                "<html>"+
                        "Rules are simple:"+"<br><br>"+
                        "1. The answers aren't always in the options"+"<br><br>"+
                        "2. Just answer the question, even though the answers aren't in the options"+"<br><br>"+
                "<html>"
        );
        add(rules);
        
        JLabel prefix = new JLabel("Are you Ready??");
        prefix.setBounds(450, 300, 300, 55);
        prefix.setFont(new Font("Ink Free", Font.BOLD, 40));
        add(prefix);
        
        start = new JButton("Yes");
        start.setBounds(450, 380, 100, 30);
        start.setBackground(Color.ORANGE);
        start.setBorderPainted(false);
        start.setFocusPainted(false);
        start.addActionListener(this);
        start.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    setVisible(false);
                    new Quiz();
                } else if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    setVisible(false);
                    new Login();
                }
            }
        });
        add(start);
        
        back = new JButton("No");
        back.setBounds(650, 380, 100, 30);
        back.setBackground(Color.ORANGE);
        back.setBorderPainted(false);
        back.setFocusPainted(false);
        back.addActionListener(this);
        add(back);
        
        setResizable(false);
        setSize(1200, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
}
    
    public void actionPerformed(ActionEvent b){
        if (b.getSource() == start){
            setVisible(false);
            new Quiz();
        } else if (b.getSource() == back){
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String args[]){
        new Next("User");
    }
}
