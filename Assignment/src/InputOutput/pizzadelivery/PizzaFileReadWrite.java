/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InputOutput.pizzadelivery;

import InputOutput.Student;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class PizzaFileReadWrite
{
    public boolean writeFile(Pizza pizza)
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
}
