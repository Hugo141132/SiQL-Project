package quiz.application;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class End extends JFrame {
    
    End(){
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);
        
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                setVisible(false);
                new Login();
            }
        });
        
        JLabel head1 = new JLabel("Thanks");
        head1.setBounds(90, 30, 300, 80);
        head1.setFont(new Font("Ink Free", Font.BOLD, 60));
        head1.setForeground(Color.WHITE);
        head1.setHorizontalAlignment(SwingConstants.CENTER);
        add(head1);
        
        JLabel head2 = new JLabel("for playing!!!");
        head2.setBounds(60, 110, 400, 80);
        head2.setFont(new Font("Ink Free", Font.BOLD, 60));
        head2.setForeground(Color.WHITE);
        head2.setHorizontalAlignment(SwingConstants.CENTER);
        add(head2);
        
        JLabel head3 = new JLabel("See ya");
        head3.setBounds(90, 250, 300, 80);
        head3.setFont(new Font("Ink Free", Font.PLAIN, 60));
        head3.setForeground(Color.WHITE);
        head3.setHorizontalAlignment(SwingConstants.CENTER);
        add(head3);
        
        JLabel head4 = new JLabel("on the next");
        head4.setBounds(0, 330, 500, 80);
        head4.setFont(new Font("Ink Free", Font.PLAIN, 60));
        head4.setForeground(Color.WHITE);
        head4.setHorizontalAlignment(SwingConstants.CENTER);
        add(head4);
        
        JLabel head5 = new JLabel("UPDATESS");
        head5.setBounds(0, 410, 500, 80);
        head5.setFont(new Font("Ink Free", Font.PLAIN, 60));
        head5.setForeground(Color.WHITE);
        head5.setHorizontalAlignment(SwingConstants.CENTER);
        add(head5);
        
        setResizable(false);
        setSize(500, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String args[]){
        new End();
    }
}
