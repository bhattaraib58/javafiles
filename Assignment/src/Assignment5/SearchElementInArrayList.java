/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment5;

import java.util.ArrayList;

/**
 *Write a Java program to search an element in a array list.
 * @author bhattaraib58
 */
public class SearchElementInArrayList
{
    public static void main(String args[])
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
        
        ///JDK have the methods “contains(Object elem)” , “indexOf(Object elem)” , “lastIndexOf(Object elem) “, 
        //Using the methods, we can easily search an element in an ArrayList.
        int i=0,data;
        //old method
        for(i=0;i<list.size();i++)
        {
            data=(int)list.get(i);
            if(data==3)
                break;
        }
        System.out.println("Data 3 lies in index ::"+i);
        
        //using JDK method
        boolean Found = list.contains(3);   //for string list.contains("str");
        System.out.println("Does arraylist contain 3 ::"+Found);
        
        int index = list.indexOf(505);
        if(index == -1)
            System.out.println("ArrayList does not contain 505");
        else
            System.out.println("ArrayList contains 505 at index :" + index);

    }
    
}
