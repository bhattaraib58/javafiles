/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment8String;

/**
 *
 * @author bhattaraib58
 */
public class Question6CheckStringLiteralsEqual
{
    public static void main(String[] args)
    {
        String str1="Hello World";
        String str2="Hello World";
        boolean output=str1==str2;
        if(output)
            System.out.println("Two String Literals are Identical");
        else
            System.out.println("Two String Literals arent equal");
    }
}
