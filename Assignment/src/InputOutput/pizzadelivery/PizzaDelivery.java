/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InputOutput.pizzadelivery;

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
        
        JLabel id=new JLabel("User Name:");
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
        
        String[] pizzaType={"[Select Program]","Thick Crust","Thin Crust","Pan"};
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
        submitButton.setBounds(220,330,80,30);
        jpanel.add(submitButton);
        submitButton.setActionCommand("Submit");
        submitButton.addActionListener(this);  
        
        JButton clearButton=new JButton("Clear");
        clearButton.setBounds(70,330,70,30);
        jpanel.add(clearButton);      
        clearButton.setActionCommand("Clear");
        clearButton.addActionListener(this);  
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {        
        if(e.getActionCommand().equals("Clear")) 
        {
            ClearInfo();
        }
        else if(e.getActionCommand().equalsIgnoreCase("Submit")) 
        {
////            if(CheckInputValue())
//            {
//                JTextField nameInput,phonenoInput;
    
//    JLabel wrongName,wrongPhoneno,wrongPizzaType,wrongPizzaSize,wrongToppings;
//    JComboBox pizzaTypeCombo;
//    ButtonGroup pizzaSizeGroup;
//    JCheckBox extraCheese,salami,sausage,pepproni;
    
                System.out.println("Name"+nameInput.getText());
                System.out.println("Phone"+phonenoInput.getText());
                
                System.out.println("Type"+pizzaTypeCombo.getSelectedIndex());
                System.out.println("Size"+pizzaSizeGroup.getSelection().getActionCommand());
                JOptionPane.showMessageDialog(null, "Your Info has Been Saved", "Info Saved", JOptionPane.INFORMATION_MESSAGE);
////                ClearInfo();
//            }
        }
        else 
        {
            System.out.println("command not recognized");
        }
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
    public static void main(String[] args)
    {
        new PizzaDelivery();
    }
}
