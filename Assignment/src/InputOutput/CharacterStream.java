/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InputOutput;
import java.io.*;
/**
 *
 * @author bhattaraib58
 */
public class CharacterStream
{
    
    public static void main(String[] args) throws IOException
    {
        File file1=new File("E:\\Pendings\\EX\\Russian.txt");
        File file2=new File("E:\\Pendings\\EX\\normal.txt");
       try
       {
            if(!file1.isFile())
           {
               file1.createNewFile();
               System.out.println("File1 Created");
           }
           if(!file2.isFile())
           {
               file2.createNewFile();
               System.out.println("File 2 Created");
           }
       }
       catch(IOException ex)
       {
           System.out.println(ex);
       }
       FileReader in = null;
      FileWriter out = null;

      try 
      {
         in = new FileReader(file1);
         out = new FileWriter(file2);
         
         int c;
         while ((c = in.read()) != -1) 
         {
            out.write(c);
//            
//Все приветствуют Советский Союз!
//Да здравствует империя!
//Пусть империя воссоединится !!!
         }
            System.out.println("File Data Transfer Complete !!");
      }
    catch(IOException ex)
    {
         System.out.println(ex);
    }
    catch(Exception ex)
    {
         System.out.println(ex);
    }
      finally 
      {
         if (in != null) 
         {
            in.close();
         }
         if (out != null) 
         {
            out.close();
         }
      }

    }
}
