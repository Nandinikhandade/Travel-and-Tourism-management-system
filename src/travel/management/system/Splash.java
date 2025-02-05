package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.time.*;

public class Splash extends JFrame implements Runnable
        
{
    Thread thread;
    Splash()
    {
        setSize(1200,600);
        setLocation(200,100);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/splash.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1200, 600,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add (image);
        
        setVisible(true);
        thread = new Thread(this);
        thread.start();
   
    }
    public void run(){
        try{
            Thread.sleep(5000);
            new Login();
            setVisible(false);
                    
                    
            }catch(Exception e){
            
        }
        
    } 
    
    public static void main(String[] args)
    {
        new Splash();
    }
}
