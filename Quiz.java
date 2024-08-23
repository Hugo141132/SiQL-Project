package quiz.application;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Quiz extends JFrame implements ActionListener{
    String questions[][] = new String [5][5];
    JLabel  lvl, question, heading, label1, labelh1, labelh2, labelhb2;
    JButton opt1, opt2, opt3, opt4, optB1, optB2, optB3;
    public static int timer;
    public static int count;
    
    Quiz(){
        getContentPane().setBackground(new Color(0xFFEDCA));
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/G-O.jpg"));
        label1 = new JLabel();
        label1.setIcon(i1);
        label1.setBounds(0, 0, 1200, 600);
        label1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                count = 0;
                setVisible(false);
                new Login();
            }
        });
        
        ImageIcon h1 = new ImageIcon(ClassLoader.getSystemResource("icon/Life1.png"));
        labelh1 = new JLabel();
        labelh1.setIcon(h1);
        labelh1.setBounds(45, 85, 60, 54);
        add(labelh1);
        
        ImageIcon h2 = new ImageIcon(ClassLoader.getSystemResource("icon/Life1.png"));
        labelh2 = new JLabel();
        labelh2.setIcon(h2);
        labelh2.setBounds(105, 85, 60, 54);
        add(labelh2);
        
        ImageIcon hb2 = new ImageIcon(ClassLoader.getSystemResource("icon/Life2.png"));
        labelhb2 = new JLabel();
        labelhb2.setIcon(hb2);
        labelhb2.setBounds(105, 85, 60, 54);
        add(labelhb2);
        
        heading = new JLabel("SiQL");
        heading.setBounds(480, 60, 180, 110);
        heading.setHorizontalAlignment(SwingConstants.CENTER);
        heading.setFont(new Font("Ink Free", Font.BOLD, 80));
        heading.setForeground(Color.ORANGE);
        add(heading);
        
        lvl = new JLabel();
        lvl.setBounds(50, 0, 200, 100);
        lvl.setFont(new Font("Tahoma", Font.PLAIN, 30));
        add(lvl);
        
        question = new JLabel();
        question.setBounds(180, 200, 800, 100);
        question.setHorizontalAlignment(SwingConstants.CENTER);
        question.setFont(new Font("Ink Free", Font.BOLD, 25));
        add(question);
        
        questions[0][0] = "What’s the capital of United States?";
        questions[0][1] = "Washington";
        questions[0][2] = "US";
        questions[0][3] = "London";
        questions[0][4] = "D.C.";
        
        questions[1][0] = "Which month has no more than 28 days?";
        questions[1][1] = "January";
        questions[1][2] = "March";
        questions[1][3] = "May";
        questions[1][4] = "July";
        
        questions[2][0] = "What is the name of this quiz app?";
        questions[2][1] = "SIQL";
        questions[2][2] = "sIQL";
        questions[2][3] = "SiqL";
        questions[2][4] = "siQL";
        
        questions[3][0] = "What is there one of in every corner and two of in every room?";
        questions[3][1] = "Dust";
        questions[3][2] = "Holes";
        questions[3][3] = "O";
        questions[3][4] = "Insects";
        
        questions[4][0] = "If 1 + 3 = A, 2 + 2 = B. Then, what about 3 + 1?";
        questions[4][1] = "C";
        questions[4][2] = "D";
        questions[4][3] = "E";
        questions[4][4] = "Not Found";
        
        opt1 = new JButton();
        opt1.setBounds(350, 300, 200, 50);
        opt1.setBackground(Color.ORANGE);
        opt1.setBorderPainted(false);
        opt1.setFocusPainted(false);
        opt1.setFont(new Font("Times New Roman", Font.BOLD, 25));
        opt1.addActionListener(this);
        add(opt1);
        
        opt2 = new JButton();
        opt2.setBounds(350, 380, 200, 50);
        opt2.setBackground(Color.ORANGE);
        opt2.setBorderPainted(false);
        opt2.setFocusPainted(false);
        opt2.setFont(new Font("Times New Roman", Font.BOLD, 25));
        opt2.addActionListener(this);
        add(opt2);
        
        opt3 = new JButton();
        opt3.setBounds(600, 300, 200, 50);
        opt3.setBackground(Color.ORANGE);
        opt3.setBorderPainted(false);
        opt3.setFocusPainted(false);
        opt3.setFont(new Font("Times New Roman", Font.BOLD, 25));
        opt3.addActionListener(this);
        add(opt3);
        
        opt4 = new JButton();
        opt4.setBounds(600, 380, 200, 50);
        opt4.setBackground(Color.ORANGE);
        opt4.setBorderPainted(false);
        opt4.setFocusPainted(false);
        opt4.setFont(new Font("Times New Roman", Font.BOLD, 25));
        opt4.addActionListener(this);
        add(opt4);
        
        optB1 = new JButton("2");
        optB1.setBounds(83, 0, 60, 100);
        optB1.setBackground(null);
        optB1.setBorderPainted(false);
        optB1.setFocusPainted(false);
        optB1.setContentAreaFilled(false);
        optB1.setFont(new Font("Tahoma", Font.PLAIN, 30));
        optB1.addActionListener(this);
        
        optB2 = new JButton("SiQL");
        optB2.setBounds(418, 60, 300, 110);
        optB2.setHorizontalAlignment(SwingConstants.CENTER);
        optB2.setBackground(null);
        optB2.setForeground(Color.ORANGE);
        optB2.setBorderPainted(false);
        optB2.setFocusPainted(false);
        optB2.setContentAreaFilled(false);
        optB2.setFont(new Font("Ink Free", Font.BOLD, 80));
        optB2.addActionListener(this);
        
        optB3 = new JButton("A");
        optB3.setBounds(400, 200, 60, 100);
        optB3.setBackground(null);
        optB3.setBorderPainted(false);
        optB3.setFocusPainted(false);
        optB3.setContentAreaFilled(false);
        optB3.setFont(new Font("Ink Free", Font.PLAIN, 25));
        optB3.addActionListener(this);
        
        start(count);
        
        setResizable(false);
        setSize(1200, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent c){
        if (count == 0){
            if (c.getSource() == opt2){
                repaint();
                count++;
                start(count);
            } else{ 
                if (c.getSource() != opt2 && labelh2.isVisible()){
                    labelh2.setVisible(false);
                } else if (c.getSource() != opt2 && !labelh2.isVisible()){
                    remove(heading);
                    remove(lvl);
                    remove(question);
                    remove(opt1);
                    remove(opt2);
                    remove(opt3);
                    remove(opt4);
                    remove(labelh1);
                    remove(labelhb2);
                    add(label1);
                    timer = 0;
                }
            }
        } else if (count == 1){
            if (c.getSource() == optB1){
                repaint();
                count++;
                start(count);
            } else{
                if (c.getSource() != optB1 && labelh2.isVisible()){
                    labelh2.setVisible(false);
                } else if (c.getSource() != optB1 && !labelh2.isVisible()){
                    remove(heading);
                    remove(lvl);
                    remove(question);
                    remove(opt1);
                    remove(opt2);
                    remove(opt3);
                    remove(opt4);
                    remove(optB1);
                    remove(labelh1);
                    remove(labelhb2);
                    add(label1);
                    timer = 0;
                }
            }
        } else if (count == 2){
            if (c.getSource() == optB2){
                repaint();
                count++;
                start(count);
            } else{
                if (c.getSource() != optB2 && labelh2.isVisible()){
                    labelh2.setVisible(false);
                } else if (c.getSource() != optB2 && !labelh2.isVisible()){
                    remove(heading);
                    remove(lvl);
                    remove(question);
                    remove(opt1);
                    remove(opt2);
                    remove(opt3);
                    remove(opt4);
                    remove(optB2);
                    remove(labelh1);
                    remove(labelhb2);
                    add(label1);
                    timer = 0;
                }
            }
        } else if (count == 3){
            if (c.getSource() == opt3){
                repaint();
                count++;
                start(count);
            } else{
                if (c.getSource() != opt3 && labelh2.isVisible()){
                    labelh2.setVisible(false);
                } else if (c.getSource() != optB2 && !labelh2.isVisible()){
                    remove(heading);
                    remove(lvl);
                    remove(question);
                    remove(opt1);
                    remove(opt2);
                    remove(opt3);
                    remove(opt4);
                    remove(labelh1);
                    remove(labelhb2);
                    add(label1);
                    timer = 0;
                }
            }
        } else if (count == 4){
            if (c.getSource() == optB3){
                setVisible(false);
                new End();
            } else{
                if (c.getSource() != optB3 && labelh2.isVisible()){
                    labelh2.setVisible(false);
                } else if (c.getSource() != optB3 && !labelh2.isVisible()){
                    remove(heading);
                    remove(lvl);
                    remove(question);
                    remove(opt1);
                    remove(opt2);
                    remove(opt3);
                    remove(opt4);
                    remove(optB3);
                    remove(labelh1);
                    remove(labelhb2);
                    add(label1);
                    timer = 0;
                }
            }
        }
    }
    
    public void paint(Graphics g){
        super.paint(g);
        
        String time = "Time left: "+timer+" seconds";
        g.setColor(Color.RED);
        g.setFont(new Font("Tahoma", Font.BOLD, 30));
        
        if(timer > 0){
            g.drawString(time, 850, 100);
        } 
        
        timer--;
        
        if(timer == 0){
            remove(heading);
            remove(lvl);
            remove(question);
            remove(opt1);
            remove(opt2);
            remove(opt3);
            remove(opt4);
            remove(optB1);
            remove(optB2);
            remove(optB3);
            remove(labelh1);
            remove(labelh2);
            remove(labelhb2);
            add(label1);
        }
        
        try{
            Thread.sleep(800);
            repaint();
        } catch (Exception b){
            b.printStackTrace();
        }
    }
    
    public void start(int count){
        lvl.setText("No. "+(count+1));
        question.setText(questions[count][0]);
        opt1.setText(questions[count][1]);
        opt2.setText(questions[count][2]);
        opt3.setText(questions[count][3]);
        opt4.setText(questions[count][4]);
        
        if(count == 1){
            add(optB1);
        } else if(count == 2){
            remove(optB1);
            add(optB2);
        } else if(count == 3){
            remove(optB2);
        } else if(count == 4){
            add(optB3);
        }
        
        timer = 15;
    }
    
    public static void main(String args[]){
        new Quiz();
    }
}
