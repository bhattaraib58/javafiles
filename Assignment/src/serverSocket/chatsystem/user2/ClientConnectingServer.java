/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverSocket.chatsystem.user2;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.io.*;
/**
 *
 * @author bhattaraib58
 */
public class ClientConnectingServer implements ActionListener
{
    Socket socket=null;
    ServerSocket serverSocket;
    InetAddress localHost;
    int hostPort;
    
    JFrame jframe;
    JTextField serverAddress,portAddress;
    JLabel wrongServerAddress,wrongPortNo;
    public ClientConnectingServer()
    {
        ConnectionGraphics();
    }
    
    void ConnectionGraphics()
    {
        jframe=new JFrame("Client Connecting");
        jframe.setSize(470,250);
        
        JPanel jpanel=new JPanel();
        jpanel.setLayout(null);
        jframe.add(jpanel);
                                
        JLabel ipLabel=new JLabel("Enter Server IP Address::");
        ipLabel.setBounds(10,10,150,25);
        jpanel.add(ipLabel);
        
        serverAddress=new JTextField(100);
        serverAddress.setBounds(160,10,250,25);
        jpanel.add(serverAddress);
        
        
        wrongServerAddress=new JLabel("Please Enter correct IP Address (i.e:192.168.1.1)");
        wrongServerAddress.setBounds(10,40,300,25);
        wrongServerAddress.setForeground(Color.red);
        wrongServerAddress.setVisible(false);
        jpanel.add(wrongServerAddress);
        
        JLabel portLabel=new JLabel("Enter Port Address::");
        portLabel.setBounds(10,70,150,25);
        jpanel.add(portLabel);
        
        portAddress=new JTextField(100);
        portAddress.setBounds(160,70,250,25);
        jpanel.add(portAddress);

        wrongPortNo= new JLabel("Please Enter Correct Port No From 0-9 Only");
        wrongPortNo.setBounds(10,100,380,25);
        wrongPortNo.setForeground(Color.red);
        wrongPortNo.setVisible(false);
        jpanel.add(wrongPortNo);
        
        
        
        JButton submitButton=new JButton("Submit");
        submitButton.setBounds(220,130,100,30);
        jpanel.add(submitButton);
        submitButton.setActionCommand("Submit");
        submitButton.addActionListener(this);  
        
        JButton cancelButton=new JButton("Cancel");
        cancelButton.setBounds(70,130,100,30);
        jpanel.add(cancelButton);
        cancelButton.setActionCommand("Cancel");
        cancelButton.addActionListener(this);  
        
        
        jframe.setLocationRelativeTo(null);
        jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
        jframe.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {  
        if(e.getActionCommand().equals("Submit"))
        {
             //CheckInputValue is a Function in PizzaDelivery.java class which checks the input values using regex and others
            if(CheckInputValue())
            {
                try
                {
                    localHost=InetAddress.getByName(serverAddress.getText());
                    hostPort=Integer.parseInt(portAddress.getText());
                    socket=new Socket(localHost, hostPort);
                } 
                catch (UnknownHostException ex)
                {
                       System.out.println(ex);
                } 
                catch (IOException ex)
                {
                       System.out.println(ex);
                }
                if(socket!=null)
                {
                        System.out.println("Connected");
                        jframe.dispose();
                        new ChatSystemUser2(socket);
                }
            }
        }
        
        else if(e.getActionCommand().equals("Cancel")) 
        {
            System.exit(0);
        }
        else 
        {
            System.out.println("command not recognized");
        }
    }
    boolean CheckInputValue()
    {
        int errorBIT=0;
        String inputData;
        
        //checking for IP Address
        
        String ptn = "^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$";
//        Matcher mtch = ptn.matcher(ipAddr);
        inputData=serverAddress.getText();
        if(!inputData.matches(ptn))
        {
            wrongServerAddress.setVisible(true);
            errorBIT=1;
        }
        else
        {
            wrongServerAddress.setVisible(false);
        }
        
        //checking for Port NO
        inputData=portAddress.getText();
        if(!inputData.matches("[0-9]{1,8}"))
        {
            wrongPortNo.setVisible(true);
            errorBIT=1;
        }
        else
        {
            wrongPortNo.setVisible(false);
        }
        
        if(errorBIT==1)
            return false;
        else
            return true;
    }
    public static void main(String[] args)
    {
        new ClientConnectingServer();
    }
    
}
