package quiz.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
    JButton rules,back;
    JTextField tfname;
    Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/quiz2.png"));
        JLabel image = new JLabel(i1);
        image.setBounds(0,0,600,500);
        add(image);
        
        JLabel heading = new JLabel("Test Your Knowledge");
        heading.setBounds(750,60,350,50);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,32));
        heading.setForeground(new Color(0,0,255));
        add(heading);
        
        JLabel name = new JLabel("Enter your name");
        name.setBounds(820,130,300,20);
        name.setFont(new Font("Mongolian Baiti",Font.BOLD,20));
        name.setForeground(new Color(30,144,250));
        add(name);
         
        tfname = new JTextField();
        tfname.setBounds(740,170,330,25);
        tfname.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(tfname);
        
        rules = new JButton("Rules");
        rules.setBounds(740,230,140,25);
        rules.setBackground(new Color(0,0,255));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(940,230,140,25);
        back.setBackground(new Color(0,0,255));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        setTitle("Login page");
        setSize(1200,500);
        setLocation(200,150);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== rules){
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
        }
        if(ae.getSource() == back){
            setVisible(false);
        }
    }
    public static void main(String[] args) {
        new Login();
        
    }  
}
