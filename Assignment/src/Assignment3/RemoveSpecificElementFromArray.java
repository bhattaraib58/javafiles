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
public class RemoveSpecificElementFromArray
{
    public static void main(String[] args)
    {
    Scanner scan = new Scanner(System.in);
    int[] newArray={1,233,23,24,24,2,342,32,3,24};
    System.out.println("The array is:");
    int i=0,j=0;
    for(i=0;i<newArray.length;i++)
    {
        System.out.println(newArray[i]);
    }
    System.out.print("Enter a number to remove from array: ");
    int userInput=scan.nextInt();
    int otherArray[]=new int[12];
    for(i=0;i<newArray.length;i++)
    {
        if(userInput!=newArray[i])
        {
            otherArray[j]=newArray[i];
            j++;
        }
                
    }
    System.out.println("The new array is:");
    for(i=0;i<otherArray.length;i++)
    {
        System.out.println(otherArray[i]);
    }
}
}