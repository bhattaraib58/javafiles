/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwingFiles;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author LT-64
 */
public class Calculation implements ActionListener {

    JFrame jFrame;
    JTextField n1TextField;
    JTextField n2TextField;
    JTextField n3TextField;

    public Calculation() {
        jFrame = new JFrame("Java");
        jFrame.setSize(300, 300);
        JPanel panel = new JPanel();
        jFrame.add(panel);
        initComponents(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }

    public void initComponents(JPanel panel) {
        panel.setLayout(null);

        // n1 label
        JLabel n1 = new JLabel("N1");
        n1.setBounds(10, 10, 80, 25);
        panel.add(n1);
        // n1 textfield
        n1TextField = new JTextField(20);
        n1TextField.setBounds(100, 10, 160, 25);
        panel.add(n1TextField);
        //n2 label
        JLabel n2 = new JLabel("N2");
        n2.setBounds(10, 30, 80, 25);
        panel.add(n2);
        //n2 textfield
        n2TextField = new JTextField(20);
        n2TextField.setBounds(100, 30, 160, 25);
        panel.add(n2TextField);
        //result label
        JLabel n3 = new JLabel("Result");
        n3.setBounds(10, 50, 80, 25);
        panel.add(n3);
        //result textfield
         n3TextField = new JTextField(20);
        n3TextField.setBounds(100, 50, 160, 25);
        panel.add(n3TextField);

        //ok button
        JButton okBtn = new JButton("OK");
        okBtn.setBounds(85, 90, 60, 30);
        panel.add(okBtn);
        okBtn.setActionCommand("OK");
        okBtn.addActionListener(this);

        //ok button
        JButton exitBtn = new JButton("Exit");
        exitBtn.setBounds(150, 90, 60, 30);
        panel.add(exitBtn);
        exitBtn.setActionCommand("Exit");
        exitBtn.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("OK")) {
            String firstNumber = n1TextField.getText();
            String secondNumber = n2TextField.getText();
            System.out.println("first number :: "+firstNumber);
            System.out.println("second number :: "+secondNumber);
            System.out.println("action performed in ok button");
        }else if(e.getActionCommand().equalsIgnoreCase("EXIT")) {
            System.out.println("action performed in exit button");
            System.exit(0);
        }else {
            System.out.println("command not recognized");
        }
    }

    public static void main(String[] args) {
        new Calculation();
    }
}
