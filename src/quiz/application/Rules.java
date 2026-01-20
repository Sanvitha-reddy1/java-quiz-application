package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{
    String name;
    JButton start,back;
    Rules(String name){
        this.name = name;
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel heading = new JLabel("Welcome to QUIZ "+name+"!");
        heading.setBounds(50,30,350,50);
        heading.setFont(new Font("Mongolian Baiti",Font.BOLD,24));
        heading.setForeground(new Color(0,0,255));
        add(heading);
        
        JLabel rules = new JLabel();
        rules.setBounds(20,90,700,350);
        rules.setFont(new Font("Tahoma",Font.PLAIN,16));
        rules.setForeground(new Color(0,0,0));
        rules.setText(
                "<html>"+
                "1. Read each question carefully before answering." + "<br><br>" +
                "2. Answer the question under the given time." + "<br><br>" +
                "3. Try to answer all the given Questions." + "<br><br>" +
                "4. Quiz submits automatically after the time limit of last question." + "<br><br>" +
                "5. Your Score Revealed at the end." + "<br><br>" +
                "</html>"
        );
        add(rules);
        
        start = new JButton("Start");
        start.setBounds(150,400,140,25);
        start.setBackground(new Color(0,0,255));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        back = new JButton("Back");
        back.setBounds(350,400,140,25);
        back.setBackground(new Color(0,0,255));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        setLocation(350,100);
        setSize(800,600);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==start){
            setVisible(false);
            new Quiz(name);
        }
        if(ae.getSource()==back){
            setVisible(false);
            new Login();
        }
    }
    public static void main(String[] args){
        new Rules("User");
    }
}
