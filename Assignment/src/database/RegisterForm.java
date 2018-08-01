/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author bhattaraib58
 */
public class RegisterForm implements ActionListener
{
    JFrame jframe;
    JButton registerButton,cancelButton;
//    JLabel firstNameLabel,lastNameLabel,genderLabel,phonenoLabel,usernameLabel,passwordLabel;
    JTextField firstnameTextfield,lastnameTextfield,phonenoTextfield,usernameTextfield,passwordTextfield;
    JLabel wrongFirstName,wrongLastname,wrongGender,wrongPhoneno,wrongUsername,wrongPassword;
    ButtonGroup genderButtonGroup;
    
    RegisterForm()
    {
        jframe=new JFrame("Register Users");
        jframe.setSize(400, 500);
        initComponents();
        jframe.setLocationRelativeTo(null);
        jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
        jframe.setVisible(true);
    }
    void initComponents()
    {
        JPanel jpanel=new JPanel();
        jpanel.setLayout(null);
        jframe.add(jpanel);
        
        JLabel firstNameLabel=new JLabel("First Name:");
        firstNameLabel.setBounds(10,10,70,25);
        jpanel.add(firstNameLabel);
        
        firstnameTextfield=new JTextField(100);
        firstnameTextfield.setBounds(80,10,250,25);
        jpanel.add(firstnameTextfield);
        
        wrongFirstName=new JLabel("Please Enter First Last atleast 4 Characters From A-Z Only");
        wrongFirstName.setBounds(10,40,300,25);
        wrongFirstName.setForeground(Color.red);
        wrongFirstName.setVisible(false);
        jpanel.add(wrongFirstName);
        
        JLabel lastNameLabel=new JLabel("Last Name:");
        lastNameLabel.setBounds(10,70,70,25);
        jpanel.add(lastNameLabel);
        
        lastnameTextfield=new JTextField(100);
        lastnameTextfield.setBounds(80,70,250,25);
        jpanel.add(lastnameTextfield);
        
        wrongLastname=new JLabel("Please Enter Last Name atleast 4 Characters From A-Z Only");
        wrongLastname.setBounds(10,100,300,25);
        wrongLastname.setForeground(Color.red);
        wrongLastname.setVisible(false);
        jpanel.add(wrongLastname);
        
          
        JLabel genderLabel=new JLabel("Gender:");
        genderLabel.setBounds(10,130,70,25);
        jpanel.add(genderLabel);
        
        JRadioButton maleRB=new JRadioButton("Male");
        maleRB.setBounds(100,130,70,25);
        maleRB.setActionCommand("Male");
        
        JRadioButton femaleRB=new JRadioButton("Female");
        femaleRB.setBounds(170,130,70,25);
        femaleRB.setActionCommand("Female");
        
        JRadioButton othersRB=new JRadioButton("Others");
        othersRB.setBounds(240,130,70,25);
        othersRB.setActionCommand("Others");
        
        wrongGender=new JLabel("Please Select Your Gender");
        wrongGender.setBounds(50,160,300,25);
        wrongGender.setForeground(Color.red);
        wrongGender.setVisible(false);
        jpanel.add(wrongGender);
        
        genderButtonGroup=new ButtonGroup();
        genderButtonGroup.add(maleRB);
        genderButtonGroup.add(femaleRB);
        genderButtonGroup.add(othersRB);

        jpanel.add(maleRB);
        jpanel.add(femaleRB);
        jpanel.add(othersRB);
        
        
        JLabel phonenoLabel=new JLabel("Phone NO:");
        phonenoLabel.setBounds(10,190,70,25);
        jpanel.add(phonenoLabel);
        
        phonenoTextfield=new JTextField(100);
        phonenoTextfield.setBounds(80,190,250,25);
        jpanel.add(phonenoTextfield);

        wrongPhoneno= new JLabel("Please Enter you Phone no From 0-9 Only Containing 10 numbers");
        wrongPhoneno.setBounds(10,215,380,25);
        wrongPhoneno.setForeground(Color.red);
        wrongPhoneno.setVisible(false);
        jpanel.add(wrongPhoneno);
        
        
        JLabel usernameLabel=new JLabel("Username:");
        usernameLabel.setBounds(10,250,70,25);
        jpanel.add(usernameLabel);
        
        usernameTextfield=new JTextField(100);
        usernameTextfield.setBounds(80,250,250,25);
        jpanel.add(usernameTextfield);
        
        wrongUsername=new JLabel("Please Enter Your Unique Username atleast 8 Characters");
        wrongUsername.setBounds(10,280,300,25);
        wrongUsername.setForeground(Color.red);
        wrongUsername.setVisible(false);
        jpanel.add(wrongUsername);
        
        JLabel passwordLabel=new JLabel("Password:");
        passwordLabel.setBounds(10,310,70,25);
        jpanel.add(passwordLabel);
        
        passwordTextfield=new JTextField(100);
        passwordTextfield.setBounds(80,310,250,25);
        jpanel.add(passwordTextfield);
        
        wrongPassword=new JLabel("Please Enter your password atleast 8 Characters");
        wrongPassword.setBounds(10,340,300,25);
        wrongPassword.setForeground(Color.red);
        wrongPassword.setVisible(false);
        jpanel.add(wrongPassword);
        
        registerButton=new JButton("Register");
        registerButton.setBounds(220, 370, 90, 30);
        jpanel.add(registerButton);      
        registerButton.setActionCommand("Register");
        registerButton.addActionListener(this);     
        
        cancelButton=new JButton("Cancel");
        cancelButton.setBounds(40,370,90,30);
        jpanel.add(cancelButton);      
        cancelButton.setActionCommand("Cancel");
        cancelButton.addActionListener(this);  
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("Register")) 
        {
                //calls the function which sets the values to pizza class and function which returns pizza class object
                UserDetails ud=setUserDetails();
                
                //creating object of database class file to add data to database
                PizzaDeliveryDatabase pdd=new PizzaDeliveryDatabase();
                if( pdd.registerUser(ud))
                {
                    JOptionPane.showMessageDialog(null, "Registeration Sucessful !!!", "Info Saved", JOptionPane.INFORMATION_MESSAGE);
                    jframe.dispose();
                    new LoginForm(); 
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Sorry Information Not Saved", "Error", JOptionPane.ERROR_MESSAGE);
                }
        }
        else if(e.getActionCommand().equals("Male")||e.getActionCommand().equals("Female")||e.getActionCommand().equals("Others")) 
        {
                //do Nothing
        }
        else if(e.getActionCommand().equalsIgnoreCase("Cancel")) 
        {
            System.out.println("Cancel Button Clicked");
             jframe.dispose();
            new LoginForm(); 
        }
        else 
        {
            System.out.println("command not recognized");
        }
    }
    UserDetails setUserDetails()
    {
        UserDetails ud=new UserDetails();
        ud.phoneNo=Long.parseLong(phonenoTextfield.getText());
        ud.Gender=genderButtonGroup.getSelection().getActionCommand();
        ud.firstName=firstnameTextfield.getText();
        ud.lastName=lastnameTextfield.getText();
        ud.setUsername(usernameTextfield.getText());
        ud.setPassword(passwordTextfield.getText());
       return ud;
    }
}
