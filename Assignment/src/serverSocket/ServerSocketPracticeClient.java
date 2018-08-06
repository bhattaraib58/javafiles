/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverSocket;

import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bhattaraib58
 */
public class ServerSocketPracticeClient
{
    public static void main(String[] args)
    {
        try
        {
            Socket socket=new Socket("localhost",3578);
            System.out.println("Client Connection Established");
        } 
        catch (IOException ex)
        {
                System.out.println(ex);
        }
    }
}
