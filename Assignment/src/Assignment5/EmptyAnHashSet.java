/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment5;
import java.util.HashSet;
import java.util.Set;
/**
 *5.	Write a Java program to empty an hash set.
 * @author Admin
 * in hashset there is no duplicate value
 * hashset dont put values in order they are kept in hash value order
 * null cant be kept in hashset
 * 
 * in hashtable there is form of key and value
 * ctrl+shift+r         alt+shift+a to select similar codes
 * 
 * java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
* 
* use generics
 */
public class EmptyAnHashSet
{
    public static void main(String[] args)
    {
        Set<Integer> hashSet=new HashSet<Integer>();
        hashSet.add(25);
        hashSet.add(2);
        hashSet.add(13);
        hashSet.add(3);
        hashSet.add(5);
        hashSet.add(1);
        Integer data1;
        
        System.out.println("Items are ::");
        for(Object data:hashSet)
        {
            data1=(Integer)data;
            System.out.println(data1);
        }
        hashSet.clear();
        System.out.println("Items after emptying ::");
        for(Object data:hashSet)
        {
            data1=(Integer)data;
            System.out.println(data1);
        }
    }
}
