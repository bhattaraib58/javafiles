/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6;

/**
 *Create a single class name “ExtendThread”. 
 * In MainThread there should be 3 other child classes which extends thread class.
First child class should print from 1 to 10 with sleep interval of 1 second
Second child class should print from 11 to 20 with sleep interval of 2 second
Third child class should print from 21 to 30 with no sleep interval
Print the output in respective run methods of every child class

 * @author Admin
 */
class Thread1 extends Thread
{
    Thread1(String name)
    {
        super(name);
        start();
    }
    @Override
    public void run()
    {
        for (int i = 1; i < 10; i++)
        {
            System.out.println("In name="+getName()+" Value of i="+i);
            try
            {
                sleep(1000);
            }
            catch(Exception e)
            {
                
            }
        }
    }
}

class Thread3 extends Thread
{
    Thread3(String name)
    {
        super(name);
        start();
    }
    @Override
    public void run()
    {
        for (int i = 21; i < 30; i++)
        {
            System.out.println("In name="+getName()+" Value of i="+i);
        }
    }
}
class Thread2 extends Thread
{
    Thread2(String name)
    {
        super(name);
        start();
    }
    @Override
    synchronized public void run()
    {
        for (int i =11; i < 20; i++)
        {
            System.out.println("In name="+getName()+" Value of i="+i);
            try
            {
                sleep(2000);
            }
            catch(Exception e)
            {
                
            }
        }
    }
}
public class ExtendThread
{
    public static void main(String[] args)
    {
        Thread1 t1=new Thread1("Thread1");
        System.out.println(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MAX_PRIORITY);
        Thread2 t2=new Thread2("Thread2");
        Thread3 t3=new Thread3("Thread3");
    }
}
