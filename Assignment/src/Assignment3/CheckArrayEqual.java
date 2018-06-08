/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author bhattaraib58
 */
public class CheckArrayEqual
{
    public static void main(String args[])
    {
        int[] firstArray=new int[10];
        int[] secondArray=new int[10];
        int counter=0;
        for(int i=0;i<10;i++)
        {
            firstArray[i]=i+1;
            secondArray[i]=i+1;
        }
        //old concept 
        //for just checking if equal size of array
        if(firstArray.length==secondArray.length)
        {
            System.out.println("Both array size is equal");
            //two type for checking the value either counter or print on the check
            for(int i=0;i<10;i++)
            {
                if(firstArray[i]!=secondArray[i])
                {
                    System.out.println("Sorry both arrays is not equal.");
                    counter++;
                    break;
                }
            }
            
            if(counter!=0)
            {
                System.out.println("Sorry Both array not equal");
            }
            else
            {
                System.out.println("Both array and array size equal");
            }
        }
        else
        {
            System.out.println("Both array size not equal");
        }
        
        
        
        //using java function and class for checking equal array
        if(!Arrays.equals(firstArray,secondArray))
        {
            System.out.println("Sorry Both array not equal -java function");
        }
        else
        {
            System.out.println("Both arrays Equal -java Function");
        }
        
        
        
//        checking new concept
//        int newArray[]=new int[20];
//        System.arraycopy(firstArray,0,newArray,0,10);
//        System.arraycopy(secondArray,0,newArray,10,10);
//        System.out.println("First Matrix is: ");
//        for(int i=0;i<20;i++)
//        {
//                System.out.print(newArray[i]+"   ");
//            
//        }
    }
}
