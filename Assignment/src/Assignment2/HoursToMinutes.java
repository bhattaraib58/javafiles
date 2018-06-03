/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import java.util.Scanner;

/**
 *
11.	WAP to convert hours into minutes. 

 * @author bhattaraib58
 */
public class HoursToMinutes
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the Time of Hours: ");
        float hours=scan.nextFloat();
        float minutes=hours*60;
        System.out.println("Value in Minutes is: "+minutes);
        scan.close();
    }
}
