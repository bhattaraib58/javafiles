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
public class PizzaDelivery implements ActionListener
{
    JFrame jframe=new JFrame("Pizza Delivery");
    JTextField nameInput,phonenoInput;
    
    JLabel wrongName,wrongPhoneno,wrongPizzaType,wrongPizzaSize,wrongToppings;
    JComboBox pizzaTypeCombo;
    ButtonGroup pizzaSizeGroup;
    JCheckBox extraCheese,salami,sausage,pepproni;
    PizzaDelivery()
    {
        jframe.setSize(400,500);
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
        
        JLabel id=new JLabel("Name:");
        id.setBounds(10,10,70,25);
        jpanel.add(id);
        
        nameInput=new JTextField(100);
        nameInput.setBounds(80,10,250,25);
        jpanel.add(nameInput);
        
        wrongName=new JLabel("Please Enter atleast 4 Characters From A-Z Only");
        wrongName.setBounds(10,40,300,25);
        wrongName.setForeground(Color.red);
        wrongName.setVisible(false);
        jpanel.add(wrongName);
        
        JLabel phonenoLabel=new JLabel("Phone NO:");
        phonenoLabel.setBounds(10,70,70,25);
        jpanel.add(phonenoLabel);
        
        phonenoInput=new JTextField(100);
        phonenoInput.setBounds(80,70,250,25);
        jpanel.add(phonenoInput);

        wrongPhoneno= new JLabel("Please Enter you Phone no From 0-9 Only Containing 10 numbers");
        wrongPhoneno.setBounds(10,100,380,25);
        wrongPhoneno.setForeground(Color.red);
        wrongPhoneno.setVisible(false);
        jpanel.add(wrongPhoneno);
        
        JLabel pizzaTypeLabel=new JLabel("Pizza Type:");
        pizzaTypeLabel.setBounds(10,130,70,25);
        jpanel.add(pizzaTypeLabel);
        
        String[] pizzaType={"[Select Program]","Thick_Crust","Thin_Crust","Pan"};
        pizzaTypeCombo=new JComboBox(pizzaType);
        pizzaTypeCombo.setBounds(100, 130, 200, 30);
        jpanel.add(pizzaTypeCombo);
        
        wrongPizzaType=new JLabel("Please Select Your Prefered Pizza Type");
        wrongPizzaType.setBounds(50,160,300,25);
        wrongPizzaType.setForeground(Color.red);
        wrongPizzaType.setVisible(false);
        jpanel.add(wrongPizzaType);
        
        JLabel pizzaSizeLabel=new JLabel("Pizza Size:");
        pizzaSizeLabel.setBounds(10,190,70,25);
        jpanel.add(pizzaSizeLabel);
        
        JRadioButton small=new JRadioButton("Small");
        small.setBounds(100,190,70,25);
        small.setActionCommand("Small");
        small.addActionListener(this);  
        
        JRadioButton medium=new JRadioButton("Medium");
        medium.setBounds(170,190,70,25);
        medium.setActionCommand("Medium");
        medium.addActionListener(this);  
        
        JRadioButton large=new JRadioButton("Large");
        large.setBounds(240,190,70,25);
        large.setActionCommand("Large");
        large.addActionListener(this);  
        
        wrongPizzaSize=new JLabel("Please Select At Least One Pizza Size");
        wrongPizzaSize.setBounds(50,210,300,25);
        wrongPizzaSize.setForeground(Color.red);
        wrongPizzaSize.setVisible(false);
        jpanel.add(wrongPizzaSize);
        
        pizzaSizeGroup=new ButtonGroup();
        pizzaSizeGroup.add(small);
        pizzaSizeGroup.add(medium);
        pizzaSizeGroup.add(large);

        jpanel.add(small);
        jpanel.add(medium);
        jpanel.add(large);
        
        JLabel osLabel=new JLabel("Toppings:");
        osLabel.setBounds(10,240,100,25);
        jpanel.add(osLabel);
        
        extraCheese=new JCheckBox("Extra Cheese");
        extraCheese.setBounds(100,240,90,25);
        jpanel.add(extraCheese);
        
        salami=new JCheckBox("Salami");
        salami.setBounds(200,240,70,25);
        jpanel.add(salami);
        
        sausage=new JCheckBox("Sausage");
        sausage.setBounds(100,270,90,25);
        jpanel.add(sausage);
        
        pepproni=new JCheckBox("Pepproni");
        pepproni.setBounds(200,270,90,25);
        jpanel.add(pepproni);
        
        wrongToppings=new JLabel("Please Select At Least One Toppings");
        wrongToppings.setBounds(50,300,300,25);
        wrongToppings.setForeground(Color.red);
        wrongToppings.setVisible(false);
        jpanel.add(wrongToppings);
        
        JButton submitButton=new JButton("Submit");
        submitButton.setBounds(220,330,100,30);
        jpanel.add(submitButton);
        submitButton.setActionCommand("Submit");
        submitButton.addActionListener(this);  
        
        JButton clearButton=new JButton("Clear");
        clearButton.setBounds(70,330,100,30);
        jpanel.add(clearButton);      
        clearButton.setActionCommand("Clear");
        clearButton.addActionListener(this);  
                        
        JButton showDataButton=new JButton("Show Data");
        showDataButton.setBounds(220,380,100,30);
        jpanel.add(showDataButton);
        showDataButton.setActionCommand("ShowData");
        showDataButton.addActionListener(this);  
                        
        JButton logoutButton=new JButton("Log Out");
        logoutButton.setBounds(70,380,100,30);
        jpanel.add(logoutButton);
        logoutButton.setActionCommand("logout");
        logoutButton.addActionListener(this);  
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {        
        if(e.getActionCommand().equals("Clear")) 
        {
            ClearInfo();
        }
        else if(e.getActionCommand().equals("Submit"))
        {
             //CheckInputValue is a Function in PizzaDelivery.java class which checks the input values using regex and others
            if(CheckInputValue())
            {
                //calls the function which sets the values to pizza class and function which returns pizza class object
                Pizza pizza=setPizzaClassValues();
                
                //creating object of database class file to add data to database
                PizzaDeliveryDatabase pdd=new PizzaDeliveryDatabase();
                
                //addPizzaToDatabase is a function/method which is boolean which returns true or false
                //so if true file has been written
                if( pdd.addPizzaToDatabase(pizza))
                {
                    JOptionPane.showMessageDialog(null, "New Info has Been Saved To Database", "Info Saved", JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Sorry Information Not Saved", "Error", JOptionPane.ERROR_MESSAGE);
                }
                ClearInfo();
            }
        }
        else if(e.getActionCommand().equals("ShowData")) 
        {
            jframe.dispose();
            PizzaDeliveryDatabase pdd=new PizzaDeliveryDatabase();
            pdd.viewPizzaDatabase();
        }
        else if(e.getActionCommand().equals("logout")) 
        {
            jframe.dispose();
            new LoginForm();
        }
        else if(e.getActionCommand().equals("Small")||e.getActionCommand().equals("Medium")||e.getActionCommand().equals("Large")) 
        {
                //do Nothing
        }
        else 
        {
            System.out.println("command not recognized");
        }
    }
    Pizza setPizzaClassValues()
    {
                //creating pizza class object Check Pizza Class in Pizza.java File
                Pizza pizza=new Pizza();
                //setting values to class variables
                String[] toppings=new String[4];
                pizza.setName(nameInput.getText());             
                pizza.setPhone(Long.parseLong(phonenoInput.getText()));
                pizza.setType((String)pizzaTypeCombo.getSelectedItem());
                pizza.setSize(pizzaSizeGroup.getSelection().getActionCommand());
              
                ///checking for values of Jcheckbox
                if(extraCheese.isSelected())  
                {  
                      toppings[0]=extraCheese.getText();
                } 
                if(salami.isSelected())  
                {  
                    toppings[1]=salami.getText();
                }
                if(sausage.isSelected())  
                {  
                    toppings[2]=sausage.getText();
                }
                if(pepproni.isSelected())  
                {  
                    toppings[3]=pepproni.getText();
                }
                pizza.setToppings(toppings);
                return pizza;
    }
    void ClearInfo()
    {
            nameInput.setText(null);
            phonenoInput.setText(null);
            pizzaSizeGroup.clearSelection();
            pizzaTypeCombo.setSelectedIndex(0);
            extraCheese.setSelected(false);
            salami.setSelected(false);
            sausage.setSelected(false);
            pepproni.setSelected(false);
            wrongName.setVisible(false);
            wrongPhoneno.setVisible(false);
            wrongPizzaType.setVisible(false);
            wrongPizzaSize.setVisible(false);
            wrongToppings.setVisible(false);
    }
    boolean CheckInputValue()
    {
        int errorBIT=0;
        String inputData;
        
        //checking for phone no
        inputData=phonenoInput.getText();
        if(!inputData.matches("\\d{10}"))
        {
            wrongPhoneno.setVisible(true);
            errorBIT=1;
        }
        else
        {
            wrongPhoneno.setVisible(false);
        }
        
        //checking for name
        inputData=nameInput.getText();
        if(!inputData.matches("[a-z A-Z]{4,}"))
        {
            wrongName.setVisible(true);
            errorBIT=1;
        }
        else
        {
            wrongName.setVisible(false);
        }
        
        //for pizza size
        if(pizzaSizeGroup.getSelection()==null)
        {
            wrongPizzaSize.setVisible(true);
            errorBIT=1;
        }
        else
        {
            wrongPizzaSize.setVisible(false);
        }
        
        //for pizza type check
         if(pizzaTypeCombo.getSelectedIndex()==0)
        {
            wrongPizzaType.setVisible(true);
            errorBIT=1;
        }
        else
        {
            wrongPizzaType.setVisible(false);
        }
        
         //for pizza toppings check
        if(extraCheese.isSelected()||salami.isSelected()||sausage.isSelected()||pepproni.isSelected())
        {
            wrongToppings.setVisible(false);
        }
        else
        {
            wrongToppings.setVisible(true);
            errorBIT=1;
        }
        if(errorBIT==1)
            return false;
        else
            return true;
    }
}
