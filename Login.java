package quiz.application;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
    JButton next, exit;
    JTextField username;
    
    Login(){
        getContentPane().setBackground(new Color(0xFFEDCA));
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/login.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 600, 600);
        add(image);
        
        JLabel heading = new JLabel("SiQL");
        heading.setBounds(845, 60, 110, 55);
        heading.setFont(new Font("Ink Free", Font.BOLD, 40));
        heading.setForeground(Color.ORANGE);
        add(heading);
        
        JLabel name = new JLabel("Please Enter Your Name");
        name.setBounds(778, 130, 300, 55);
        name.setFont(new Font("Comic Sans", Font.PLAIN, 20));
        name.setForeground(Color.black);
        add(name);
        
        username = new JTextField();
        username.setBounds(740, 200, 300, 25);
        username.setFont(new Font("Times New Roman", Font.BOLD, 15));
        username.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER){
                    if (username.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter your name", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    String name = username.getText();
                    setVisible(false);
                    new Next(name);
                    }
                } else if (e.getKeyCode() == KeyEvent.VK_ESCAPE){
                    System.exit(0);
                }
            }
        });
        add(username);
        
        next = new JButton("Next");
        next.setBounds(740, 270, 120, 25);
        next.setBackground(Color.ORANGE);
        next.setBorderPainted(false);
        next.setFocusPainted(false);
        next.addActionListener(this);
        add(next);
        
        exit = new JButton("Exit");
        exit.setBounds(918, 270, 120, 25);
        exit.setBackground(Color.ORANGE);
        exit.setBorderPainted(false);
        exit.setFocusPainted(false);
        exit.addActionListener(this);
        add(exit);
        
        setResizable(false);
        setSize(1200, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent a){
        if (a.getSource() == next){
            if (username.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter your name", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            String name = username.getText();
            setVisible(false);
            new Next(name);
            }
        } else if (a.getSource() == exit){
            System.exit(0);
        }
    }
    
    public static void main(String args[]){
        new Login();
    }
}
