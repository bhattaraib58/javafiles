/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InputOutput;

import javax.swing.*;
import java.awt.*;
/**
 *
 * @author bhattaraib58
 */
public class PizzaDelivery
{
    JFrame jframe=new JFrame("Pizza Delivery");
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
        id.setBounds(10,10,25,25);
        jpanel.add(id);
    }
    public static void main(String[] args)
    {
        new PizzaDelivery();
    }
}
