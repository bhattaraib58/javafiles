/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;
import java.util.Scanner;
/**
 *
8.	WAP to read the age of three people then find average age. 

 * @author bhattaraib58
 */
public class AverageAge
{
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        System.out.println("How many users average age do you want ?");
        int peopleAges[]=new int[100];
        int noOfPeople=scan.nextInt();
        int totalAges=0;
        for(int i=0;i<noOfPeople;i++)
        {
            System.out.println("Enter "+(i+1)+" user age : ");
            peopleAges[i]=scan.nextInt();
            totalAges+=peopleAges[i];
        }
        float averageAge=(float)totalAges/noOfPeople;
        System.out.println("The average ages of "+noOfPeople+" is "+averageAge);
        scan.close();
    }
    
}
