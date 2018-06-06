/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class IndexOfArrayOfElement
{
     public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int numericArray[] =
        {
            1, 2, 3, 4, 5, 6, 7, 8, 9, 0
        };
        System.out.print("Enter the Input: ");
        int userInput=scan.nextInt();
        int firstLoop = 0,index=50;
        
        //old concept
        for (firstLoop = 0; firstLoop < 9; firstLoop++)
        {
                if (numericArray[firstLoop]==userInput)
                {
                    index=firstLoop;
                  break;
                }
        }
        if(index!=50)
        {
            System.out.println("The index is in :"+(firstLoop+1));
        }
        else
        {
            System.out.println("Sorry the input is not found in array");
        }  
        scan.close();
    }
}
