/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginForm;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Admin
 */
public class LoginForm
{
    JFrame jframe;
    JTextField  usernameTextField;
    JPasswordField  passwordTextField;
    JTextField  reasultTextField;
    
    public LoginForm()
    {
        jframe=new JFrame("Login Form");
        jframe.setSize(400,300);
        jframe.setLocation(100,100);
//        jframe.setLocationRelativeTo(null);
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
        
        JLabel password=new JLabel("Password");
        password.setBounds(20,45,200,30);
        jpanel.add(password);
        passwordTextField=new JPasswordField(15);
        passwordTextField.setBounds(100,45,200,25);
        jpanel.add(passwordTextField);
        
        
    }
    public static void main(String[] args)
    {
        new LoginForm();
    }
}
