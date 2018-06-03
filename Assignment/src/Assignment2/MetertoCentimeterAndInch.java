/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import java.util.Scanner;

/**
 *
 * @author bhattaraib58
 */
public class MetertoCentimeterAndInch
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the distance between two places in Meter: ");
        float meter=scan.nextFloat();
        float centimeter=meter*100;
        double inch;
        inch = meter*39.3701;
        System.out.println(" The distance between two places in Centimeter is: "+centimeter);
        System.out.println(" The distance between two places in Inch is: "+inch);
        scan.close();
    }
    
}
