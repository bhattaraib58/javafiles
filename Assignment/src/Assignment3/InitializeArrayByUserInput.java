/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;
import java.util.Scanner;
/**
 *
 * @author bhattaraib58
 */
public class InitializeArrayByUserInput
{
    public static void main(String[] args)
    {
        
       Scanner scan=new Scanner(System.in);
       
       //13a	Ask if array is single or multi dimensional
        System.out.print("Enter the type of array (Single(Enter 1) or MultiDimensional(Enter 2)): ");
       int type=scan.nextInt();
       int i=0,j=0;
       
        if(type==1)
        {
            //13 b	Ask For the size of the array
            System.out.print("Enter the size of Array: ");
            int size=scan.nextInt();
            
            //13.	Write a Java program to initialize array by user input
            int[] userInputArray;
            userInputArray=new int[size];
            System.out.println("The size of new array is: "+userInputArray.length);
            
            //13c.	Ask for every values in the array
            System.out.println("Enter the Values of Matrix : ");
            for(i=0;i<userInputArray.length;i++)
            {
                    System.out.print("Matrix "+i+": ");
                    userInputArray[i]=scan.nextInt();
                    System.out.println("");
            }
            //13d.	Display those values in relevant form. 
            System.out.println("The Matrix is: ");
            for(i=0;i<userInputArray.length;i++)
            {
                System.out.println(userInputArray[i]+"   ");
            }
            scan.close();
        }
        else
        {
             //13 b	Ask For the size of the array
            System.out.print("Enter the row size of Array: ");
            int rowSize=scan.nextInt();
            System.out.print("Enter the column size of Array: ");
            int columnSize=scan.nextInt();
            int[][] userInputArray;
            userInputArray=new int[rowSize][columnSize];
            System.out.println("The row size of new array is: "+userInputArray.length+"  The column size is: "+userInputArray[1].length);
                        
            //13c.	Ask for every values in the array
            System.out.println("Enter the Values of Matrix : ");
            for(i=0;i<userInputArray.length;i++)
            {
                for(j=0;j<userInputArray[1].length;j++)
                {
                    System.out.print("Matrix "+i+j+": ");
                    userInputArray[i][j]=scan.nextInt();
                }
                System.out.println("");
            }
            
            //13d.	Display those values in relevant form. 
            System.out.println("The Matrix is: ");
            for(i=0;i<userInputArray.length;i++)
            {
                for(j=0;j<userInputArray[1].length;j++)
                {
                    System.out.print(userInputArray[i][j]+"   ");
                }
                System.out.println("");
            }
            scan.close();
        }
    }
}
