package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class SignupThree extends JFrame implements ActionListener{
    
    JRadioButton saving_Account,fix_deposit_account,current_account,recurring_deposite_account;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit, cancel;
    String formno;
    
    
    SignupThree(String formno){
        this.formno = formno;
        
        setLayout(null);
        
        JLabel l1 = new JLabel("STEP 3: Account Details");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        l1.setBounds(260, 40, 400, 40);
        add(l1);
        
        JLabel type = new JLabel("Account Type: ");
        type.setFont(new Font("Raleway", Font.BOLD, 22));
        type.setBounds(100, 120, 200, 30);
        add(type);
        
        saving_Account = new JRadioButton("Saving Account");
        saving_Account.setFont(new Font("Raleway", Font.BOLD, 16));
        saving_Account.setBackground(Color.WHITE);
        saving_Account.setBounds(100,160,150,20);
        add(saving_Account);
        
        fix_deposit_account = new JRadioButton("Fix Deposite Account");
        fix_deposit_account.setFont(new Font("Raleway", Font.BOLD, 16));
        fix_deposit_account.setBackground(Color.WHITE);
        fix_deposit_account.setBounds(350,160,250,20);
        add(fix_deposit_account);
        
        current_account = new JRadioButton("Curent Account");
        current_account.setFont(new Font("Raleway", Font.BOLD, 16));
        current_account.setBackground(Color.WHITE);
        current_account.setBounds(100,200,250,20);
        add(current_account);
        
        recurring_deposite_account = new JRadioButton("Recurring Deposite Account");
        recurring_deposite_account.setFont(new Font("Raleway", Font.BOLD, 16));
        saving_Account.setBackground(Color.WHITE);
        recurring_deposite_account.setBounds(350,200,250,20);
        add(recurring_deposite_account);
        
        
        ButtonGroup groupaccount = new ButtonGroup();
        groupaccount.add(saving_Account);
        groupaccount.add(fix_deposit_account);
        groupaccount.add(current_account);
        groupaccount.add(recurring_deposite_account);
        
        JLabel card  = new JLabel("Card Number: ");
        card.setFont(new Font("Raleway", Font.BOLD, 22));
        card.setBounds(100, 250, 200, 30);
        add(card);
        
        JLabel number  = new JLabel("XXXX-XXXX-XXXX-4184");
        number.setFont(new Font("Raleway", Font.BOLD, 22));
        number.setBounds(330, 250, 300, 30);
        add(number);
        
        JLabel carddetail  = new JLabel("Your 16 digit Card Number");
        carddetail.setFont(new Font("Raleway", Font.BOLD, 12));
        carddetail.setBounds(100, 280, 300, 15);
        add(carddetail);
        
        JLabel pin  = new JLabel("PIN:");
        pin.setFont(new Font("Raleway", Font.BOLD, 22));
        pin.setBounds(100, 320, 200, 30);
        add(pin);
        
        JLabel pnumber  = new JLabel("XXXX");
        pnumber.setFont(new Font("Raleway", Font.BOLD, 22));
        pnumber.setBounds(330, 320, 300, 30);
        add(pnumber);
        
        JLabel pindetail  = new JLabel("Your 4 digit Password");
        pindetail.setFont(new Font("Raleway", Font.BOLD, 12));
        pindetail.setBounds(100, 350, 300, 15);
        add(pindetail);
        
        JLabel services  = new JLabel("Services Required: ");
        services.setFont(new Font("Raleway", Font.BOLD, 22));
        services.setBounds(100, 390, 250, 30);
        add(services);
        
        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway", Font.BOLD,16));
        c1.setBounds(100,430,200,20);
        add(c1);
        
        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway", Font.BOLD,16));
        c2.setBounds(350,430,200,20);
        add(c2);
        
        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway", Font.BOLD,16));
        c3.setBounds(100,470,200,20);
        add(c3);
        
        c4 = new JCheckBox("Email and SMS Alerts");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway", Font.BOLD,16));
        c4.setBounds(350,470,200,20);
        add(c4);
        
        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway", Font.BOLD,16));
        c5.setBounds(100,510,200,20);
        add(c5);
        
        c6 = new JCheckBox("E Statement");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway", Font.BOLD,16));
        c6.setBounds(350,510,200,20);
        add(c6);
        
        c7 = new JCheckBox("I hereby declares that the above entered details are correct to the best of my knowlwdge");
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway", Font.BOLD,12));
        c7.setBounds(100,600,600,20);
        add(c7);
        
        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway", Font.BOLD, 14));
        submit.setBounds(250,680,100,30);
        submit.addActionListener(this);
        add(submit);
        
        cancel = new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Raleway", Font.BOLD, 14));
        cancel.setBounds(420,680,100,30);
        cancel.addActionListener(this);
        add(cancel);

        getContentPane().setBackground(Color.WHITE);
        
        
        
        setSize(850, 820);
        setLocation(350, 0);
        setVisible(true);
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == submit){
            String accountType = null;
            if (saving_Account.isSelected()){
                accountType = "Saving Account";
            } else if (fix_deposit_account.isSelected()){
                accountType = "Fix Deposit Account";
            } else if (current_account.isSelected()){
                accountType = "Current Account";
            } else if (recurring_deposite_account.isSelected()){
                accountType = "Recurring Deposite Account";
            }
            
            Random random = new Random();
            String cardnumber = "" +  Math.abs((random.nextLong() % 90000000L) + 5040936000000000L);
            String pin = "" + Math.abs((random.nextLong() % 9000L) + 1000L);
            
            String facility = "";
            if (c1.isSelected()){
                facility = facility + "ATM card";    
            } else if (c2.isSelected()){
                facility = facility + "Internet Banking";
            } else if (c3.isSelected()){
                facility = facility + "Mobile Banking";               
            } else if (c4.isSelected()){
                facility = facility + "Eamil and SMS Alerts";
            } else if (c5.isSelected()){
                facility = facility +"Cheque Book";
            } else if (c6.isSelected()){
                facility = facility + "E Statement";
            }
            
            try{
                if (accountType.equals("")){
                    JOptionPane.showMessageDialog(null, "Account Type is Required");
                } else {
                    Conn conn = new Conn();
                    String queryl = "insert into signupthree values('"+formno+"','"+accountType+"','"+cardnumber+"','"+pin+"','"+facility+"')";
                    String query2 = "insert into login values('"+formno+"','"+cardnumber+"','"+pin+"')";
                    conn.s.executeUpdate(queryl);
                    conn.s.executeUpdate(query2);
                    
                    JOptionPane.showMessageDialog(null , "Card Number: " + cardnumber + "\n pin: " + pin); 
                setVisible(false);
                new Deposit(pin).setVisible(false);
                
                }
            } catch (Exception e){
                System.out.println(e);
            }
            
         
            
        }else if (ae.getSource() == cancel){
            setVisible(false);
            new Login().setVisible(true);
            
            
        }
    }
    
    
    public static void main(String args[]){
        new SignupThree("");
        
    }
    
}
