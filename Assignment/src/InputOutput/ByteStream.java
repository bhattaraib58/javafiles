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
public class ByteStream
{
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        File file=new File("E:\\Pendings\\EX\\f.txt");
        File file1=new File("E:\\Pendings\\EX\\x.txt");
        if(file.isFile())
        {
            FileInputStream fis=new FileInputStream(file);
            FileOutputStream fos=new FileOutputStream(file1);
            if(!file1.isFile())
            {
                file1.createNewFile();
            }
            int data;
            System.out.println("Data are::");
            while((data=fis.read())!=-1)
            {
                fos.write(data);
            }
        }
        else
        {
            System.out.println("File not found check Directory");
        }
    }
}
