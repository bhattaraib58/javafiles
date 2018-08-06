/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverSocket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bhattaraib58
 */
public class ServerSocketPracticeServer
{
    public static void main(String[] args)
    {
        Socket socket=null;
        try
        {
            ServerSocket sc=new ServerSocket(3578);
            socket=sc.accept();
            System.out.println("Connection Established");
        } 
        catch (IOException ex)
        {
            System.out.println(ex);
        }
        
    }
}
