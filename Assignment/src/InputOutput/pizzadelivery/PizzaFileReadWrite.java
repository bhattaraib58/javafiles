/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InputOutput.pizzadelivery;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class PizzaFileReadWrite
{
    public boolean writePizzaFile(Pizza pizza)
    {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E:\\PizzaFiles\\pizza.ser")))
        {
            List<Pizza> pizzaList = new ArrayList<>();
            pizzaList.add(pizza);
            oos.writeObject(pizzaList);
            System.out.println("Object Written in File");
        }
        catch (FileNotFoundException ex)
        {
            System.out.println(ex);
            return false;
        } catch (IOException ex)
        {
            System.out.println(ex);
            return false;
        }
        return true;
    }
        public boolean appendPizzaFile(Pizza pizza)
    {
        ObjectOutputStream oos=null;
        try
        {
            ObjectInputStream ois  = new ObjectInputStream(new FileInputStream("E:\\PizzaFiles\\pizza.ser"));
            List<Pizza> pizzaList=new ArrayList<>();
            
            List<Pizza> readPizzaList=null;
            try
            {
                readPizzaList = (List<Pizza>) ois.readObject();
            }
            catch(EOFException ex)
            {
                
            }
            finally
            {
                ois.close();
            }
            if(readPizzaList!=null)
            {
                for (Pizza p: readPizzaList)
                {
                    pizzaList.add(p);
                }
            }
            pizzaList.add(pizza);
            oos = new ObjectOutputStream(new FileOutputStream("E:\\PizzaFiles\\pizza.ser"));
            oos.writeObject(pizzaList);
            System.out.println("Object Appened Written in File");
        }
        catch (FileNotFoundException ex)
        {
            System.out.println(ex);
            return false;
        } catch (IOException ex)
        {
            System.out.println(ex);
            return false;
        } 
        catch (ClassNotFoundException ex)
        {
            System.out.println(ex);
            return false;
        }
        finally
        {
            try
            {
                oos.close();
            } catch (IOException ex)
            {
                    System.out.println(ex);
            }
        }
        return true;
    }
    boolean readPizzaFile()
    {
        try( ObjectInputStream ois  = new ObjectInputStream(new FileInputStream("E:\\PizzaFiles\\pizza.ser")))
        {
            List<Pizza> pizzaList = (List<Pizza>) ois.readObject();
            int i=1,j=0;
            String [][]pizzaRowData=new String[15][6];
            for (Pizza p: pizzaList)
            {
                pizzaRowData[j][0]=Integer.toString(i);
                pizzaRowData[j][1]=p.getName();
                pizzaRowData[j][2]= Long.toString(p.getPhoneno());
                pizzaRowData[j][3]=p.getType();
                pizzaRowData[j][4]=p.getSize();
                String topping="";
                for(String s:p.getToppings())
                {
                    if(s!=null)
                    {
                        topping=topping+" "+s;
                    }
                }
                pizzaRowData[j][5]=topping;
                i++;
                j++;
            }
            if(pizzaRowData!=null)
            {
                ViewPizzaRequestData viewData=new ViewPizzaRequestData(pizzaRowData);
            }
            
//                System.out.println("");
//                System.out.println("Customer No::"+i);
//                System.out.println("Name Of Customer is::" + p.getName());
//                System.out.println("Phone No Of Customer is::" + p.getPhoneno());
//                System.out.println("Type Of Pizza is::" + p.getType());
//                System.out.println("Size Of Pizza is::" + p.getSize());
//                System.out.println("Selected Toppings are::");
        } 
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
        return true;
    }
}
