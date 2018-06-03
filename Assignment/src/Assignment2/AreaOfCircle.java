/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;
import java.util.Scanner;
/**9.	WAP to find area of circle. 
 *
 * @author bhattaraib58
 */
public class AreaOfCircle
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the radius of Circle: ");
        float radius=scan.nextFloat();
        float area=(float)Math.PI*radius*radius;
        System.out.println("Area of Circle is: "+area);
        scan.close();
    }
}
