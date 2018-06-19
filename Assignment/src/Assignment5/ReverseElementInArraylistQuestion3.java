/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment5;
import java.util.ArrayList;
import java.util.Collections;

/**
 *3.	Write a Java program to reverse elements in a array list.
 * @author bhattaraib58
 */
public class ReverseElementInArraylistQuestion3
{
        public static void main(String[] args)
        {
                    ArrayList <Integer> newlist=new ArrayList<Integer>();
                    newlist.add(1);
                    newlist.add(2);
                    newlist.add(3);
                    newlist.add(4);
                    newlist.add(5);
                    System.out.println("the arraylist element are:");
                    for(Integer data1:newlist) //it is old for loop but hiding abstract
                    {
                        System.out.println(data1);
                    }
                    Collections.reverse(newlist);
                    System.out.println("the arraylist element after reverse are:");
                    for(Integer data1:newlist)
                    {
                        System.out.println(data1);
                    }
        }
}
