package travel.management.system;

import javax.swing.*;
import java.awt.*;

public class Signup extends JFrame{

Signup() {
    setBounds(350,200,900,360);
    getContentPane().setBackground(Color.WHITE);
    setLayout(null);
    
    JPanel p1 = new JPanel();
    p1.setBackground(new Color(133,193,233));
    p1.setBounds(0,0,500,400);
    p1.setLayout(null);
    add(p1);
    
    JLabel lblusername = new JLabel("Username");
    lblusername.setFont(new Font("Tahoma",Font.BOLD,14));
    lblusername.setBounds(50,20,125,25);
    p1.add(lblusername);
    
    JTextField tfusername = new JTextField();
    tfusername.setBounds(190,20,180,25);
    tfusername.setBorder(BorderFactory.createEmptyBorder());
    p1.add(tfusername);
    
    
    JLabel lblname = new JLabel("Name");
    lblname.setFont(new Font("Tahoma",Font.BOLD,14));
    lblname.setBounds(50,60,125,25);
    p1.add(lblname);
    
    JTextField tfname = new JTextField();
    tfname.setBounds(190,60,180,25);
    tfname.setBorder(BorderFactory.createEmptyBorder());
    p1.add(tfname);
    

    JLabel lblpassword = new JLabel("Password");
    lblpassword.setFont(new Font("Tahoma",Font.BOLD,14));
    lblpassword.setBounds(50,100,125,25);
    p1.add(lblpassword);
    
    JTextField tfpassword = new JTextField();
    tfpassword.setBounds(190,100,180,25);
    tfpassword.setBorder(BorderFactory.createEmptyBorder());
    p1.add(tfpassword);
    
    

    
    setVisible(true);
    
}   
public static void main(String[] args) {
    new Signup();
    
}
}
