/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwingFiles;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author bhattaraib58
 */
public class SimpleCalculator implements ActionListener
{
    JFrame jframe;
    JTextField firstTextFieldNumber;
    JTextField secondTextFieldNumber;
    double reasult;
    double firstNumber=0,secondNumber=0;
    
    SimpleCalculator(String frameName)
    {
        jframe=new JFrame(frameName);
        jframe.setSize(300,200);
        initComponents();
        
        jframe.setLocationRelativeTo(null);
        jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
        jframe.setVisible(true);
    }
    public void initComponents()
    {
        JPanel jpanel=new  JPanel();
        jframe.add(jpanel);
        jpanel.setLayout(null);
        
        JLabel firstNumber=new JLabel("First Number");
        firstNumber.setBounds(5,20,100,30);
        jpanel.add(firstNumber);
        
        firstTextFieldNumber=new JTextField();
        firstTextFieldNumber.setBounds(105,20,150,30);
        jpanel.add(firstTextFieldNumber);
        
        
        JLabel secondNumber=new JLabel("Second Number");
        secondNumber.setBounds(5,50,100,30);
        jpanel.add(secondNumber);
        
        secondTextFieldNumber=new JTextField();
        secondTextFieldNumber.setBounds(105,50,150,30);
        jpanel.add(secondTextFieldNumber);
        
        JButton addButton=new JButton("ADD");
        addButton.setBounds(35,90,90,25);
        jpanel.add(addButton);
        addButton.setActionCommand("ADD");
        addButton.addActionListener(this);
        
        JButton subtractButton=new JButton("Subtract");
        subtractButton.setBounds(150,90,90,25);
        jpanel.add(subtractButton);
        subtractButton.setActionCommand("Subtract");
        subtractButton.addActionListener(this);
        
        JButton multiplyButton =new JButton("Multiply");
        multiplyButton.setBounds(35,120,90,25);
        jpanel.add(multiplyButton);
        multiplyButton.setActionCommand("Multiply");
        multiplyButton.addActionListener(this);
        
        JButton divisionButton=new JButton("Division");
        divisionButton.setBounds(150,120,90,25);
        jpanel.add(divisionButton);
        divisionButton.setActionCommand("Division");
        divisionButton.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(getValues())
        {
            if(e.getActionCommand().equals("ADD"))
            {
                reasult=secondNumber+firstNumber;
                showMessage("Add");
            }
            
            if(e.getActionCommand().equals("Subtract"))
            {
                reasult=firstNumber-secondNumber;
                showMessage("Subtract");
                
            }
            
            if(e.getActionCommand().equals("Multiply"))
            {
                reasult=secondNumber*firstNumber;
                showMessage("Multiply");
                
            }
            
            if(e.getActionCommand().equals("Division"))
            {
                try
                {
                    reasult=firstNumber/secondNumber;
                showMessage("Division");
                }
                catch(Exception ex)
                {
                    JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.ERROR_MESSAGE);
                }
                
            }
        }
    }
    void showMessage(String calculation)
    {
         JOptionPane.showMessageDialog(null, "The Reasult is ::"+reasult, "Calculation  "+calculation, JOptionPane.INFORMATION_MESSAGE);
    }
    boolean getValues()
    {
        String firstnumber=firstTextFieldNumber.getText();
                try
                {
                    
                    firstNumber=Double.parseDouble(firstnumber);
                }
                catch(Exception ex)
                {
//                    System.out.println("Enter Only Valid Number In First Text Field !!!");
                    JOptionPane.showMessageDialog(null, "Enter Only Valid Number In First Text Field !!!", "Error", JOptionPane.ERROR_MESSAGE);
                    firstTextFieldNumber.requestFocus();
                    return false;
                }
                
                String secondnumber=secondTextFieldNumber.getText();
                try
                {
                    secondNumber=Double.parseDouble(secondnumber);
                }
                catch(Exception ex)
                {
//                    System.out.println("Enter Only Valid Number In First Text Field !!!");
                    JOptionPane.showMessageDialog(null, "Enter Only Valid Number In Second Text Field !!!", "Error", JOptionPane.ERROR_MESSAGE);
                    secondTextFieldNumber.requestFocus();
                    return false;
                }
                return true;
    }
    public static void main(String[] args)
    {
        new SimpleCalculator("Simple Calculator");
    }
  
}
