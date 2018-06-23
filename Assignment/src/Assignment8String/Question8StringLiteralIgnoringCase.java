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
public class Question8StringLiteralIgnoringCase
{
    public static void main(String[] args)
    {
        String str1="Hello";
        String str2="hello";
        boolean check=str1==str2;
        System.out.println("Both string are equal ::"+check);
        System.out.println("For igonoring case ::");
        check=str1.equalsIgnoreCase(str2);
        System.out.println("Strings are Equal Ignoring case ::"+check);
    }
}
