package Assignment2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author bhattaraib58
 */
public class TotalPrice
{
    private float quantities;
    private float pricePerQuantity;
    public static float totalPrice(float quantities, float pricePerQuantity)
    {
        return (quantities*pricePerQuantity);
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the Quantity:");
        float quantities=scan.nextFloat();
        System.out.print("Enter the Price per Quantity:");
        float pricePerQuantity=scan.nextFloat();
        System.out.println("The Total Price of Item is: "+TotalPrice.totalPrice(quantities, pricePerQuantity));
        scan.close();
    }
    
}
