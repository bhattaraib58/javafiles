/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InputOutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author bhattaraib58
 */
public class CheckDirectory
{
    public static void main(String[] args) throws IOException
    {
        File file=new File("E:\\Pendings\\pending files");
        System.out.println("Is Dirctory::"+file.isDirectory());
        System.out.println("Is File::"+file.isFile());
        //creates only if there is no file
        System.out.println("Creating File::"+file.createNewFile());
        
        System.out.println("Path of File ::"+file.getPath());
        
        System.out.println("Files::");
        for(String data:file.list())
        {
            System.out.println(data);
        }
    }
}
