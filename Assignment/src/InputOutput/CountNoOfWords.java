/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InputOutput;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author bhattaraib58
 */
public class CountNoOfWords
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
       
        System.out.println("Path:"+file1.getPath());
       FileReader in = null;
      FileWriter out = null;

      try 
      {
         in = new FileReader(file1);
         out = new FileWriter(file2);

            System.out.println("File Data Transfer Complete !!");
            
            int data;
            int previousData1=0,previousData2=0;
            int counter=0;
            System.out.println("No of Words are::");
            while((data=in.read())!=-1)
            {
                if((previousData1==32&data!=32)||(previousData2==13&previousData1==10&data!=10&data!=32&data!=13))
                {
                    counter++;
                }
                previousData2=previousData1;
                previousData1=data;
//                System.out.println(data);
            }
            System.out.println(counter+1);
            
            Scanner scan=new Scanner("E:\\Pendings\\EX\\Russian.txt");
            int count=0;
            while(scan.hasNext())
            {
                scan.next();
//                System.out.println("File"+scan.next());
                count++;
            }
            System.out.println("The no of words in file is::"+count);
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
