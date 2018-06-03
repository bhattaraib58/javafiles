/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import java.util.Scanner;

/**
 *
12.	WAP to convert Rupees into Dollars. 

 * @author bhattaraib58
 */
public class RupeeToDollar
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the money in Rupees: ");
        double rupees=scan.nextDouble();
        double dollar=rupees*0.0093;  
//1 United States Dollar equals 107.72 Nepalese Rupee as of 06/03/2018
        System.out.println("Value in Money in Dollar is: "+dollar);
        scan.close();
    }
}
