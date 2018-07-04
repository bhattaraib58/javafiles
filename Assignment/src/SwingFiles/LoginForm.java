/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwingFiles;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

/**
 *
 * @author Admin
 */
public class LoginForm implements ActionListener 
{
    JFrame jframe;
    JTextField  usernameTextField;
    JPasswordField  passwordTextField;
    JTextField  reasultTextField;
    
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
        
        JLabel password=new JLabel("Password");
        password.setBounds(20,45,200,30);
        jpanel.add(password);
        passwordTextField=new JPasswordField(15);
        passwordTextField.setBounds(100,45,200,25);
        jpanel.add(passwordTextField);
        
        JButton loginBtn=new JButton("Login");
        loginBtn.setFont(new Font("Arial",Font.PLAIN,12));
        loginBtn.setBounds(60, 80, 65, 30);
        jpanel.add(loginBtn);
        loginBtn.setActionCommand("Login");
        loginBtn.addActionListener(this);
        
        
        JButton cancelBtn=new JButton("Cancel");
        cancelBtn.setFont(new Font("Arial",Font.PLAIN,12));
        cancelBtn.setBounds(200, 80, 75, 30);
        jpanel.add(cancelBtn);
        cancelBtn.setActionCommand("Cancel");
        cancelBtn.addActionListener(this);
        
//        loginBtn.registerKeyboardAction(loginBtn.getActionForKeyStroke(
//                              KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
//                              KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
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
            System.out.println("Username :: "+username);
            System.out.println("Password :: "+password);
            System.out.println("Action Performed in Login Button");
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
}
