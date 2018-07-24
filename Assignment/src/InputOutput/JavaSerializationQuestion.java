/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InputOutput;

import java.io.Serializable;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author bhattaraib58
 * 1.	Define File and Object Serialization in Java Programming? Create a class Student having regId, name and gps as instance variable. 
 * Create a parameterized constructor to initialize the instance variable and a method createStudent(Student s) that will write that object  
 * to the file called “kist.dat” and another method to readStudent() that will read object  from the text file using Java Serialization interface. 
 * Supply values to the constructor using Scanner class. [2+2+ 8]
 */
class Student implements Serializable
{
    int regId;
    String name;
    double gps;  //grade per semester
    
    Student(int id,String name,double gps)
    {
        regId=id;
        this.name=name;
        this.gps=gps;
    }
    boolean createStudent(Student s)
    {
        try
        {
            ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("E:\\Pendings\\EX\\student.ser"));
            
            
            
            Student t=new Student(1485,"Lewis",3.5);
            
            Student u=new Student(1495,"Soonang",3.70);
            
            oos.writeObject(s);
            oos.writeObject(t);
            oos.writeObject(u);

            oos.close();
            System.out.println("Object Written in File");
        } 
        catch (FileNotFoundException ex)
        {
                System.out.println(ex);
                return false;
        }
        catch (IOException ex)
        {
                System.out.println(ex);
                return false;
        }
        return true;
    }

    boolean readStudent()
    {
        ObjectInputStream ois=null;
        try
        {
            ois=new ObjectInputStream(new FileInputStream("E:\\Pendings\\EX\\student.ser"));
            Student s;
            FileInputStream istream = new FileInputStream("E:\\Pendings\\EX\\student.ser");
  
            while( istream.available() > 0) // check if the file stream is at the end
            {
                s=(Student)ois.readObject();
                System.out.println("Id Of Student is::"+s.regId);
                System.out.println("Name Of Student is::"+s.name);
                System.out.println("Grade Of Student is::"+s.gps);
                System.out.println("");
            }
        } 
        catch(EOFException ex)
        {
            System.out.println("All Data Read !!");
        }
        //It is best practice to handle EOF in catch block due to no proper way to handel and find no of object in seriliazble.
        catch (FileNotFoundException ex)
        {
                System.out.println(ex);
                return false;
        }
        catch (IOException | ClassNotFoundException ex)
        {
                System.out.println(ex);
                return false;
        }
        finally
        {
            if(ois!=null)
            {
                try 
                {
                        ois.close();
                } 
                catch (IOException ex) 
                {
                }
            }
        }
        return true;
    }
}
public class JavaSerializationQuestion
{
    public static void main(String[] args)
    {
            Student s=new Student(1487,"Biplap",3.85);
            System.out.println("Data Written in File ::"+s.createStudent(s));
                                 
            System.out.println("Data Read From File ::"+s.readStudent());
    }
}