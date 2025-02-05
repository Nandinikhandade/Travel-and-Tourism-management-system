package travel.management.system;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;


public class Login extends JFrame {
    Login()
    {
        setSize(900,400);
        setLocation(350,200);
        setLayout(null);
      
        getContentPane().setBackground(Color.WHITE);
        
        JPanel p1 = new JPanel();
        p1.setBackground(new Color(131,193,233));
        p1.setBounds(0,0,400,400);
        add(p1);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/login.png"));
        Image i2 = i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon (i2);
        JLabel image = new JLabel (i3);
        image.setBounds(100,120,200,200);
        p1.add(image);
        
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(400,30,450,300);
        add(p2);
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(70, 30, 200, 30);
        lblusername.setFont(new Font("SAN_SERIF",Font.PLAIN,30));
        p2.add(lblusername);
        
        JTextField tfusername = new JTextField();
        tfusername.setBounds(70,70,350,40);
        tfusername.setFont(new Font("SAN_SERIF",Font.PLAIN,18));
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfusername);
        
        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(70, 115, 200, 30);
        lblpassword.setFont(new Font("SAN_SERIF",Font.PLAIN,30));
        p2.add(lblpassword);
        
        JTextField tfpassword = new JTextField();
        tfpassword.setBounds(70,150,350,40);
        tfpassword.setFont(new Font("SAN_SERIF",Font.PLAIN,18));
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfpassword);
        
        JButton login = new JButton("Login");
        login.setBounds(70,220,130,30);
        login.setFont(new Font ("SAN_SERIF",Font.PLAIN,18));
        login.setBackground(new Color (133,193,233));
        login.setForeground(Color.WHITE);
        login.setBorder(new LineBorder(new Color(133,193,233)));
        p2.add(login);
        
                
        JButton signup = new JButton("Signup");
        signup.setBounds(230,220,130,30);
        signup.setFont(new Font ("SAN_SERIF",Font.PLAIN,18));
        signup.setBackground(new Color (133,193,233));
        signup.setForeground(Color.WHITE);
        signup.setBorder(new LineBorder(new Color(133,193,233)));
        p2.add(signup);

        
        setVisible(true);
        
        
    }
    
    public static void main(String[] args){
        new Login();
    }
}
