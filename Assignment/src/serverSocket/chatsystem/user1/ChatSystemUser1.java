/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverSocket.chatsystem.user1;

/**
 *
 * @author bhattaraib58
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import java.net.ServerSocket;
import java.net.Socket;
import java.lang.InterruptedException;
import java.io.*;

class SocketConnectionSendMessage extends Thread
{
    Socket socket;            
    ObjectOutputStream oos=null;
    SocketConnectionSendMessage(Socket socket)
    {
        this.socket=socket;
        start();
    }
    @Override
    public void run()
    {
        try
        {
            oos =new ObjectOutputStream(this.socket.getOutputStream());
        } 
        catch (IOException ex)
        {
                System.out.println(ex);
        }
    }
    boolean sendMessage(String messageSent)
    {
        try
        {
            oos.writeObject(messageSent);
            AddMessageTextBox.textToDisplay("Server::\n"+messageSent);
            return true;
        } 
        catch (IOException ex)
        {
                System.out.println(ex);
                return false;
        }
    }
}
class SocketConnectionReceiveMessage extends Thread
{
    Socket socket;            
    ObjectInputStream ois=null;
    SocketConnectionReceiveMessage(Socket socket)
    {
        this.socket=socket;
        start();
    }
    @Override
    public void run()
    {
        try
        {
            ois =new ObjectInputStream(socket.getInputStream());
            String messageReceived="";
            while(true)
            {
                     messageReceived=(String) ois.readObject();
                     AddMessageTextBox.textToDisplay("Client::\n"+messageReceived);
            }
        } 
        catch (IOException ex)
        {
                System.out.println(ex);
        }
        catch (ClassNotFoundException ex)
        {
                System.out.println(ex);
        }
    }
}
class AddMessageTextBox 
{
    public static int yAxis=10;
    public static int textAreaNumber=0;
    
    public static void textToDisplay(String message)
    {
            ChatSystemUser1.textarea[textAreaNumber]=new JTextArea();
            ChatSystemUser1.textarea[textAreaNumber].setBounds(10, yAxis, 375, 25);
            ChatSystemUser1.textarea[textAreaNumber].setText(message);
            ChatSystemUser1.textarea[textAreaNumber].setWrapStyleWord(true);
            ChatSystemUser1.textarea[textAreaNumber].setEditable(false);
            ChatSystemUser1.textarea[textAreaNumber].setLineWrap(true);
            ChatSystemUser1.japanelMessageContent.add(ChatSystemUser1.textarea[textAreaNumber]);

            //refreshes the jframe
            ChatSystemUser1.jframe.revalidate();
            yAxis=yAxis+30;
            textAreaNumber++;
    }
}

public class ChatSystemUser1 implements ActionListener, KeyListener 
{
    public static JFrame jframe;
    public static JTextArea[] textarea=new JTextArea[100];
    public static JPanel japanelMessageContent;
    public static ObjectInputStream  ois;
    public static ObjectOutputStream oos;
    SocketConnectionSendMessage sendMessage;
    JTextField userInput;
    JButton sendReplyButton;
    ChatSystemUser1(Socket socket)
    {
        jframe=new JFrame("Server Messenger");
        jframe.setSize(450, 600);
        initComponents();
        jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
        jframe.setLocationRelativeTo(null);
        jframe.setVisible(true);
        
        
//        AddMessageTextBox.textToDisplay("<html>Hello World! \nblah blah blah</html>");
        new SocketConnectionReceiveMessage(socket);
        sendMessage=new SocketConnectionSendMessage(socket);
    }
    void initComponents()
    {
        JPanel jpanel=new JPanel();
        jpanel.setLayout(null);
        jframe.add(jpanel);
        
        
        japanelMessageContent=new JPanel();
        japanelMessageContent.setPreferredSize(new Dimension(410,550));
        
        //adding a new panel to add reply Message
        JPanel replyContentPanel = new JPanel();     
        
        userInput=new JTextField(25);
        userInput.setBounds(100,45,100,50);
        replyContentPanel.add(userInput);
        userInput.addKeyListener(this);
                
        sendReplyButton=new JButton("Send");
        sendReplyButton.setBounds(60, 80, 65, 40);
        replyContentPanel.add(sendReplyButton);
        sendReplyButton.setActionCommand("Send");
        sendReplyButton.addActionListener(this);
        sendReplyButton.addKeyListener(this);
        
        JScrollPane editorScroll = new JScrollPane(japanelMessageContent);
        jframe.getContentPane().add(editorScroll, BorderLayout.CENTER);
        
       // And finally add the below replyContentPanel to the frame
       jframe.add(replyContentPanel, BorderLayout.SOUTH);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {    
        if(e.getActionCommand().equals("Send"))
        {
                String inputData=userInput.getText();
                if(sendMessage.sendMessage(inputData))
                {
                    userInput.setText(null);
                }
        }
        else 
        {
            System.out.println("command not recognized");
        }
    }
    @Override
    public void keyTyped(KeyEvent e)
    {
    }

    @Override
    public void keyPressed(KeyEvent e)
    {
    }

    @Override
    public void keyReleased(KeyEvent e)
    {
        
        if (e.getKeyCode() == KeyEvent.VK_ENTER)
        {
            sendReplyButton.doClick();
        }
    }
}
