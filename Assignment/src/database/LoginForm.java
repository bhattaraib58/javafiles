/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import SwingFiles.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JComponent;
import javax.swing.KeyStroke;

import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Admin
 */
public class LoginForm implements ActionListener, KeyListener 
{
    JFrame jframe;
    JTextField  usernameTextField;
    JPasswordField  passwordTextField;
    JTextField  reasultTextField;
    JLabel wrongUsername,wrongPassword;
    JLabel password;
    JButton loginBtn;
    JButton cancelBtn;
    JButton clearButton;
    JButton registerButton;
    JButton cancelButton;
    
    public LoginForm()
    {
        jframe=new JFrame("Login Form");
        jframe.setSize(350,300);
        jframe.setLocationRelativeTo(null);
        JPanel jpanel=new JPanel();
        jframe.add(jpanel);
        formInitialization(jpanel);
        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void formInitialization(JPanel jpanel)
    {
        jpanel.setLayout(null);
        JLabel username=new JLabel("Username");
        username.setBounds(20,20,200,30);
        jpanel.add(username);
        usernameTextField=new JTextField(15);
        usernameTextField.setBounds(100,20,200,25);
        jpanel.add(usernameTextField);
        
        wrongUsername=new JLabel("Invalid Username");
        wrongUsername.setBounds(70,45,200,30);
        wrongUsername.setForeground(Color.red);
        jpanel.add(wrongUsername);
        wrongUsername.setVisible(false);
        
         
        password=new JLabel("Password");
        password.setBounds(20,70,200,30);
        jpanel.add(password);
        passwordTextField=new JPasswordField(15);
        passwordTextField.setBounds(100,70,200,25);
        jpanel.add(passwordTextField);
        
        
        wrongPassword=new JLabel("Invalid Password");
        wrongPassword.setBounds(70,95,200,30);
        wrongPassword.setForeground(Color.red);
        jpanel.add(wrongPassword);
        wrongPassword.setVisible(false);
           
                
        registerButton=new JButton("Register");
        registerButton.setBounds(35, 130, 90, 30);
        jpanel.add(registerButton);      
        registerButton.setActionCommand("Register");
        registerButton.addActionListener(this);     
        
        loginBtn=new JButton("Login");
//        loginBtn.setFont(new Font("Arial",Font.PLAIN,12));
        loginBtn.setBounds(190,130,90,30);
        jpanel.add(loginBtn);
        loginBtn.setActionCommand("Login");
        loginBtn.addActionListener(this);
        loginBtn.addKeyListener(this);
        
        clearButton=new JButton("Clear");
        clearButton.setBounds(190,175,90,30);
        jpanel.add(clearButton);      
        clearButton.setActionCommand("Clear");
        clearButton.addActionListener(this);  
        
        cancelButton=new JButton("Cancel");
        cancelButton.setBounds(35,175,90,30);
        jpanel.add(cancelButton);      
        cancelButton.setActionCommand("Cancel");
        cancelButton.addActionListener(this);  

    }
        @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getActionCommand().equals("Login")) 
        {
            String username = usernameTextField.getText();
            String password = passwordTextField.getText();
            
            if(CheckInputValue())
            {
                PizzaDeliveryDatabase pdd=new PizzaDeliveryDatabase();
                if(pdd.checkUserRegistration(username, password))
                {
                    JOptionPane.showMessageDialog(null, "You Have Sucessfully Been Authenticated", "Login Confirmed", JOptionPane.INFORMATION_MESSAGE);
                    jframe.dispose();
                    new PizzaDelivery();
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "The Username or Password is Incorrect !!", "Error", JOptionPane.ERROR_MESSAGE);
                }
                System.out.println("Username :: "+username);
                System.out.println("Password :: "+password);
                UserDetails ud=new UserDetails();
                String s1=ud.hashString(password);
                String s2=ud.hashString(password);
                if(s1.equals(s2))
                {
                    System.out.println("Milyoo");
                }
            }
        }
        else if(e.getActionCommand().equals("Clear"))
        {
            usernameTextField.setText(null);
            passwordTextField.setText(null);
            
            wrongUsername.setVisible(false);
            wrongPassword.setVisible(false);
        }
        else if(e.getActionCommand().equals("Register"))
        {
            System.out.println("Register");
             jframe.dispose();
             new RegisterForm();
//        new FrmMain().setVisible(true); // Main Form to show after the Login Form..
        }
        else if(e.getActionCommand().equalsIgnoreCase("Cancel")) 
        {
            System.out.println("Cancel Button Clicked");
            System.exit(0);
        }
        else 
        {
//            System.out.println("command not recognized");
        }
    }
    public boolean setValuesInForm()
    {
        return true;
    }
    boolean CheckInputValue()
    {
        int errorBIT=0;
        String username = usernameTextField.getText();
        String password = passwordTextField.getText();
        
        //checking for name
        if(username==null||username.length()<5)
        {
            wrongUsername.setVisible(true);
            errorBIT=1;
        }
        else
        {
            wrongUsername.setVisible(false);
        }
        
        //for password
        if(password==null||password.length()<2)
        {
            wrongPassword.setVisible(true);
            errorBIT=1;
        }
        else
        {
            wrongPassword.setVisible(false);
        }
        
        if(errorBIT==1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public static void main(String[] args)
    {
        new LoginForm();
    }

    @Override
    public void keyTyped(KeyEvent e)
    {
    }

    @Override
    public void keyPressed(KeyEvent e)
    {
        
        if (e.getKeyCode() == KeyEvent.VK_ENTER)
        {
            loginBtn.doClick();
        }
    }

    @Override
    public void keyReleased(KeyEvent e)
    {
    }
}
