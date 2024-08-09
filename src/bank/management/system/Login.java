
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    
    JButton login, clear, signup;
    JTextField cardTextField;
    JPasswordField pinTextField;
    
    Login(){
        setTitle("ATM");
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/download.png"));// image
        Image i2 = i1.getImage().getScaledInstance(130, 130, Image.SCALE_DEFAULT);// image size cgange
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70, 10, 100, 100); // image ko koijaga pe fix karna 
        add(label);
        
        JLabel text = new JLabel("Welcome to ATM"); // Frame ke upper ka text
        text.setFont(new Font("OSWARD", Font.BOLD, 38)); //Font 
        text.setBounds(200, 40, 400, 40); // text location
        add(text);
        
      
        JLabel cardno = new JLabel("CARD NO:"); // Frame ke upper ka text
        cardno.setFont(new Font("Raleway", Font.BOLD, 24)); //Font 
        cardno.setBounds(120, 140, 140, 40); // text location
        add(cardno);
        cardTextField = new JTextField ();//CARD NO KE SAMNE EK BOX CHAIYE
        cardTextField.setBounds(300, 150, 230, 30);
        add(cardTextField);
        
        
        JLabel pin = new JLabel("PIN NO:"); // Frame ke upper ka text
        pin.setFont(new Font("Raleway", Font.BOLD, 24)); //Font 
        pin.setBounds(120, 220, 250, 30); // text location
        add(pin);
        pinTextField = new JPasswordField ();//CARD NO KE SAMNE EK BOX CHAIYE
        pinTextField.setBounds(300, 220, 230, 30);
        add(pinTextField);
        
        login = new JButton("SING IN");
        login.setBounds(300, 300, 100, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
        
        clear = new JButton("CLEAR");
        clear.setBounds(430, 300, 100, 30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);
        
        signup = new JButton("SIGN UP");
        signup.setBounds(300, 350, 230, 30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);
        
        getContentPane().setBackground(Color.white); // Background colour change
        
        setSize(800, 480);
        setVisible(true);
        setLocation(350, 200);
        }
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == clear){
            cardTextField.setText("");
            pinTextField.setText("");
        }else if (ae.getSource() == login){
            Conn conn = new Conn();
            String cardnumber = cardTextField.getText();
            String pin = pinTextField.getText();
            String query = "select * from login where cardnumber = '"+cardnumber+"' and pin = '"+pin+"'";
            try {
              ResultSet rs =  conn.s.executeQuery(query); 
              if (rs.next()){
                  setVisible(false);
                  new Transactions(pin).setVisible(true);
              } else {
                  JOptionPane.showMessageDialog(null, "Incorrect Card Number or Pin"); 
              }
                
            } catch (Exception e){
                System.out.println(e);
            }
            
            
            
        }else if (ae.getSource() == signup){
           setVisible(false);
           new SignupOne().setVisible(true);
            
        }
        
    }
    public static void main(String args[]){
        new Login();
    }
    
}
