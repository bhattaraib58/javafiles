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
public class ReverseANumber
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int userInput=scan.nextInt();
        int tuserInput=userInput;
        int reverse=0;
        int temp;
        while(userInput>0)
        {
            temp=userInput%10;
            reverse=(reverse*10)+temp;
            userInput=userInput/10;
        }
        System.out.println("Reverse of "+ tuserInput+" is: "+reverse);
        scan.close();
    }
    
}
