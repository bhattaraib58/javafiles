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
    
    public LoginForm()
    {
        jframe=new JFrame("Login Form");
        jframe.setSize(400,300);
//        jframe.setLocation(100,100);
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
        jpanel.add(wrongUsername);
        wrongUsername.setVisible(false);
        
         
        password=new JLabel("Password");
        password.setBounds(20,60,200,30);
        jpanel.add(password);
        passwordTextField=new JPasswordField(15);
        passwordTextField.setBounds(100,60,200,25);
        jpanel.add(passwordTextField);
        
        
        wrongPassword=new JLabel("Invalid Password");
        wrongPassword.setBounds(70,95,200,30);
        jpanel.add(wrongPassword);
        wrongPassword.setVisible(false);
        
        
        loginBtn=new JButton("Login");
        loginBtn.setFont(new Font("Arial",Font.PLAIN,12));
        loginBtn.setBounds(60, 100, 65, 30);
        jpanel.add(loginBtn);
        loginBtn.setActionCommand("Login");
        loginBtn.addActionListener(this);
        loginBtn.addKeyListener(this);
        
        cancelBtn=new JButton("Cancel");
        cancelBtn.setFont(new Font("Arial",Font.PLAIN,12));
        cancelBtn.setBounds(220, 100, 75, 30);
        jpanel.add(cancelBtn);
        cancelBtn.setActionCommand("Cancel");
        cancelBtn.addActionListener(this);
        cancelBtn.addKeyListener(this);
        
        
        clearButton=new JButton("Clear");
        clearButton.setBounds(135,100,70,30);
        jpanel.add(clearButton);      
        clearButton.setActionCommand("Clear");
        clearButton.addActionListener(this);  
        
//        loginBtn.registerKeyboardAction(loginBtn.getActionForKeyStroke("Login"
//                              JComponent.WHEN_FOCUSED);
//        
//        cancelBtn.registerKeyboardAction(cancelBtn.getActionForKeyStroke(
//                                      KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
//                                      KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
//                                      JComponent.WHEN_FOCUSED);
        
//button.setFont(new Font("Arial", Font.PLAIN, 40));
//"Arial" is obviously the name of the font being used.
//Font.PLAIN means plain text (as opposed to bold or italic).
//40 is the font size (using the same numbering system for font size as Microsoft Word)
        
    }
        @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getActionCommand().equals("Login")) 
        {
            String username = usernameTextField.getText();
            String password = passwordTextField.getText();
            if(username.equals("admin")&password.equals("admin"))
            {
                JOptionPane.showMessageDialog(null, "You Have Sucessfully Been Authenticated", "Login Confirmed", JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                    wrongUsername.setBackground(Color.red);
                    wrongPassword.setBackground(Color.red);
                    wrongUsername.setForeground(Color.red);
                    wrongPassword.setForeground(Color.red);
                    wrongUsername.setVisible(true);
                    wrongPassword.setVisible(true);
                    
                    this.password.setBounds(20,70,200,30);
                    passwordTextField.setBounds(100,70,200,25);
                    loginBtn.setBounds(60, 120, 65, 30);
                    cancelBtn.setBounds(220, 120, 75, 30);
                    clearButton.setBounds(135,120,70,30);
            }
            System.out.println("Username :: "+username);
            System.out.println("Password :: "+password);
            System.out.println("Action Performed in Login Button");
        }
        else if(e.getActionCommand().equals("Clear"))
        {
            usernameTextField.setText(null);
            passwordTextField.setText(null);
            
            password.setBounds(20,45,200,30);
            passwordTextField.setBounds(100,45,200,25);
            loginBtn.setBounds(60, 80, 65, 30);
            cancelBtn.setBounds(220, 80, 75, 30);
            clearButton.setBounds(135,80,70,30);
            
            wrongUsername.setVisible(false);
            wrongPassword.setVisible(false);
            
        }
        else if(e.getActionCommand().equalsIgnoreCase("Cancel")) 
        {
            System.out.println("Cancel Button Clicked");
            System.exit(0);
        }
        else 
        {
            System.out.println("command not recognized");
        }
    }
    
    public static void main(String[] args)
    {
        new LoginForm();
    }

    @Override
    public void keyTyped(KeyEvent e)
    {
//        if (e.getKeyCode() == KeyEvent.VK_ENTER)
//        {
//            loginBtn.doClick();
//        }
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
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
