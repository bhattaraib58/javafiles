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
        t1.setName(name);
        t1.start();
    }
    @Override
    public void run()
    {  
        for (int i=2; i<100; i++)
        {
            for (int j=2; j<=i; j++)
            {
                if (i == j)
                    System.out.println("Prime numbers in ::"+t1.getName()+" is ::"+i);
                else if (i%j == 0)
                    break;
            }
        }
                
    }
}

class Thread7 implements Runnable 
{
    Thread t2;
    Thread7(String name)
    {
        t2=new Thread(this);
        t2.setName(name);
        t2.start();
    }
    @Override
    public void run()
    {  
        for (int i=300; i<400; i++)
        {
            for (int j=300; j<=i; j++)
            {
                if (i == j)
                    System.out.println("Prime numbers in ::"+t2.getName()+" is ::"+i);
                else if (i%j == 0)
                    break;
            }
        }
                
    }
}
public class ImplementRunnable
{
    public static void main(String[] args)
    {
        Thread6 t6=new Thread6("Thread1");
        Thread7 t7=new Thread7("Thread2");
    }
}
