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
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class TCpchatClient {
      public static void main(String[] args) throws IOException, ClassNotFoundException {
        Socket soc = null;
      ObjectInputStream ois=null;
           ObjectOutputStream oos=null;
              Scanner sca =null;
        
        try{
            soc=new Socket("192.168.0.2",8888);
      oos=new ObjectOutputStream(soc.getOutputStream());
      oos.writeObject("Hi");
      ois=new ObjectInputStream(soc.getInputStream());
      String ServerMessage=(String)ois.readObject();
       sca=new Scanner(System.in);
            String servermessage=null;
             while(true)
            {
                servermessage=sca.nextLine();
                oos.writeObject(servermessage);
                String clienttext=(String) ois.readObject();
                System.out.println("Server Message ::"+clienttext);
                if(clienttext.equalsIgnoreCase("bye"))
                {
                    System.exit(0);
                }
      
            System.out.println("message from server ::"+ServerMessage);  
            }
        }finally{
            if(ois !=null)
            {
                ois.close();
            }
            if(soc !=null)
            {
                soc.close();
            }
            if(oos!=null)
            {
                oos.close();
            }
            
        }
    }
    
}
