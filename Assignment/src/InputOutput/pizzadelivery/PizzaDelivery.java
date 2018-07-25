/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InputOutput.pizzadelivery;

import javax.swing.*;
import java.awt.*;
/**
 *
 * @author bhattaraib58
 */
public class PizzaDelivery
{
    JFrame jframe=new JFrame("Pizza Delivery");
    JTextField nameInput,phonenoInput;
    
    JLabel wrongName,wrongPhoneno;
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
        wrongName.setVisible(true);
        jpanel.add(wrongName);
        
        JLabel phonenoLabel=new JLabel("PhoneNO:");
        phonenoLabel.setBounds(10,70,70,25);
        jpanel.add(phonenoLabel);
        
        phonenoInput=new JTextField(100);
        phonenoInput.setBounds(80,70,250,25);
        jpanel.add(phonenoInput);

        wrong
    }
    public static void main(String[] args)
    {
        new PizzaDelivery();
    }
}
