/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment5;

import java.util.ArrayList;

/**
 *
 * @author bhattaraib58
 */
public class RetreiveArrayElementQuestion1
{
    public static void main(String[] args)
    {
        ArrayList <Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(55);
        list.add(15);
        list.add(12);
        list.add(52);
        list.add(3);
        list.add(5);
        list.add(505);
        System.out.println("The elements in array list are:");
        
        System.out.println("new loop method");
        //colections loop
        for(Integer data:list)
        {
            System.out.println(data);
        }
        
        //old method
                int i=0,data2;
        //old method
        System.out.println("old loop method");
        for(i=0;i<list.size();i++)
        {
            data2=(int)list.get(i);
            System.out.println(data2);
        }
        System.out.println("Retreiving data element from index 1:");
        int data1=(int)list.get(1);
        System.out.println("The element at index 1 is ::"+data1);
    }
}
