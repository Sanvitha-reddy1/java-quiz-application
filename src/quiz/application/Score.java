package quiz.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener{
    String name;
    JLabel heading,lblscore;
    JButton playagain;
    public static int score;
    Score(String name,int score){
        this.name = name;
        this.score = score;
        setBounds(400,150,800,550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2 = i1.getImage().getScaledInstance(300 , 250,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,200,300,250);
        add(image);
        
        heading = new JLabel("Thank you "+name+" for Playing QUIZ");
        heading.setBounds(45,30,700,30);
        heading.setFont(new Font("Tahoma",Font.BOLD,26));
        heading.setForeground(Color.RED);
        add(heading);
        
        lblscore = new JLabel("Your Score is  "+ score +" out of 100.");
        lblscore.setBounds(400,150,350,30);
        lblscore.setFont(new Font("Tahoma",Font.BOLD,24));
        add(lblscore);
        
        playagain = new JButton("Play Again");
        playagain.setBounds(450,300,120,30);
        playagain.setFont(new Font("Tahoma",Font.PLAIN,16));
        playagain.setBackground(new Color(30,144,255));
        playagain.setForeground(Color.WHITE);
        playagain.addActionListener(this);
        add(playagain);
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
            setVisible(false);
            new Login();
    }
    public static void main(String[] args){
            new Score("User",0);
    }
}
