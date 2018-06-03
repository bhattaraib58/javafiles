/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;
import java.util.Scanner;
/**
 *6.	WAP to read basic salary then find tax and allowance, tax is 20% of basic salary and allowance is 40% of basic salary. Also find out net salary. 
 * @author bhattaraib58
 */
public class NetSalary
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter Your Salary:");
        float salary=scan.nextFloat();
        float tax=salary*20/100;
        float allowance=salary*40/100;
        float netSalary=salary-tax+allowance;
        System.out.println("Your Tax amount is: "+tax);
        System.out.println("Your Allowance amount is: "+allowance);
        System.out.println("Your Net Salary amount is: "+netSalary);
        scan.close();
    }
}
