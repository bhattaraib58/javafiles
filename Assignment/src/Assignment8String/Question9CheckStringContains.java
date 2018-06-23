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
public class Question9CheckStringContains
{
    public static void main(String[] args)
    {
        String str1="Hello World";
        String str2="Hello";
        boolean check=str1.contains(str2);
        System.out.println("String str1 ='"+str1+"'contains str2 ='"+str2+"' ::"+check);
        check=str1.endsWith(str2);
        System.out.println("String1 end with str2 ::"+check);
        check= str1.startsWith(str2);
        System.out.println("String1 starts with str2 ::"+check);
    }
}
