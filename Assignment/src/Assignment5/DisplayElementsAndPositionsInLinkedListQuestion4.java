/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment5;
import java.util.LinkedList;
/**
 *
 * @author bhattaraib58
 */
public class DisplayElementsAndPositionsInLinkedListQuestion4
{
    public static void main(String[] args)
    {
        LinkedList<Integer>linklist=new LinkedList<Integer>();
        linklist.add(2);
        linklist.add(5);
        linklist.add(15);
        linklist.add(25);
        System.out.println(linklist);
        System.out.println("Items in link list ::");
        int index;
        
   
        int i,data2;
        for(i=0;i<linklist.size();i++)
        {
                data2=(int)linklist.get(i);
                System.out.println(data2);
                index = linklist.indexOf(data2);
                System.out.println(" at Index ::"+index);
        }
    }
}
