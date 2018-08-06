/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverSocket.chatsystem.user1;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
/**
 *
 * @author bhattaraib58
 */
public class ServerWaitingForConnection
{
    Socket socket=null;
    ServerSocket serverSocket;
    InetAddress localHost;
    JFrame jframe;
    public ServerWaitingForConnection()
    {
        try
        {
            localHost = InetAddress.getLocalHost();
            serverSocket=new ServerSocket(1234);
            
            waitingForConnectionGraphics();
                    
            socket=serverSocket.accept();
            if(socket!=null)
            {
                System.exit(0);
            }
        } 
        catch (IOException ex)
        {
                System.out.println(ex);
        }
    }
    
    void waitingForConnectionGraphics()
    {
        jframe=new JFrame("Server Waiting");
        jframe.setSize(400,500);
        jframe.setLocationRelativeTo(null);
        jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
        jframe.setVisible(true);
        
        JPanel jpanel=new JPanel();
        jpanel.setLayout(null);
        jframe.add(jpanel);
                
        String lh=localHost.toString();
        JLabel localHostLabel=new JLabel("Local IP Address:: "+lh);
        localHostLabel.setBounds(50,10,300,25);
        jpanel.add(localHostLabel);
        
        JLabel portNo=new JLabel("Port No:: 1234");
        portNo.setBounds(50,40,120,25);
        jpanel.add(portNo);
        
        JLabel waitingLabel=new JLabel("Waiting For Connection !!!");
        waitingLabel.setBounds(50,80,200,25);
        jpanel.add(waitingLabel);
        
    }
    public static void main(String[] args)
    {
        new ServerWaitingForConnection();
    }
    
}
