/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;
import java.util.Scanner;
/**
 *
14.	WAP to input radius of circle then find circumference and area. 

 * @author bhattaraib58
 */
public class CircumferenceAndAreaOfCircle
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the radius of Circle: ");
        float radius=scan.nextFloat();
        double area=Math.PI*radius*radius;
        double circumference=2*Math.PI*radius;
        System.out.println("Area of Circle is: "+area);
        System.out.println("Circumference of Circle is: "+circumference);
        scan.close();
    }
    
}
