/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverSocket;

/**
 *
 * @author bhattaraib58
 */
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class TcpserverChat {

     public static void main(String[] args) throws IOException, ClassNotFoundException {
           ServerSocket serversocket;
           Socket socket = null;
           ObjectInputStream ois=null;
           ObjectOutputStream oos=null;
               Scanner sca =null;
    
        try{
            serversocket =new ServerSocket(8888);
            socket=serversocket.accept();
            System.out.println("after connection");
            ois =new ObjectInputStream(socket.getInputStream());
            String clientstring=(String) ois.readObject();
            oos =new ObjectOutputStream(socket.getOutputStream());
            sca=new Scanner(System.in);
            String clientmessage=null;
           while(true)
            {
                clientmessage=sca.nextLine();
                oos.writeObject(clientmessage);
                String serverText=(String) ois.readObject();
                System.out.println("Server Message ::"+serverText);
                if(serverText.equalsIgnoreCase("bye"))
                {
                    System.exit(0);
                }
           
            }
        
        
    }finally{
            
            if(ois !=null)
            {
                ois.close();
            }
            
            if(oos !=null)
            {
                oos.close();
            }
            if(socket !=null)
            {
                socket.close();
            }
        }
    }   
}
