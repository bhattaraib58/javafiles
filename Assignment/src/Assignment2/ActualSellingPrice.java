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
public class ActualSellingPrice
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the Marked Price of Product:");
        float markPrice=scan.nextFloat();
        float discount=markPrice*30/100;
        float sellingPrice=markPrice-discount;
        System.out.println("The discount of product is:"+discount);
        System.out.println("The selling Price of product is:"+sellingPrice);
        scan.close();
    }
}
