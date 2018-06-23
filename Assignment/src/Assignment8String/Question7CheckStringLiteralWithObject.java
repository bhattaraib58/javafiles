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
public class Question7CheckStringLiteralWithObject
{
    public static void main(String[] args)
    {
        String str1="Hello World";
        String str2=new String("Hello World");
        boolean check=str1==str2;
        if(check)
            System.out.println("String Literal and Object are Equal");
        else
             System.out.println("String Literal and Object aren't Equal");
        System.out.println("As String Literal and Object arent same so for valid check::");
        check=str1.equals(str2);
        if(check)
            System.out.println("The value of both string are equal");
        else
            System.out.println("Value of both string arent equal");
    }
}
