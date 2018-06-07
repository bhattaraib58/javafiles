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
public class Sumof10sEqual30
{
    public static boolean checkEquals30(int[] userInputArray)
    {
        int sum=0;
        for(int i=0;i<10;i++)
        {
            sum+=userInputArray[i];
        }
        if(sum==30)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int[] userInputArray=new int[10];
        int i=0;
        System.out.println("Enter 10 values: ");
        for(i=0;i<10;i++)
        {
            System.out.print("Enter "+(i+1)+" Value: ");
            userInputArray[i]=scan.nextInt();
        }
        if(!checkEquals30(userInputArray))
        {
            System.out.println("Sorry the sum of no is not equal to 30");
        }
        else
        {
            System.out.println("Congrats ! The sum of numbers is equal to thirty.");
        }
        scan.close();
    }
    
}
