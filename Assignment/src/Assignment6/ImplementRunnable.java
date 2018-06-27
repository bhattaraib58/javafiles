/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6;

/**
 *Create a single class with name “ImplementRunnable”. 
 * In ImplementRunnable there should be 2 other child classes which implements Runnable interface.
First child class should print all the prime number from 1 to 100 
Second child class should print all the prime number from 300 to 400 

 * @author Admin
 */


class Thread6 implements Runnable 
{
    Thread t1;
    Thread6(String name)
    {
        t1=new Thread(this);
        t1.setName("Biplap");
        t1.start();
    }
    @Override
    public void run()
    {  
        for (int i = 1; i < 100; i++)
        {
            System.out.println(t1.getName());
        }
                
    }
}

public class ImplementRunnable
{
    public static void main(String[] args)
    {
        
    }
}
