/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment8String;

import java.util.Scanner;
/**
 *
 * @author bhattaraib58
 */
public class Question11TrimWhitespaces
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the String with white Spaces:: ");
        String userInput=scan.next();
        userInput=userInput.trim();
        System.out.println("The output with whitespaces trimed ::"+userInput);
        scan.close();
    }
    
}
