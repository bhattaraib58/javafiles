/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;
import java.util.Scanner;
/**
 *
10.	WAP to convert meter into centimeter. 

 * @author bhattaraib58
 */
public class MeterToCentimeter
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the Value in Meter: ");
        float meter=scan.nextFloat();
        float centimeter=meter*100;
        System.out.println("Value in Centimeter is: "+centimeter);
        scan.close();
    }
}
